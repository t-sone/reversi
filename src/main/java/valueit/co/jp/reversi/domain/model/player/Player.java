package valueit.co.jp.reversi.domain.model.player;

import java.util.ArrayList;
import java.util.List;

import valueit.co.jp.reversi.domain.model.player.disk.Disk;

public class Player {
    public static final int MAX_DISK_COUNT = 32;

    private final Side side;
    private final List<Disk> disks;

    public Player() {
        this(null,
             new ArrayList<>());
    }

    public Player(Side side, List<Disk> disks) {
        this.side = side;
        this.disks = disks;
    }

    public Disk takeDisk() {
        return disks.remove(0);
    }

    public Integer diskCount() {
        return disks.size();
    }

    @Override
    public String toString() {
        return String.format("{ side: %s, disks: %d }", side.name(), diskCount());
    }
}
