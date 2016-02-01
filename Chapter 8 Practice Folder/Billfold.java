

/**
 * Write a description of class Billfold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Billfold extends Card
{
    /** description of instance variable x (add comment for each instance variable) */
    private Card card1;
    private Card card2;

    /**
     * Default constructor for objects of class Billfold
     */
    public Billfold(Card card1, Card card2)
    {
        // initialise instance variables
        this.card1 = card1;
        this.card2 = card2;
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
    public void addCard(Card meh)
    {
        // put your code here
        if(card1 == null)
        {
            card1 = meh;
        }
        else if(card2 == null)
        {
            card2 = meh;
        }
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
    public String formatCards()
    {
        // put your code here
        return y;
    }

}
