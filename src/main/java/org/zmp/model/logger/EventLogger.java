package org.zmp.model.logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MM on 2014-11-14.
 */
public class EventLogger {
    int i=1;
    private static EventLogger ourInstance = new EventLogger();

    public static EventLogger getInstance() {
        return ourInstance;
    }

    private EventLogger() {
    }

    public void pisz(String roomName){

        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy hh:mm:ss");
        System.out.println(i);
        i++;
    }
}
