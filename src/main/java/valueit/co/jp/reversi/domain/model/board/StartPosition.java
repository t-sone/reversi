package valueit.co.jp.reversi.domain.model.board;

public enum StartPosition {
    original, othello;

    public boolean isOthello() {
        return this == othello;
    }
}
