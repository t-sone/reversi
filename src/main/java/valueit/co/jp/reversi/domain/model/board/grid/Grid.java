package valueit.co.jp.reversi.domain.model.board.grid;

public class Grid {

    private final GridHorizontal horizontal;
    private final GridVertical vertical;

    public Grid(int horizontal, int vertical) {
        this.horizontal = new GridHorizontal(horizontal);
        this.vertical = new GridVertical(vertical);
    }

    @Override
    public String toString() {
        return String.format("%s%s", horizontal, vertical);
    }
}
