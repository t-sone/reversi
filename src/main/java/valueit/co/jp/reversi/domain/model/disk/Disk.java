package valueit.co.jp.reversi.domain.model.disk;

public class Disk {

    private final DiskColor color;

    public Disk(DiskColor color) {
        this.color = color;
    }

    public static Disk ofLight() {
        return new Disk(DiskColor.light);
    }

    public static Disk ofDark() {
        return new Disk(DiskColor.dark);
    }

    @Override
    public String toString() {
        return color.name();
    }
}
