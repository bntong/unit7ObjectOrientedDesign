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
    private JPanel bottomPanel;
    private BorderLayout borderLayout;
    
    public ControlPanel()
    {                
        this.bottomPanel = new JPanel();
        this.borderLayout = new BorderLayout();
        
        this.pickColor = new JButton("Pick Color");
        this.addCircle = new JButton("Add Circle");
        this.addSquare = new JButton("Add Square");
        
        this.bottomPanel.add(this.pickColor);
        this.bottomPanel.add(this.addCircle);
        this.bottomPanel.add(this.addSquare);
        
        this.setLayout(borderLayout);
        this.add(bottomPanel, BorderLayout.SOUTH);
    }
}
