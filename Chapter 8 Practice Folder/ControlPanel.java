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
    private JPanel panel;
    private JButton pickColor;
    private JButton addCircle;
    private JButton addSquare;
    
    public ControlPanel()
    {
        this.panel = new JPanel();
        
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        
        this.panel.add(this.pickColor);
        this.panel.add(this.addCircle);
        this.panel.add(this.addSquare);
    }
}
