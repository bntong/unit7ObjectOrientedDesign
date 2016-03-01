import java.awt.*;
import javax.swing.*;

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
    
    public ControlPanel(DrawingPanel canvas)
    {                
        this.borderLayout = new BorderLayout();
        
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        
        canvas.add(this.pickColor);
        canvas.add(this.addCircle);
        canvas.add(this.addSquare);
        
        this.setLayout(borderLayout);
        this.add(canvas, BorderLayout.SOUTH);
    }
}
