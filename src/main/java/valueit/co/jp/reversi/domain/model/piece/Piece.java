package valueit.co.jp.reversi.domain.model.piece;

import valueit.co.jp.reversi.domain.model.disk.Disk;

public class Piece {
    private final PieceHorizontal horizontal;
    private final PieceVertical vertical;
    private final Disk disk;

    public Piece(PieceHorizontal horizontal,
                 PieceVertical vertical,
                 Disk disk) {
        this.horizontal = horizontal;
        this.vertical = vertical;
        this.disk = disk;
    }

    @Override
    public String toString() {
        return String.format("{%s: (%s, %s)}", disk, horizontal, vertical);
    }
}
