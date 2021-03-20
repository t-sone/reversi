package valueit.co.jp.reversi.domain.model.piece;

public class PieceHorizontal {
    private final int value;

    public PieceHorizontal(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Character.toString('a' + value - 1);
    }
}
