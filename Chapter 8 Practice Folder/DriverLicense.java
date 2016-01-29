
/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends IDCard
{
    /** description of instance variable x (add comment for each instance variable) */
    private String expYear;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, String ID, String expYear)
    {
        super(n, ID);
        this.expYear = expYear;
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
    public String format()
    {
        return "Card holder: " + getName() + "\nID Number: " + idNumber + expYear;
    }

}
