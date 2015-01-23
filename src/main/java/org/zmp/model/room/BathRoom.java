package org.zmp.model.room;

/**
 * Created by MM on 2015-01-19.
 */
public class BathRoom extends Room {
    public BathRoom(int posX, int posY) {
        super(posX, posY, "Bathroom");
        addAlarms("window-noise-fire");
    }
}
