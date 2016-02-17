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
    private static final int BOX_WIDTH = 10;
    private static final int BOX_HEIGHT = 10;
    private static int box_x;
    private static int box_y;
    
    private Rectangle point;
    
    
    public TriangleComponent()
    {
        point = new Rectangle(box_x, box_y, BOX_WIDTH, BOX_HEIGHT);
    }
    
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        g2.draw(point);
    }
    
    public void addPoint(int x, int y)
    {
       this.box_x = x;
       this.box_y = y;
       System.out.println(x);
    }
}
