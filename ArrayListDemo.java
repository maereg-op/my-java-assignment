import java.util.*;

// ArrayList: a resizable array. Keeps insertion order and allows duplicates.
class ArrayListDemo
{
    public static void main(String args[])
    {
        // Create an ArrayList of fruit names
        ArrayList <String> al = new ArrayList <String>();
        al.add ("Apple"); al.add ("Banana");
        al.add ("Mango"); al.add ("Orange");
        al.add ("Grape");

        // Insert at a given index (elements after it shift right)
        al.add (1,"Papaya");
        al.add (2,"Lemon");

        System.out.print("Size of the Array List is: " + al.size ());
        System.out.print("\nRetrieving elements in ArrayList using Iterator:");

        // Iterator reads the list from first to last element
        Iterator<String> it = al.iterator ();
        while (it.hasNext () )
            System.out.print (it.next () + "\t");
    }
}