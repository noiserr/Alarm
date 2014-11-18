package org.zmp.factory;

import org.zmp.model.room.GarageRoom;
import org.zmp.model.room.Room;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MM on 2014-11-12.
 */
public class RoomFactory {

    public RoomFactory() {
    }

    public List<Room> getRooms() {
        List<Room> list = new ArrayList<Room>();

            list.add(new GarageRoom(730, 680));

        return list;
    }
}
