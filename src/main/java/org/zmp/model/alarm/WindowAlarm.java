package org.zmp.model.alarm;

import org.zmp.model.event.WindowEvent;

/**
 * Created by MM on 2014-11-18.
 */
public class WindowAlarm extends Alarm {
    public WindowAlarm(String name) {
        super(name, "window");
        event = new WindowEvent();
    }
}
