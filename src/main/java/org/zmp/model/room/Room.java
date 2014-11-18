package org.zmp.model.room;

import javax.swing.*;
import java.awt.*;

/**
 * Created by MM on 2014-11-11.
 */
public class Room extends JPanel {
    //private int x, y;
    protected JLabel roomName;
    protected JPanel buttonPanel;
    private int posX, posY;
    private final int WIDTH = 100;
    private final int HEIGHT = 160;


    public Room(int posX, int posY) {
        super();

        this.posX = posX;
        this.posY = posY;


        roomName = new JLabel("", SwingConstants.CENTER);
        buttonPanel = new JPanel();

        setSize(new Dimension(WIDTH, HEIGHT));
        setBounds(posX, posY, WIDTH, HEIGHT);
        setLayout(new BorderLayout());
        add(roomName, BorderLayout.NORTH);

        buttonPanel.setOpaque(false);

        add(buttonPanel, BorderLayout.CENTER);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g.setColor(new Color(118, 38, 139));
        g2d.drawRect(0, 0, WIDTH - 1, HEIGHT - 1);

    }


}
