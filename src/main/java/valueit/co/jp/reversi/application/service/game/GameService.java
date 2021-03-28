package valueit.co.jp.reversi.application.service.game;

import org.springframework.stereotype.Service;

import valueit.co.jp.reversi.domain.model.board.Board;
import valueit.co.jp.reversi.domain.model.board.BoardFactory;
import valueit.co.jp.reversi.domain.model.game.StartPosition;
import valueit.co.jp.reversi.domain.model.game.Game;
import valueit.co.jp.reversi.domain.model.player.Players;
import valueit.co.jp.reversi.domain.model.player.PlayersFactory;

@Service
public class GameService {
    private final PlayersFactory playersFactory;
    private final BoardFactory boardFactory;

    public Game start(StartPosition startPosition) {
        final Players players = playersFactory.create();
        final Board board = boardFactory.create(startPosition, players);

        return new Game(startPosition,
                        players,
                        board);
    }

    public GameService(PlayersFactory playersFactory,
                       BoardFactory boardFactory) {
        this.playersFactory = playersFactory;
        this.boardFactory = boardFactory;
    }
}
