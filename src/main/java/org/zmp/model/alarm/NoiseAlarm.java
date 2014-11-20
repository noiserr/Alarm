package org.zmp.model.alarm;

/**
 * Created by MM on 2014-11-18.
 */
public class NoiseAlarm extends Alarm
{
    public NoiseAlarm(String name) {
        super(name);
        information="Noise detected";
        setText("Noise");
    }
}
