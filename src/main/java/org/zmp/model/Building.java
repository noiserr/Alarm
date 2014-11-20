package org.zmp.model;

import org.zmp.factory.RoomFactory;
import org.zmp.model.room.Room;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;

/**
 * Created by MM on 2014-11-11.
 */
public class Building extends JPanel {

    List<Room> roomList;
    RoomFactory roomFactory = new RoomFactory();
    BufferedImage buildingImg = null;

    public Building() {
        super();

        setImg();
        setPreferredSize(new Dimension(buildingImg.getWidth(), buildingImg.getHeight()));
        setBackground(new Color(198, 198, 198));
        roomList = roomFactory.getRooms();
        for (Room room : roomList) {
            add(room);
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(buildingImg, 0, 0, null);
    }

    protected void setImg() {
        try {
            buildingImg = ImageIO.read(new File("src/img/plan.png"));

        } catch (IOException e) {
            System.out.println("Can't locate file");
        }
    }

}
