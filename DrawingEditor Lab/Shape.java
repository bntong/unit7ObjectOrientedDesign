import java.awt.*;
import java.awt.geom.*;

/**
 * This abstract class implements a shape with a given center, radius, and color.
 * 
 * @author (Brian Tong) 
 * @version (4 March 2016)
 */
public abstract class Shape
{
    // the center of the shape 
    private Point2D.Double center;
    // the radius of the shape
    private double radius;
    // the color of the shape
    private Color color;

    /**
     * Constructor for objects of class Shape
     */
    public Shape(Point2D.Double center, double radius, Color color)
    {
        // assigns the instance variable center to the parameter center
        this.center = center;
        // assigns the instance variable radius to the parameter radius       
        this.radius = radius;
        // assigns the instance variable radius to the parameter radius        
        this.color = color;
    }  
    
    /**
     *  returns the center of the shape
     *  
     *  @return     the center of the shape
     */
    Point2D.Double getCenter()
    {
        return this.center;
    }
    
    /**
     *  returns 
     *  
     *  @return     the radius of the shape
     */
    double getRadius()
    {
        return this.radius;
    }
    
    /**
     * moves the shape
     * 
     * @param   x   the x coordinate of the center
     *          y   the y coordinate of the center
     */
    void move(double x, double y)
    {
        this.center.setLocation(this.center.getX() + x, this.center.getY() + y);       
    }
    /**
     * sets the radius of the shape
     * 
     * @param r     the radius of the shape
     */
    void setRadius(double r)
    {
        this.radius = r;
    }
    /**
     * checks to see whether the mouse is inside the shape
     * 
     * @param point     a point representing the mouse's location
     * @return          whether or not the mouse is in the shape
     */
    boolean isInside(Point2D.Double point)
    {
        return false;
    }
    /**
     *  checks to see whether the mouse is on the border of the shape
     *  
     *  @param point    a point representing the mouse's location
     *  @return whether or not the mouse is on the border of the shape
     */
    boolean isOnBorder(Point2D.Double point)
    {
        return false;
    }
    /**
     * draws the shape
     * 
     * @param   g2      graphics class
     *          filled  whether the shape should be filled or not
     */
    
    void draw(Graphics g2, boolean filled)
    {
        
    }
    /**
     *  returns the current color of the shape
     *  
     *  @return      returns the current color of the shape
     */
    Color getColor()
    {
        return this.color;
    }
}
