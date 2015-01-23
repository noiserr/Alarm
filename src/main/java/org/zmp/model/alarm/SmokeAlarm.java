package org.zmp.model.alarm;

import org.zmp.model.event.SmokeEvent;

/**
 * Created by MM on 2014-11-18.
 */
public class SmokeAlarm extends Alarm {
    public SmokeAlarm(String name) {
        super(name, "smoke");
        event = new SmokeEvent();
    }
}
