package org.zmp.model.alarm;


import org.zmp.model.logger.EventLogger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by MM on 2014-11-13.
 */

public class Alarm extends JButton {

    protected String information;
    protected String name;

    public Alarm(String name) {
        this.name = name;
        //setMargin(new Insets(3,25,3,25));
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detect();
            }
        });
    }

    public void detect() {
        EventLogger.getInstance().pisz(name, information);
    }

}


