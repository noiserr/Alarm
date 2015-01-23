package org.zmp.core;

import com.alee.laf.WebLookAndFeel;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.zmp.gui.AppGUI;
import org.zmp.model.Message;

import javax.swing.*;

/**
 * Created by MM on 2014-11-11.
 */
public class Main {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                WebLookAndFeel.install();

                AppGUI app = new AppGUI();

            }
        });
//        AppGUI app = new AppGUI();

    }
}
