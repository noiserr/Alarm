package org.zmp.model.logger;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by MM on 2014-11-14.
 */
public class EventLogger extends JTextArea {
    int i=1;
    private static EventLogger ourInstance = new EventLogger();

    public static EventLogger getInstance() {
        return ourInstance;
    }

    private EventLogger() {
        super(5,20);
        setBackground(new Color(57, 57, 57));
        Font font = new Font("Monospace", Font.BOLD, 12);
        setFont(font);
        setForeground(new Color(255, 255, 255, 254));

        Date dNow = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        append("System start date: "+ ft.format(dNow));
    }

    public void printMessage(String roomName, String information){


       append("\n"+ information + " in "+ roomName);
        setCaretPosition(getDocument().getLength());

    }
}
