package valueit.co.jp.reversi.domain.model.board;

import java.util.List;

import org.springframework.stereotype.Component;

import valueit.co.jp.reversi.domain.model.disk.Disk;
import valueit.co.jp.reversi.domain.model.piece.Piece;
import valueit.co.jp.reversi.domain.model.piece.PieceHorizontal;
import valueit.co.jp.reversi.domain.model.piece.PieceVertical;

@Component
public class BoardFactory {
    public Board create(StartPosition startPosition) {
        return startPosition.isNormal() ?
               Board.of(diagonalPieces()) : Board.empty();
    }

    private List<Piece> diagonalPieces() {
        return List.of(
                createPiece(4, 4, Disk.ofLight()),
                createPiece(5, 4, Disk.ofDark()),
                createPiece(4, 5, Disk.ofDark()),
                createPiece(5, 5, Disk.ofLight())
        );
    }

    private Piece createPiece(int horizontal, int vertical, Disk disk) {
        return new Piece(new PieceHorizontal(horizontal),
                         new PieceVertical(vertical),
                         disk);
    }
}
