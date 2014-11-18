package org.zmp.model.alarm;

import org.zmp.model.logger.EventLogger;

import java.awt.*;

/**
 * Created by MM on 2014-11-13.
 */
public class FireAlarm extends Alarm {

    public FireAlarm(String name) {
        super(name);
        information="FIRE";
        setMargin(new Insets(3,15,3,15));
        setText(information);
    }

    @Override
    public void detect(){
        EventLogger.getInstance().pisz(name);

    }
}
