import java.util.GregorianCalendar;

/**
 * Write a description of class DriverLicense here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriverLicense extends IDCard
{
    /** description of instance variable x (add comment for each instance variable) */
    private int expYear;
    private GregorianCalendar calendar;

    /**
     * Default constructor for objects of class DriverLicense
     */
    public DriverLicense(String n, String ID, int expYear)
    {
        super(n, ID);
        this.expYear = expYear;
        calendar = new GregorianCalendar();
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
        return "Card holder: " + getName() + "\nID Number: " + getIDNum() + "\nExp Year: " + expYear;
    }

    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public boolean isExpired()
    {
        // put your code here
        return calendar.get(GregorianCalendar.YEAR) > expYear;
    }

    public String toString()
    {
        return "DriverCard[name=" + getName() + "]" + "[ID Number=" + getIDNum() + "]" + "[ExpYear=" + expYear + "]";
    }

    public int getExpYear()
    {
        return expYear;
    }

    public boolean equals(Object card1)
    {
        if(this.getClass() == card1.getClass())
        {
            return super.equals(card1)&&this.expYear==((DriverLicense) card1).getExpYear();
        }
        
        return false;
    }
}
