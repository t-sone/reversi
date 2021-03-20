package valueit.co.jp.reversi.application.service;

import java.util.stream.Stream;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import valueit.co.jp.reversi.domain.model.board.Board;
import valueit.co.jp.reversi.domain.model.board.BoardFactory;
import valueit.co.jp.reversi.domain.model.board.StartPosition;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static org.junit.jupiter.params.provider.Arguments.arguments;

@ExtendWith(SpringExtension.class)
@TestInstance(PER_CLASS)
public class StartPositionServiceTest {

    @Autowired
    StartPositionService service;

    Stream<Arguments> 初期状態の盤面一覧() {
        return Stream.of(arguments(StartPosition.historical,
                                   "[]"),
                         arguments(StartPosition.normal,
                                   "[{light: (d, 4)}, {dark: (e, 4)}, {dark: (d, 5)}, {light: (e, 5)}]")
        );
    }

    @ParameterizedTest
    @MethodSource("初期状態の盤面一覧")
    public void 初期状態の盤面を取得する(
            StartPosition startPosition,
            String 期待する盤面) {
        Board board = service.get(startPosition);
        assertThat(board.toString(), is(期待する盤面));
    }

    @TestConfiguration
    @EnableConfigurationProperties
    static class TestConfig {
        @Bean
        StartPositionService service() {
            return new StartPositionService(boardFactory());
        }

        @Bean
        BoardFactory boardFactory() {
            return new BoardFactory();
        }
    }
}
