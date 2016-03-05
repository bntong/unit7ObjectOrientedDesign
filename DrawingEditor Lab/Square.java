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
        super(center, radius, color);
    }

    Point2D.Double getCenter()
    {
        return this.center;
    }

    double getRadius()
    {
        return this.radius;
    }

    void setRadius(double r)
    {

    }

    boolean isInside(Point2D.Double point)
    {
        double pointX = point.getX();
        double pointY = point.getY();
        Point2D.Double center = super.getCenter();
        int radius = (int)super.getRadius();
        if(pointX >= (center.getX() - radius) && pointX <= (center.getX() + radius)&& 
           pointY >= (center.getY() - radius) && pointY <= (center.getY() + radius))
            return true;
        else
            return false;
    }

    boolean isOnBorder(Point2D.Double point)
    {
        return false;
    }

    void draw(Graphics g2, boolean filled)
    {
        double radius = super.getRadius();
        Point2D.Double center = super.getCenter();
        g2.setColor(super.getColor());
        if(filled)        
        {
            g2.fillRect((int)center.getX()-(int)super.getRadius(),(int)center.getY()-(int)super.getRadius(),(int)radius*2, (int)radius*2);
        }
        else
        {
            g2.drawRect((int)center.getX()-(int)super.getRadius(),(int)center.getY()-(int)super.getRadius(),(int)radius*2, (int)radius*2);
        }
    }

}
