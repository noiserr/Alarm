package org.zmp.model.alarm;


import org.zmp.model.logger.EventLogger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import org.zmp.model.event.Event;

/**
 * Created by MM on 2014-11-13.
 */

public class Alarm extends JButton {

    protected Event event;
    protected String name;
    protected String imgName;
    protected BufferedImage icon;

    public Alarm(String roomName, String imgName) {
        this.name = roomName;
        this.imgName = imgName;
        setImg();
        setIcon(new ImageIcon(icon));
        setMargin(new Insets(0, 1, 0, 1));
        setBackground(new Color(222, 222, 222));
//        setContentAreaFilled(false);
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detect();
            }
        });
    }

    public void detect() {
        EventLogger.getInstance().printMessage(name, event.getDescription());
    }


    protected void setImg() {
        try {
            icon = ImageIO.read(new File("src/img/icons/" + imgName + ".png"));

        } catch (IOException e) {
            System.out.println("Can't locate file");
        }
    }
}


