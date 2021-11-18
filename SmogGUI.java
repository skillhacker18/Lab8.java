//620142180
/**
 * Write a description of class SmogGUI here.
 *
 * @author (Kaydeen Tucker)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import org.w3c.dom.events.Event;

/**
 * A simple form to record smog levels in the city
 * 
 * @author Final Examination
 * @version 1.0a
 */
public class SmogGUI extends JFrame implements ActionListener
{
  public static void main(String[] args){
    SmogGUI smog = new SmogGUI(new SmogApp());
		smog.run();
	}
	private void run(){
		for (int i = 0; i<5; i++)
      this.app.addReading(i, i * 2);
	}
		private SmogApp app;
    private JTextField  distance;       //distance
    private JTextField  smogLevel;      //smog level
    private JTextArea   displayArea;
    private JButton     save;
    private JButton     clear;
    private JButton     clearAll, exit;

    private JPanel      command;
    private JPanel      display;
    
    // Panel for buttons
 
    
    /**
     * Constructor for objects of class SmogMeter
     */
    public SmogGUI(SmogApp app)
    {
				this.app = app;
        setTitle("City Smog Meter");
        setBackground(Color.GRAY);
        setLayout(new BorderLayout());
        
        command = new JPanel();
        command.setLayout(new GridLayout(2,4));
        
        display = new JPanel();
        displayArea = new JTextArea("Readings displayed here");
        display.add(displayArea);
        
        save = new JButton("Save");
        //save.addActionListener(new addActionListener(){
         // @Override
          //public void actionPerformed(ActionEvent e) {
           // if (){

           // }

          //}
        //});

        clear = new JButton("Clear");
        clear.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Field cleared!");
            distance.setText("");
            smogLevel.setText("");
          }
        });
        clearAll = new JButton("Clear All");
        clearAll.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
          app.clearLog();

          }
        });
        exit = new JButton("exit");
        exit.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Bye!");
            System.exit(0);
          }
        });

        distance = new JTextField(4);
        smogLevel = new JTextField(4);
      
        command.add(new JLabel("Distance:")); 
        command.add(distance);
        command.add(new JLabel("Smog Level:"));
        command.add(smogLevel);
        command.add(save);
        command.add(clear);
        command.add(clearAll);
        command.add(exit);
        // nothing is placed in row 2 col 4
        
        add(display, BorderLayout.CENTER);
        add(command, BorderLayout.SOUTH);
        pack();
        setVisible(true);

      }

    public SmogGUI() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      e.getSource();
      
    }

    }