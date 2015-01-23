package org.zmp.model.room;

/**
 * Created by MM on 2015-01-19.
 */
public class BedRoom extends Room {

    public BedRoom(int posX, int posY) {
        super(posX, posY, "BedRoom");
        addAlarms("window-smoke-move-fire");
    }
}
