import java.awt.*;
import java.awt.geom.*;

/**
 * A Square class, derived from the abstract Shape class and draws a square.
 * 
 * @author (Brian Tong) 
 * @version (4 March 2016)
 */
public class Square extends Shape
{

    /**
     * Default constructor for objects of class Square
     */
    public Square(Point2D.Double center, double radius, Color color)
    {
        super(center, radius, color);
    }

    boolean isInside(Point2D.Double point)
    {
        // the x coordinate of the mouse at its current position
        double pointX = point.getX();
        // the y coordinate of the mouse at its current position        
        double pointY = point.getY();
        // calls the getCenter method of the Shape class and gets the center of the shape
        Point2D.Double center = super.getCenter();
        // radius of the square
        int radius = (int)super.getRadius();
        // returns true if the mouse is inside the square, false if the mouse is not
        if(pointX >= (center.getX() - radius) && pointX <= (center.getX() + radius)&& 
           pointY >= (center.getY() - radius) && pointY <= (center.getY() + radius))
            return true;
        else
            return false;
    }

    /**
     * draws the square
     * 
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
        // draws a filled square if the square is not selected, and an outline if the square is selected
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
