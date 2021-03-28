package valueit.co.jp.reversi.domain.model.board.piece;

public class PieceVertical {
    private final int value;

    public PieceVertical(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
