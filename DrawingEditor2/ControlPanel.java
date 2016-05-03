import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Random;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel 
{
    // instance variables - replace the example below with your own
    private JButton pickColor;
    private JButton addCircle;
    private JButton addSquare;
    
    private JPanel currentColor;
    /**
     * Constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel canvas)
    {
       this.pickColor = new JButton("Pick Color");
       this.addCircle = new JButton("Add Circle");
       this.addSquare = new JButton("Add Square");
       
       this.currentColor = new JPanel();
       
       this.pickColor.addActionListener(new ColorChooser());
       this.addCircle.addActionListener(new CircleAdder());
       this.addSquare.addActionListener(new SquareAdder());
       
       this.add(this.pickColor);
       this.add(this.currentColor);
       this.add(this.addCircle);
       this.add(this.addSquare);
    }

    public class ColorChooser implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {        
           
        }
    }
    
    public class CircleAdder implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            
        }
    }
    
    public class SquareAdder implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            
        }
    }
}
