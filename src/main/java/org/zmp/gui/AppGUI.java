package org.zmp.gui;

import org.zmp.model.Building;
import org.zmp.model.logger.EventLogger;

import javax.swing.*;
import javax.swing.text.DefaultCaret;
import java.awt.*;

/**
 * Created by MM on 2014-11-11.hhh
 */
public class AppGUI {

    JPanel panel;
    JFrame frame;
    JTextArea logger;
    Building building;

    public AppGUI(){
        frame = new JFrame("Alarm");
        panel = new JPanel(new BorderLayout());
        building = new Building();
        building.setLayout(null);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(1080, 700));
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setResizable(false);
//        final JScrollPane scroll = new JScrollPane(panel);

        logger = EventLogger.getInstance();
        logger.setEditable(false);

        JScrollPane loggerS = new JScrollPane(logger, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panel.add(loggerS, BorderLayout.NORTH);
        panel.add(new JScrollPane(building), BorderLayout.CENTER);

        frame.setVisible(true);
    }

}
