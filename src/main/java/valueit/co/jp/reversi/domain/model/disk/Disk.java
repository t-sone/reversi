package valueit.co.jp.reversi.domain.model.disk;

public class Disk {

    private final Side side;

    public Disk(Side side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return side.name();
    }
}
