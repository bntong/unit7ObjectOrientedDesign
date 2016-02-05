
/**
 * Write a description of class BetterRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BetterRectangle extends java.awt.Rectangle
{
    /**
     * Default constructor for objects of class BetterRectangle
     */
    public BetterRectangle()
    {
        // initialise instance variables
        super();
        super.setLocation(0,0);
        super.setSize(10,20);
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public double getPerimeter()
    {
        // put your code here
        return (this.getWidth() + this.getHeight()*2)/*hhehehehehehe loooool*/;
    }

    public double getArea()
    {
        return this.getWidth() * this.getHeight();
    }
}
