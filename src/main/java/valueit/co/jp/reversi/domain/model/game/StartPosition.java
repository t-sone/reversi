package valueit.co.jp.reversi.domain.model.game;

public enum StartPosition {
    original, othello;

    public boolean isOthello() {
        return this == othello;
    }
}
