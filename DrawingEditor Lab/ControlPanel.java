import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Contains the three buttons pickColor, which allows you to pick a color, addCircle, which allows you to draw a 
 * circle, and addSquare, which allows you to draw a square.
 * 
 * @author (Brian Tong) 
 * @version (4 March 2016)
 */
public class ControlPanel extends JPanel
{
    // the variables which initialize the three buttons on the bottom of the frame
    private JButton pickColor;
    private JButton addCircle;
    private JButton addSquare;
    
    // the variable which initializes a panel to show which color is currently selected
    private JPanel currentColor;
    
    // the variable which initializes a canvas of type DrawingPanel
    private DrawingPanel canvas;
    
    // constructor for objects of class ControlPanel
    public ControlPanel(DrawingPanel canvas)
    {                
        // assigns canvas to the parameter canvas of type DrawingPanel
        this.canvas = canvas;
        
        // assigns the three instance variables to a button which reflects what the button does
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        
        // assigns the currentColor JPanel to a new JPanel
        this.currentColor = new JPanel();
        
        // sets the background color of the currentColor JPanel to the current color that is selected, or by 
        // default, green.
        currentColor.setBackground(canvas.getColor());
        
        // adds three actionListeners to the buttons
        this.addCircle.addActionListener(new CircleAdder());
        this.addSquare.addActionListener(new SquareAdder());
        this.pickColor.addActionListener(new ColorChooser());
        
        // adds the buttons and the currentColor JPanel to itself
        this.add(this.pickColor);
        this.add(this.currentColor);
        this.add(this.addCircle);
        this.add(this.addSquare);
        
    }
    
    // the actionListener for the pickColor button
    public class ColorChooser implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {        
            // calls the pickColor method of canvas which returns the current color selected and sets the current
            // color panel to that color
            canvas.pickColor();
            currentColor.setBackground(canvas.getColor());
        }
    }
    
    // the actionListener for the addCircle button
    public class CircleAdder implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            // calls the addCircle method of canvas and paints a circle
            canvas.addCircle();
            canvas.repaint();
        }
    }
    
    // the actionListener for the addCircle button
    public class SquareAdder implements ActionListener
    {
        // calls the addCircle method of canvas and paints a square        
        public void actionPerformed(ActionEvent event)
        {
            canvas.addSquare();
            canvas.repaint();
        }
    }
}
