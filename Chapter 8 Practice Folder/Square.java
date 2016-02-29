import java.awt.*;
import java.awt.geom.*;

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Shape
{
    /** description of instance variable x (add comment for each instance variable) */
    private Point2D.Double center;
    private double radius;
    private Color color;

    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
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

    void draw(Graphics2D g2, boolean filled)
    {

    }

}
