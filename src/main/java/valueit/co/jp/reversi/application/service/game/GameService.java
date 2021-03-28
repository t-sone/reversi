package valueit.co.jp.reversi.application.service.game;

import org.springframework.stereotype.Service;

import valueit.co.jp.reversi.domain.model.board.BoardFactory;
import valueit.co.jp.reversi.domain.model.board.StartPosition;
import valueit.co.jp.reversi.domain.model.game.Game;
import valueit.co.jp.reversi.domain.model.player.PlayersFactory;

@Service
public class GameService {
    private final PlayersFactory playersFactory;
    private final BoardFactory boardFactory;

    public Game start(StartPosition startPosition) {
        // TODO 未実装
        return new Game();
    }

    public GameService(PlayersFactory playersFactory,
                       BoardFactory boardFactory) {
        this.playersFactory = playersFactory;
        this.boardFactory = boardFactory;
    }
}
