import java.awt.*;
import java.awt.geom.*;
import javax.swing.JComponent;

/**
 * Write a description of class TriangleComponent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TriangleComponent extends JComponent
{
    private static final int BOX_WIDTH = 1;
    private static final int BOX_HEIGHT = 1;
       
    private Rectangle point;
    
    
    public TriangleComponent(int box_x, int box_y)
    {
        point = new Rectangle(box_x, box_y, BOX_WIDTH, BOX_HEIGHT);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
    }
}
