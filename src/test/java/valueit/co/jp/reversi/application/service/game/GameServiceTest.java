package valueit.co.jp.reversi.application.service.game;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static org.junit.jupiter.params.provider.Arguments.arguments;

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

import valueit.co.jp.reversi.domain.model.board.BoardFactory;
import valueit.co.jp.reversi.domain.model.game.StartPosition;
import valueit.co.jp.reversi.domain.model.game.Game;
import valueit.co.jp.reversi.domain.model.player.PlayersFactory;

@ExtendWith(SpringExtension.class)
@TestInstance(PER_CLASS)
public class GameServiceTest {
    @Autowired
    GameService service;

    Stream<Arguments> 初期状態の盤面一覧() {
        return Stream.of(
                arguments(StartPosition.original,
                        32, 32,
                        "[]"),
                arguments(StartPosition.othello,
                        30, 30,
                        "[{d4: light}, {e4: dark}, {d5: dark}, {e5: light}]")
        );
    }

    @ParameterizedTest
    @MethodSource("初期状態の盤面一覧")
    public void 初期状態の盤面を取得する(
            StartPosition startPosition,
            int 期待する白番の石数,
            int 期待する黒番の石数,
            String 期待する盤面) {
        Game game = service.start(startPosition);

        assertThat(game.lightPlayer().diskCount(), is(期待する白番の石数));
        assertThat(game.darkPlayer().diskCount(), is(期待する黒番の石数));
        assertThat(game.board().toString(), is(期待する盤面));
    }

    @TestConfiguration
    @EnableConfigurationProperties
    static class TestConfig {
        @Bean
        GameService service() {
            return new GameService(playersFactory(), boardFactory());
        }

        @Bean
        PlayersFactory playersFactory() {
            return new PlayersFactory();
        }

        @Bean
        BoardFactory boardFactory() {
            return new BoardFactory();
        }
    }
}
