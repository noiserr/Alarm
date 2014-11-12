package org.zmp.model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by MM on 2014-11-11.
 */
public class Room extends JPanel {
    //private int x, y;
    private JLabel roomName;
    private JPanel buttonPanel;
    public Room(int x, int y) {
        super();
        roomName = new JLabel("Cafee", SwingConstants.CENTER);
        buttonPanel = new JPanel();
        setSize(new Dimension(80, 150));
        setOpaque(true);
        //setPosition(x, y);
        setBounds(x, y, 80, 150);
        setLayout(new BorderLayout());
        add(roomName, BorderLayout.NORTH);
        buttonPanel.add(new JButton("Fire"));
        buttonPanel.add(new JButton("Thief"));
        buttonPanel.add(new JButton("EE"));
        buttonPanel.setOpaque(false);
        add(buttonPanel,BorderLayout.CENTER);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(5, 0, 2));
        g.drawRect(0, 0, 79, 149);


    }

//    public void setPosition(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }


}
