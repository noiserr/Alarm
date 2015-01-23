package org.zmp.model.room;

import org.zmp.model.alarm.*;

/**
 * Created by MM on 2014-11-13.
 */
public class GarageRoom extends  Room {


    public GarageRoom(int posX, int posY) {
        super(posX, posY, "Garage");
        addAlarms("fire-move-smoke-lockpad");

    }
}
