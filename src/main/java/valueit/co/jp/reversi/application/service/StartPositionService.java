package valueit.co.jp.reversi.application.service;

import org.springframework.stereotype.Service;

import valueit.co.jp.reversi.domain.model.board.Board;
import valueit.co.jp.reversi.domain.model.board.BoardFactory;
import valueit.co.jp.reversi.domain.model.board.StartPosition;

@Service
public class StartPositionService {

    final BoardFactory factory;

    public Board get(StartPosition startPositiion) {
        return factory.create(startPositiion);
    }

    public StartPositionService(BoardFactory factory) {
        this.factory = factory;
    }
}
