import java.util.*;

// PriorityQueue: First In, First Out is NOT used here.
// The element with the highest priority (smallest value) comes out first.
class PriorityQueueDemo
{
    public static void main(String args[])
    {
        // Create a PriorityQueue of fruit names
        PriorityQueue <String> pq = new PriorityQueue <String>();
        pq.add ("Apple"); pq.add ("Banana");
        pq.add ("Mango"); pq.add ("Orange");
        pq.add ("Grape");

        System.out.print("Size of the PriorityQueue is: " + pq.size ());
        System.out.print("\nHead element using peek(): " + pq.peek ());

        // poll() removes the element with the highest priority
        System.out.print("\nRemoving elements using poll():");
        while (!pq.isEmpty () )
            System.out.print (pq.poll () + "\t");
    }
}