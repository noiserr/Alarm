package org.zmp.model.room;

import org.zmp.factory.AlarmListFactory;
import org.zmp.model.alarm.Alarm;

import javax.swing.*;
import java.awt.*;

/**
 * Created by MM on 2014-11-11.
 */
public class Room extends JPanel {
    //private int x, y;
    protected JLabel roomJLabel;
    protected String roomName;
    protected JPanel buttonPanel;
    private int posX, posY;
    private final int WIDTH = 100;
    private final int HEIGHT = 180;


    public Room(int posX, int posY, String roomName) {
        super();
        this.posX = posX;
        this.posY = posY;
        this.roomName = roomName;
        drawGUI();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        Color color1 = new Color(206, 192, 108);
        Color color2 = new Color(213, 165, 22);
        GradientPaint gp = new GradientPaint(0, 0, color1, 0, getHeight(), color2);

        g2d.setPaint(gp);

        g2d.fillRect(0, 0, WIDTH, HEIGHT );
        g2d.setPaint(new Color(4, 2, 4, 195));
        g.drawRect(0, 0, WIDTH - 1, HEIGHT - 1);

    }

    protected void addAlarms(String alarmSet){
        AlarmListFactory alarmFactory = new AlarmListFactory(roomName, alarmSet);
        for (Alarm alarm : alarmFactory.getAlarms()) {
            buttonPanel.add(alarm);
        }
        buttonPanel.setOpaque(false);
        add(buttonPanel, BorderLayout.CENTER);
    }

    private void drawGUI(){
        roomJLabel = new JLabel("", SwingConstants.CENTER);
        buttonPanel = new JPanel();

        setSize(new Dimension(WIDTH, HEIGHT));
        setBounds(posX, posY, WIDTH, HEIGHT);
        setLayout(new BorderLayout());

        roomJLabel.setFont(new Font("Verdana", Font.BOLD, 14));
        roomJLabel.setText(roomName);
        add(roomJLabel, BorderLayout.NORTH);
    }


}
