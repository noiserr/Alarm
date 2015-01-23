package org.zmp.model.room;

/**
 * Created by MM on 2015-01-19.
 */
public class LivingRoom extends Room {
    public LivingRoom(int posX, int posY) {
        super(posX, posY, "Livingroom");
        addAlarms("window-move-noise");
    }
}
