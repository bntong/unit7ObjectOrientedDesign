import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of abstract class Shape here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    private double radius;
    private Color color;

    /**
     * Default constructor for objects of class Shape
     */
    public Shape(Point2D.Double center, double radius, Color color)
    {
        this.center = center;
        this.radius = radius;
        this.color = color;
    }

    Point2D.Double getCenter()
    {
        return this.center;
    }

    double getRadius()
    {
        return this.radius;
    }

    void move(double x, double y)
    {
        this.center.setLocation(this.center.getX() + x, this.center.getY() + y);       
    }

    void setRadius(double r)
    {

    }

    boolean isInside(Point2D.Double point)
    {
        return false;
    }

    boolean isOnBorder(Point2D.Double point)
    {
        return false;
    }

    void draw(Graphics g2, boolean filled)
    {
        
    }
    
    Color getColor()
    {
        return this.color;
    }
}
