import java.util.ArrayList;
public class MehClass 
{
    private static int numPeople=5;
    public static void main(String[] args)
    {
        ArrayList<Person> list = new ArrayList<Person>();
        java.util.Scanner s = new java.util.Scanner(System.in);

        for(int i = 0;i<numPeople;i++)
        {
            System.out.println("Enter in a person's name: ");
            list.add(new Person(s.next()));
        }

        String firstPerson="", lastPerson="";
        for(Person p: list)
        {
            int before = 0;
            int after = 0;
            for(Person q: list)
            {
                System.out.println(p.compareTo(q));
                if(p.compareTo(q) == -1)
                {
                    before++;
                }
                else if(p.compareTo(q) == 1)
                {
                    after++;
                }
            }
            if(before == numPeople-1)
            {
                firstPerson = p.getName();
            }
            if(after == numPeople-1)
            {
                lastPerson = p.getName();
            }
        }
        System.out.println("First Person: "+firstPerson+" Last Person: "+lastPerson);
    }

}
