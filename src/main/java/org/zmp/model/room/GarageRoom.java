package org.zmp.model.room;

import org.zmp.model.alarm.*;

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
        buttonPanel.add(new WindowAlarm(name));
        buttonPanel.add(new SmokeAlarm(name));
        buttonPanel.add(new MoveAlarm(name));
//        buttonPanel.add(new NoiseAlarm(name));

    }
}
