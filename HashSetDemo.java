import java.util.*;

// HashSet: no duplicates allowed, and the order is NOT guaranteed.
class HashSetDemo
{
    public static void main(String args[])
    {
        // Create a HashSet of fruit names
        HashSet <String> hs = new HashSet <String>();
        hs.add ("Apple"); hs.add ("Banana");
        hs.add ("Mango"); hs.add ("Orange");
        hs.add ("Grape");

        // A duplicate is ignored, the size stays the same
        hs.add ("Apple");

        System.out.print("Size of the HashSet is: " + hs.size ());
        System.out.print("\nRetrieving elements in HashSet using Iterator:");

        // Iterator reads the set in no fixed order
        Iterator<String> it = hs.iterator ();
        while (it.hasNext () )
            System.out.print (it.next () + "\t");
    }
}
