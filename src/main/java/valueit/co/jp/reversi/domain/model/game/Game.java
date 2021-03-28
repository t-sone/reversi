package valueit.co.jp.reversi.domain.model.game;

import valueit.co.jp.reversi.domain.model.board.Board;
import valueit.co.jp.reversi.domain.model.player.Player;
import valueit.co.jp.reversi.domain.model.player.Players;

public class Game {
    private final StartPosition startPosition;
    private final Board board;
    private final Players players;

    public Game() {
        this(null,
             new Players(),
             new Board());
    }

    public Game(StartPosition startPosition,
                Players players,
                Board board) {
        this.startPosition = startPosition;
        this.board = board;
        this.players = players;
    }

    public Board board() {
        return board;
    }

    public Player lightPlayer() {
        return players.light();
    }

    public Player darkPlayer() {
        return players.dark();
    }
}
