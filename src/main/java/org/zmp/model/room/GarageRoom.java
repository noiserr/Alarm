package org.zmp.model.room;

import org.zmp.model.alarm.Alarm;
import org.zmp.model.alarm.FireAlarm;

import javax.swing.*;

/**
 * Created by MM on 2014-11-13.
 */
public class GarageRoom extends  Room {

    String name = "Garage";

    public GarageRoom(int posX, int posY) {
        super(posX, posY);
        roomName.setText(name);
        buttonPanel.add(new FireAlarm(name));
    }
}
