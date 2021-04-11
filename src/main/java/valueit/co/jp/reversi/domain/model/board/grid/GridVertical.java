package valueit.co.jp.reversi.domain.model.board.grid;

public class GridVertical {
    private final int value;

    public GridVertical(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}
