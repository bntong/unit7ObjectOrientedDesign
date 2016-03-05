import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.lang.Math;

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
        double pointX = point.getX();
        double pointY = point.getY();
        Point2D.Double center = super.getCenter();
        double result = Math.sqrt(Math.pow((pointX - center.getX()), 2) + Math.pow((pointY - center.getY()), 2));

        if(result <= super.getRadius())
            return true;
        else
            return false;
    }

    void draw(Graphics g2, boolean filled)
    {
        double radius = super.getRadius();
        Point2D.Double center = super.getCenter();
        g2.setColor(super.getColor());
        if(filled)        
        {
            g2.fillOval((int)center.getX()-(int)super.getRadius(),(int)center.getY()-(int)super.getRadius(),(int)radius*2, (int)radius*2);
        }
        else
        {
            g2.drawOval((int)center.getX()-(int)super.getRadius(),(int)center.getY()-(int)super.getRadius(),(int)radius*2, (int)radius*2);
        }
    }
}
