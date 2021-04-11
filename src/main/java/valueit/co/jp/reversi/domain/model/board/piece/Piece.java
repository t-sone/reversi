package valueit.co.jp.reversi.domain.model.board.piece;

import valueit.co.jp.reversi.domain.model.board.grid.Grid;
import valueit.co.jp.reversi.domain.model.player.Side;

public class Piece {
    private final Grid grid;
    private final Side side;

    public Piece(Grid grid, Side side) {
        this.grid = grid;
        this.side = side;
    }

    @Override
    public String toString() {
        return String.format("{%s: %s}", grid, side);
    }
}
