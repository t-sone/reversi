package valueit.co.jp.reversi.domain.model.disk;

public class Disk {

    private final Side color;

    public Disk(Side color) {
        this.color = color;
    }

    public static Disk ofLight() {
        return new Disk(Side.light);
    }

    public static Disk ofDark() {
        return new Disk(Side.dark);
    }

    @Override
    public String toString() {
        return color.name();
    }
}
