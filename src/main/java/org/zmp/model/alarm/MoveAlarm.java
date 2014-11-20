package org.zmp.model.alarm;

/**
 * Created by MM on 2014-11-18.
 */
public class MoveAlarm extends Alarm {
    public MoveAlarm(String name) {
        super(name);
        information ="Move detected";
        setText("Move");
    }
}
