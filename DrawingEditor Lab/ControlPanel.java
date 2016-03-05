import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    private JButton pickColor;
    private JButton addCircle;
    private JButton addSquare;
    private JPanel currentColor;
    private BorderLayout borderLayout;
    private DrawingPanel canvas;
    
    public ControlPanel(DrawingPanel canvas)
    {                
        this.canvas = canvas;
        
        this.pickColor = new JButton("Pick Color");
        this.currentColor = new JPanel();
        currentColor.setBackground(canvas.getColor());
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        
        this.addCircle.addActionListener(new CircleAdder());
        this.addSquare.addActionListener(new SquareAdder());
        this.pickColor.addActionListener(new ColorChooser());
        
        this.add(this.pickColor);
        this.add(this.currentColor);
        this.add(this.addCircle);
        this.add(this.addSquare);
        
    }
    
    public class ColorChooser implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {        
            canvas.pickColor();
            currentColor.setBackground(canvas.getColor());
        }
    }
    
    public class CircleAdder implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            canvas.addCircle();
            canvas.repaint();
        }
    }
    
    public class SquareAdder implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            canvas.addSquare();
            canvas.repaint();
        }
    }
}
