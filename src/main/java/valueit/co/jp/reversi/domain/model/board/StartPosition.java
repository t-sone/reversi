package valueit.co.jp.reversi.domain.model.board;

public enum StartPosition {
    normal, historical;

    public boolean isNormal() {
        return this == normal;
    }

    public boolean isHistorical() {
        return this == historical;
    }
}
