

/**
 * Write a description of class CallingCard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CallingCard extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private String cardNum;
    private String pin;

    /**
     * Default constructor for objects of class CallingCard
     */
    public CallingCard(String n, String cardNum, String pin)
    {
        // initialise instance variables
        super(n);
        this.cardNum = cardNum;
        this.pin = pin;
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
        // put your code here
        return "Card Holder: " + getName() + "\nCard Number: " + cardNum + "\nPin: " + pin;
    }
    
    public boolean equals(CallingCard card1)
    {
        return super.equals(card1)&&this.idNumber==card1.getIDNum();
    }
}
