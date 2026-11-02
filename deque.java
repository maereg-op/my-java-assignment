
import java.util.*;

// ArrayDeque: Implements the Deque interface.
// It allows elements to be added and removed at both ends.
class DequeQueueDemo
{
    public static void main(String args[])
    {
        // Create an ArrayDeque to use as a Queue
        Deque<String> q = new ArrayDeque<String>();

        // Add elements to the Queue
        q.offer("Apple");
        q.offer("Banana");
        q.offer("Mango");

        // Display the size of the Queue
        System.out.print("Size of the Queue is: " + q.size());

        // Retrieve the first element without removing it
        System.out.print("\nFirst element using peek(): " + q.peek());

        // Display all elements using Iterator
        System.out.print("\nDisplaying elements using Iterator:");
        Iterator<String> it = q.iterator();

        while(it.hasNext())
            System.out.print(it.next() + "\t");

        // Remove elements from the front of the Queue
        System.out.print("\nRemoving first element using poll(): " + q.poll());

        // Display the Queue after removal
        System.out.print("\nQueue after removal: " + q);
    }
}
