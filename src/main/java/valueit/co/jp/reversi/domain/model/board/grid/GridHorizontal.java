package valueit.co.jp.reversi.domain.model.board.grid;

public class GridHorizontal {
    private final int value;

    public GridHorizontal(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Character.toString('a' + value - 1);
    }
}
