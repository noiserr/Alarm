
package org.zmp.factory;

import org.zmp.model.room.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MM on 2014-11-12.
 */
public class RoomFactory {

    public RoomFactory() {
    }

    public List<Room> getRooms(List<String> roomList) {
        List<Room> list = new ArrayList<Room>();

        for (String s : roomList) {
            int first = s.indexOf('.');
            int last = s.lastIndexOf('.');
            String name = s.substring(0,first);
            int x = Integer.parseInt(s.substring(first+1,last));
            int y = Integer.parseInt(s.substring(last+1,s.length()));
            System.out.println(x + " " + y);
            switch (name){
                case "garage":
                    list.add(new GarageRoom(x,y));
                    break;
                case "kitchen":
                    list.add(new KitchenRoom(x,y));
                    break;
                case "livingroom":
                    list.add(new LivingRoom(x, y));
                    break;
                case "bathroom":
                    list.add(new BathRoom(x, y));
                    break;
                case "bedroom":
                    list.add(new BedRoom(x, y));
                    break;
                case "corridor":
                    list.add(new CorridorRoom(x,y));
                    break;

            }

        }
        System.out.println(list.size());
        return list;
    }
}
