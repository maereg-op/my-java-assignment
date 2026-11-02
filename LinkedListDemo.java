import java.util.*;

// LinkedList: a chain of nodes. Good for adding/removing at the ends.
// It also keeps insertion order and allows duplicates.
class LinkedListDemo
{
    public static void main(String args[])
    {
        // Create a LinkedList of fruit names
        LinkedList <String> ll = new LinkedList <String>();
        ll.add ("Apple"); ll.add ("Banana");
        ll.add ("Mango"); ll.add ("Orange");
        ll.add ("Grape");

        // Add at the front and at the back
        ll.addFirst ("Papaya");
        ll.addLast ("Lemon");

        System.out.print("Size of the Linked List is: " + ll.size ());
        System.out.print("\nRetrieving elements in LinkedList using Iterator:");

        // Iterator reads the list from first to last element
        Iterator<String> it = ll.iterator ();
        while (it.hasNext () )
            System.out.print (it.next () + "\t");
    }
}