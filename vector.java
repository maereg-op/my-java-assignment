
import java.util.*;

// Vector: A List implementation that stores elements
// and allows access using indexes.
class VectorDemo
{
    public static void main(String args[])
    {
        // Create a Vector of fruit names
        Vector<String> v = new Vector<String>();

        // Add elements to the Vector
        v.add("Apple");
        v.add("Banana");
        v.add("Mango");

        // Add an element at a specific index
        v.add(1, "Orange");

        // Display the size of the Vector
        System.out.print("Size of the Vector is: " + v.size());

        // Access elements using get()
        System.out.print("\nFirst element: " + v.get(0));
        System.out.print("\nSecond element: " + v.get(1));

        // Display all elements using Iterator
        System.out.print("\nDisplaying elements using Iterator:");
        Iterator<String> it = v.iterator();

        while(it.hasNext())
            System.out.print(it.next() + "\t");

        // Remove an element using its index
        System.out.print("\nRemoving element: " + v.remove(1));

        // Display the Vector after removal
        System.out.print("\nVector after removal: " + v);
    }
}
