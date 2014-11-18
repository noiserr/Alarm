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
        frame.setSize(new Dimension(960, 540));
        frame.setLocationRelativeTo(null);
        frame.add(panel);
//        final JScrollPane scroll = new JScrollPane(panel);
        logger = EventLogger.getInstance();
        logger.setEditable(false);
        DefaultCaret caret = (DefaultCaret)logger.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        panel.add(new JScrollPane(logger), BorderLayout.NORTH);
        panel.add(new JScrollPane(building), BorderLayout.CENTER);
        for (int i = 0; i < 10 ; i++) {
            logger.append("\n String nr: " + i);
        }
        frame.setVisible(true);
    }

}
