package org.zmp.model.room;

import org.zmp.model.alarm.FireAlarm;
import org.zmp.model.alarm.LockpadAlarm;

/**
 * Created by MM on 2014-11-27.
 */
public class CorridorRoom extends Room {

    public CorridorRoom(int posX, int posY) {
        super(posX, posY, "Corridor");
        addAlarms("fire-move-lockpad");

    }
}
