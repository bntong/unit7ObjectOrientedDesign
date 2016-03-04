import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

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
        Ellipse2D.Double circle = new Ellipse2D.Double(100,100,100,100);
        g2.fill(circle);
    }

}
