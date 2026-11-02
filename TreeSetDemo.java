import java.util.*;

// TreeSet: no duplicates allowed, and elements are kept in sorted order.
class TreeSetDemo
{
    public static void main(String args[])
    {
        // Create a TreeSet of fruit names
        TreeSet <String> ts = new TreeSet <String>();
        ts.add ("Apple"); ts.add ("Banana");
        ts.add ("Mango"); ts.add ("Orange");
        ts.add ("Grape");

        // A duplicate is ignored, like in the other sets
        ts.add ("Apple");

        System.out.print("Size of the TreeSet is: " + ts.size ());
        System.out.print("\nRetrieving elements in TreeSet using Iterator:");

        // Iterator shows the elements in alphabetical (sorted) order
        Iterator<String> it = ts.iterator ();
        while (it.hasNext () )
            System.out.print (it.next () + "\t");
    }
}