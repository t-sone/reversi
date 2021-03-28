package valueit.co.jp.reversi.domain.model.player;

public class Players {
    private final Player light;
    private final Player dark;

    public Players() {
        this(new Player(),
             new Player());
    }

    public Players(Player light, Player dark) {
        this.light = light;
        this.dark = dark;
    }

    public Player light() {
        return light;
    }

    public Player dark() {
        return dark;
    }
}
