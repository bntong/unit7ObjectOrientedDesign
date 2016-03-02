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
    private BorderLayout borderLayout;
    private DrawingPanel canvas;
    
    public ControlPanel(DrawingPanel canvas)
    {                
        this.borderLayout = new BorderLayout();
        this.canvas = canvas;
        
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        
        canvas.add(this.pickColor);
        canvas.add(this.addCircle);
        canvas.add(this.addSquare);
        
        this.addCircle.addActionListener(new ClickListener());
        this.pickColor.addActionListener(new ColorChooser());
            
        
        this.setLayout(borderLayout);
        this.add(canvas, BorderLayout.SOUTH);
        
    }
    
    public class ClickListener implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {        
            canvas.addCircle();
        }
    }
    
    public class ColorChooser implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {        
            canvas.pickColor();
        }
    }
}
