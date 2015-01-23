package org.zmp.model.alarm;

import org.zmp.model.logger.EventLogger;

/**
 * Created by MM on 2014-11-27.
 *
 */
public class LockpadAlarm extends Alarm {
    public int numberOfTries =0;
    public LockpadAlarm(String name) {
        super(name, "lockpad");
    }

    @Override
    public void detect(){
        numberOfTries++;

        if(numberOfTries > 2){
            EventLogger.getInstance().printMessage(name, "Wrong PIN code, Sending Silent Alarm");
        }else{
            EventLogger.getInstance().printMessage(name, "Wrong PIN code");

        }
    }
}
