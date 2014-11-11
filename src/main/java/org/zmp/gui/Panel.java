package org.zmp.gui;

import com.sun.prism.*;
import org.zmp.model.Room;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;

/**
 * Created by MM on 2014-11-11.
 */
public class Panel extends JPanel {
    Room room = new Room();
    public Panel() {
        super();
        setPreferredSize(new Dimension(600,600));
        add(room);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        g.drawRect(40,40,150,150);

    }

}
