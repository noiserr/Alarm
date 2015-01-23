package org.zmp.model;

import org.zmp.factory.RoomFactory;
import org.zmp.model.room.Room;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
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

    public Building(String path) {
        super();


        setImg(path);
        setPreferredSize(new Dimension(buildingImg.getWidth(), buildingImg.getHeight()));
        setBackground(new Color(88, 85, 87));
        roomList = roomFactory.getRooms(readFile(path));
        for (Room room : roomList) {
            add(room);
        }
    }


    private List<String> readFile(String filename)
    {
        filename = filename.substring(0, filename.length() - 3)+"txt";
//        path += "txt";
        System.out.println(filename);
        List<String> records = new ArrayList<String>();
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null)
            {
                records.add(line);
            }
            reader.close();
            return records;
        }
        catch (Exception e)
        {
            System.err.format("Exception occurred trying to read '%s'.", filename);
            e.printStackTrace();
            return null;
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(buildingImg, 0, 0, null);
    }

    protected void setImg(String path) {
        try {
//<<<<<<< Updated upstream
            buildingImg = ImageIO.read(new File(path));

//=======
//            buildingImg = ImageIO.read(new File("src/main/resources/08001_b_fp.jpg"));
//            buildingImg = ImageIO.read(new File("src/img/floorplan.png"));
//
//>>>>>>> Stashed changes
        } catch (IOException e) {
            System.out.println("Can't locate file");
        }
    }

}
