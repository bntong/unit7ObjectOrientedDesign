import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */


    /**
     * Default constructor for objects of class Circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }

    boolean isInside(Point2D.Double point)
    {
        return false;
    }

    void draw(Graphics2D g2, boolean filled)
    {
        
    }

}
