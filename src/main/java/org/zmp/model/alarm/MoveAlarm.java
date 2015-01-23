package org.zmp.model.alarm;

import org.zmp.model.event.MoveEvent;

/**
 * Created by MM on 2014-11-18.
 */
public class MoveAlarm extends Alarm {
    public MoveAlarm(String name) {

        super(name, "move");
        imgName = "thief";
        event = new MoveEvent();
    }
}
