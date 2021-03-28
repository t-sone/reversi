package valueit.co.jp.reversi.domain.model.player;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.stereotype.Component;

import valueit.co.jp.reversi.domain.model.disk.Disk;
import valueit.co.jp.reversi.domain.model.disk.Side;

@Component
public class PlayersFactory {
    public Players create() {
        final Player light = createPlayer(Side.light);
        final Player dark = createPlayer(Side.dark);
        return new Players(light, dark);
    }

    private Player createPlayer(Side side) {
        final List<Disk> disks = createDisks(side);
        return new Player(side,
                          disks);
    }

    private List<Disk> createDisks(Side side) {
        final List<Disk> disks = new ArrayList<>();
        IntStream.rangeClosed(1, Player.MAX_DISK_COUNT)
                 .forEach(count -> disks.add(createDisk(side)));
        return disks;
    }

    private Disk createDisk(Side side) {
        return new Disk(side);
    }
}
