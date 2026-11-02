import java.util.*;

// ArrayDeque: a double ended queue (deque).
// Elements can be added or removed at both the front and the back.
class ArrayDequeDemo
{
    public static void main(String args[])
    {
        // Create an ArrayDeque of fruit names
        ArrayDeque <String> dq = new ArrayDeque <String>();
        dq.add ("Apple");
        dq.add ("Banana");
        dq.add ("Mango");

        // Add at the front and at the back
        dq.addFirst ("Papaya");
        dq.addLast ("Orange");

        System.out.print("Size of the ArrayDeque is: " + dq.size ());
        System.out.print("\nFirst element using peekFirst(): " + dq.peekFirst ());
        System.out.print("\nLast element using peekLast(): " + dq.peekLast ());

        System.out.print("\nRetrieving elements in ArrayDeque using Iterator:");
        Iterator<String> it = dq.iterator ();
        while (it.hasNext () )
            System.out.print (it.next () + "\t");

        // removeFirst() takes from the front, removeLast() from the back
        System.out.print("\nRemoving from front: " + dq.removeFirst ());
        System.out.print("\nRemoving from back: " + dq.removeLast ());
    }
}