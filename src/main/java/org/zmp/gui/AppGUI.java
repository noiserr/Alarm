package org.zmp.gui;

import org.zmp.model.Building;
import org.zmp.model.logger.EventLogger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MM on 2014-11-11.hhh
 */
public class AppGUI implements ActionListener{

    JPanel panel;
    JFrame frame;
    JTextArea logger;
    Building building;
    JMenuBar barMenu;
    JMenu fileMenu;
    JMenuItem openFile;
    JMenuItem exit;

    String path;

    public AppGUI(){
        frame = new JFrame("Alarm");
        panel = new JPanel(new BorderLayout());
        picture();
        building = new Building(path);
        building.setLayout(null);
        barMenu = new JMenuBar();
        fileMenu = new JMenu("File");
        openFile = new JMenuItem("Open file");
        exit = new JMenuItem("Exit");

        ImageIcon icon = new ImageIcon("src/img/icon.png");
        frame.setIconImage(icon.getImage());

        frame.setSize(new Dimension(1080,700));
        frame.setLocationRelativeTo(null);
        frame.add(panel);
        frame.setResizable(false);
//        final JScrollPane scroll = new JScrollPane(panel);

//      Funkcjonalności paska menu

        panel.add(barMenu, BorderLayout.NORTH);
        barMenu.add(fileMenu);
        fileMenu.add(openFile);
        fileMenu.add(exit);

        openFile.addActionListener(this);
        openFile.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
        exit.addActionListener(this);
        exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));

//        System.out.println(readFile(path));

        logger = EventLogger.getInstance();
        logger.setEditable(false);
        JScrollPane loggerS = new JScrollPane(logger, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        panel.add(loggerS, BorderLayout.SOUTH);
        panel.add(new JScrollPane(building), BorderLayout.CENTER);
        panel.add(loggerS, BorderLayout.NORTH);
        JScrollPane buildingS = new JScrollPane(building);
        buildingS.getVerticalScrollBar().setUnitIncrement(10);
        panel.add(buildingS, BorderLayout.CENTER);


        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }



    public void actionPerformed(ActionEvent e) {

        Object z = e.getSource();
        if (z == openFile){
            String userhome = System.getProperty("user.home");
            JFileChooser readFile = new JFileChooser("C:");
            if (readFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){

                File image = readFile.getSelectedFile();
                JOptionPane.showMessageDialog(null, "File " + image.getAbsolutePath());
//                path = image.getAbsolutePath();
//                building = new Building(path);

            }
        }
        else if (z == exit) {
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","Alarm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                frame.dispose();
            }
        }
    }

    public String picture(){
        JFileChooser readFile = new JFileChooser();
        if (readFile.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File image = readFile.getSelectedFile();

            path = image.getAbsolutePath();
        }
        else{
            int response = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","Alarm", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.YES_OPTION) {
                frame.dispose();
                System.exit(0);
            }
        }
        return path;
    }


}
