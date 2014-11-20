package org.zmp.model.alarm;

/**
 * Created by MM on 2014-11-18.
 */
public class SmokeAlarm extends Alarm {
    public SmokeAlarm(String name) {
        super(name);
        information = "Smoke";
        setText(information);
    }
}
