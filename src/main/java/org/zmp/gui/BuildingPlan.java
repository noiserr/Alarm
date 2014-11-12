package org.zmp.gui;

import org.zmp.factory.RoomFactory;
import org.zmp.model.Room;
import java.util.List;
import javax.swing.*;
import java.awt.*;

/**
 * Created by MM on 2014-11-11.
 */
public class BuildingPlan extends JPanel {

    List<Room> roomList;
    RoomFactory roomFactory = new RoomFactory();

    public BuildingPlan() {
        super();
        setPreferredSize(new Dimension(1000, 800));
        setBackground(new Color(198, 226, 204));
        roomList = roomFactory.getRooms();
        for (Room room : roomList) {
            add(room);
        }







    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


    }

}
