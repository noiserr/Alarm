package org.zmp.model.alarm;

/**
 * Created by MM on 2014-11-18.
 */
public class WindowAlarm extends Alarm {
    public WindowAlarm(String name) {
        super(name);
        information = "Opened window";
        setText("Window");
    }
}
