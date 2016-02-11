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
    private static final int BOX_Y
    private static final int POINT_Y = 1;
    
    private Point2D.Double point;
    
    
    public TriangleComponent()
    {
        point = new Point2D.Double(POINT_X , POINT_Y);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
    }
}
