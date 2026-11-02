import java.util.*;

// LinkedHashSet: no duplicates allowed, but it keeps insertion order.
class LinkedHashSetDemo
{
    public static void main(String args[])
    {
        // Create a LinkedHashSet of fruit names
        LinkedHashSet <String> lhs = new LinkedHashSet <String>();
        lhs.add ("Apple"); lhs.add ("Banana");
        lhs.add ("Mango"); lhs.add ("Orange");
        lhs.add ("Grape");

        // A duplicate is ignored, like in HashSet
        lhs.add ("Banana");

        System.out.print("Size of the LinkedHashSet is: " + lhs.size ());
        System.out.print("\nRetrieving elements in LinkedHashSet using Iterator:");

        // Iterator follows the order the elements were added
        Iterator<String> it = lhs.iterator ();
        while (it.hasNext () )
            System.out.print (it.next () + "\t");
    }
}