import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
import java.lang.Math;

/**
 * A Circle class, derived from the abstract Shape class and draws a circle.
 * 
 * @author (Brian Tong) 
 * @version (4 March 2016)
 */
public class Circle extends Shape
{

    /**
     * Calls the constructor of the abstract Shape class and passes in the parameters of the circle
     */
    public Circle(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }
    
    /**
     * / checks to see is the mouse is inside the circle
     * 
     * @param   point   point which represents the mouse
     * @return          returns true or false whether or not the mouse is inside the shape
     */
    boolean isInside(Point2D.Double point)
    {
        // the x coordinate of the mouse at its current position
        double pointX = point.getX();
        // the y coordinate of the mouse at its current position        
        double pointY = point.getY();
        // calls the getCenter method of the Shape class and gets the center of the shape
        Point2D.Double center = super.getCenter();
        // the distance from the mouse's current position to the center of the circle
        double result = Math.sqrt(Math.pow((pointX - center.getX()), 2) + Math.pow((pointY - center.getY()), 2));
        
        // returns true if the mouse is inside the circle, false if the mouse is not
        if(result <= super.getRadius())
            return true;
        else
            return false;
    }
    
    /**
     * / draws the circle
     * @param   g2      graphics class
     *          filled  a boolean stating whether or not the shape should be filled
     */
    void draw(Graphics g2, boolean filled)
    {
        // gets the radius of the circle 
        double radius = super.getRadius();
        // gets the center of the circle
        Point2D.Double center = super.getCenter();
        // sets the color of the circle 
        g2.setColor(super.getColor());
        // draws a filled circle if the circle is not selected, and an outline if the circle is selected
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
