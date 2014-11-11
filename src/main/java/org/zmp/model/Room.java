package org.zmp.model;

import javax.swing.*;
import java.awt.*;

/**
 * Created by MM on 2014-11-11.
 */
public class Room extends JPanel {

    public Room(){
        super();

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(40,40,150,150);




    }

}
