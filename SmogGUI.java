/**
 * Write a description of class SmogGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.awt.*;
import javax.swing.*;

/**
 * A simple form to record smog levels in the city
 * 
 * @author Final Examination
 * @version 1.0a
 */
public class SmogGUI extends JFrame
{
    private JTextField  distance;       //distance
    private JTextField  smogLevel;      //smog level
    private JTextArea   displayArea;
    private JButton     save;
    private JButton     clear;
    private JButton     clearAll;
    
    private JPanel      command;
    private JPanel      display;
    
    // Panel for buttons
 
    
    /**
     * Constructor for objects of class SmogMeter
     */
    public SmogGUI()
    {
        setTitle("City Smog Meter");
        setBackground(Color.green);
        setLayout(new BorderLayout());
        
        command = new JPanel();
        command.setLayout(new GridLayout(2,4));
        
        display = new JPanel();
        displayArea = new JTextArea("Readings displayed here");
        display.add(displayArea);
        
        save      = new JButton("Save");
        clear   = new JButton("Clear");
        clearAll = new JButton("Clear All");
        distance = new JTextField(4);
        smogLevel = new JTextField(4);
      
        command.add(new JLabel("Distance:")); 
        command.add(distance);
        command.add(new JLabel("Smog Level:"));
        command.add(smogLevel);
        command.add(save);
        command.add(clear);
        command.add(clearAll);
        // nothing is placed in row 2 col 4
        
        add(display, BorderLayout.CENTER);
        add(command, BorderLayout.SOUTH);
        pack();
        setVisible(true);

      }
    }
