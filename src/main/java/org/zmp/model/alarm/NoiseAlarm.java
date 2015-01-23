package org.zmp.model.alarm;

import org.zmp.model.event.NoiseEvent;

/**
 * Created by MM on 2014-11-18.
 */
public class NoiseAlarm extends Alarm {
    public NoiseAlarm(String name) {
        super(name, "noise");
        event = new NoiseEvent();
    }
}
