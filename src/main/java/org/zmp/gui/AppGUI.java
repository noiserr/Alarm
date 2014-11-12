package org.zmp.gui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by MM on 2014-11-11.hhh
 */
public class AppGUI {

    JPanel panel;
    JFrame frame;

    public AppGUI(){
        frame = new JFrame("Alarm");
        panel = new JPanel(new BorderLayout());
        BuildingPlan buildingPlan = new BuildingPlan();
        buildingPlan.setLayout(null);


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(960, 540));
        frame.setLocationRelativeTo(null);
        frame.add(panel);
//        final JScrollPane scroll = new JScrollPane(panel);

        panel.add(new JScrollPane(buildingPlan), BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
