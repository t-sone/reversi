package valueit.co.jp.reversi.application.service.board;

import org.springframework.stereotype.Service;

import valueit.co.jp.reversi.domain.model.board.Board;
import valueit.co.jp.reversi.domain.model.board.BoardFactory;
import valueit.co.jp.reversi.domain.model.board.StartPosition;

@Service
public class BoardService {

    final BoardFactory factory;

    public Board start(StartPosition startPosition) {
        return factory.create(startPosition);
    }

    public BoardService(BoardFactory factory) {
        this.factory = factory;
    }
}
