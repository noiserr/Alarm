package org.zmp.factory;

import org.zmp.model.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MM on 2014-11-12.
 */
public class RoomFactory {

    public RoomFactory() {
    }

    public List<Room> getRooms(){
        List<Room> list = new ArrayList<Room>();
        Room room1 = new Room(40,40);
        //room1.setPosition();
        Room room2 = new Room(150,40);
//        room2.setPosition(40,150);
        list.add(room1);
        list.add(room2);
        return list;
    }
}
