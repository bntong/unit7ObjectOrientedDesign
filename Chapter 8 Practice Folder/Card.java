public class Card
{
    private String name;

    public Card()
    {
        name = "";
    }

    public Card(String n)
    {
        name = n;
    }

    public String getName()
    {
        return name;
    }

    public boolean isExpired()
    {
        return false;
    }

    public String format()
    {
        return "Card holder: " + name;
    }

    public String toString()
    {
        return "Card[name=" + name + "]";
    }
    
    public boolean equals(Card card1)
    {
        return this.name.equals(card1.getName());
    }
}
