package valueit.co.jp.reversi.domain.model.board;

import java.util.List;

import org.springframework.stereotype.Component;

import valueit.co.jp.reversi.domain.model.game.StartPosition;
import valueit.co.jp.reversi.domain.model.player.disk.Disk;
import valueit.co.jp.reversi.domain.model.board.piece.Piece;
import valueit.co.jp.reversi.domain.model.board.piece.PieceHorizontal;
import valueit.co.jp.reversi.domain.model.board.piece.PieceVertical;
import valueit.co.jp.reversi.domain.model.player.Players;

@Component
public class BoardFactory {
    public Board create(StartPosition startPosition,
                        Players players) {
        return startPosition.isOthello() ?
               Board.of(diagonalPieces(players)) : Board.empty();
    }

    private List<Piece> diagonalPieces(Players players) {
        return List.of(
                createPiece(4, 4, players.light().takeDisk()),
                createPiece(5, 4, players.dark().takeDisk()),
                createPiece(4, 5, players.dark().takeDisk()),
                createPiece(5, 5, players.light().takeDisk())
        );
    }

    private Piece createPiece(int horizontal, int vertical, Disk disk) {
        return new Piece(new PieceHorizontal(horizontal),
                         new PieceVertical(vertical),
                         disk);
    }
}
