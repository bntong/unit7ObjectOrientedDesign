
/**
 * Write a description of class IDCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IDCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String idNumber;

    /**
     * Default constructor for objects of class IDCard
     */
    public IDCard(String n, String id)
    {  
        super(n);
        idNumber = id;
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
        return "Card holder: " + super.getName() + "\nID Number: " + idNumber;
    }

    public String getName()
    {
        return super.getName();
    }

    public String getIDNum()
    {
        return idNumber;
    }

    public String toString()
    {
        return  "IDCard[name=" + getName() + "]" + "[ID Number=" + idNumber + "]";
    }

    // overried the equals method defined in Card as well as Object
    public boolean equals(Object card1)
    {
        if( this.getClass() == card1.getClass() )
        {
            // first checks if thei object and the other object are equal from the perspective of 
            // the super class
            return super.equals(card1)&&this.idNumber==((IDCard) card1).getIDNum();
        }
        
        return false;
    }
}
