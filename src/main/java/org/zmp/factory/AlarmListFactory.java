package org.zmp.factory;

import org.zmp.model.alarm.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MM on 2014-12-14.
 */
public class AlarmListFactory {

    private String alarmSet;
    private String[] alarms;
    private String roomName;
    private List<Alarm> alarmList = new ArrayList<Alarm>();

    public AlarmListFactory(String roomName, String alarmSet) {
        this.alarmSet = alarmSet;
        this.roomName = roomName;
        alarms = alarmSet.split("-");

    }

    public List<Alarm> getAlarms(){
        for (String alarm : alarms) {
            switch (alarm){
                case "fire":
                    alarmList.add(new FireAlarm(roomName));
                    break;
                case "move":
                    alarmList.add(new MoveAlarm(roomName));
                    break;
                case "lockpad":
                    alarmList.add(new LockpadAlarm(roomName));
                    break;
                case "noise":
                    alarmList.add(new NoiseAlarm(roomName));
                    break;
                case "smoke":
                    alarmList.add(new SmokeAlarm(roomName));
                    break;
                case "window":
                    alarmList.add(new WindowAlarm(roomName));
                    break;
            }
        }
        return alarmList;
    }
}
