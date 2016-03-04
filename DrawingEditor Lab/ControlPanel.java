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
        this.borderLayout = new BorderLayout();
        this.canvas = canvas;
        
        this.pickColor = new JButton("Pick Color");
        this.currentColor = new JPanel();
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        
        this.addCircle.addActionListener(new CircleAdder());
        this.addSquare.addActionListener(new SquareAdder());
        this.pickColor.addActionListener(new ColorChooser());
        
        canvas.add(this.pickColor);
        canvas.add(this.currentColor);
        canvas.add(this.addCircle);
        canvas.add(this.addSquare);
        
        this.setLayout(borderLayout);
        this.add(canvas, BorderLayout.SOUTH);
        
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
            canvas.addCircle(100, 100);
            repaint();
        }
    }
    
    public class SquareAdder implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            canvas.addSquare();
        }
    }
}
