package org.zmp.model.room;

/**
 * Created by MM on 2014-11-27.
 */
public class KitchenRoom extends Room {

    public KitchenRoom(int posX, int posY) {
        super(posX, posY, "Kitchen");
        addAlarms("window-noise-smoke-fire");
    }
}
