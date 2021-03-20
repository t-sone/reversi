package valueit.co.jp.reversi.domain.model.board;

import java.util.ArrayList;
import java.util.List;

import valueit.co.jp.reversi.domain.model.piece.Piece;

public class Board {
    private final List<Piece> pieces;

    public Board() {
        this(new ArrayList<>());
    }

    public Board(List<Piece> pieces) {
        this.pieces = pieces;
    }

    public static Board empty() {
        return new Board();
    }

    public static Board of(List<Piece> pieces) {
        return new Board(pieces);
    }

    @Override
    public String toString() {
        return pieces.toString();
    }
}
