import java.util.*;

// Stack: Last In, First Out (LIFO). The last element pushed is the first popped.
class StackDemo
{
    public static void main(String args[])
    {
        // Create a Stack of fruit names
        Stack <String> st = new Stack <String>();

        // push() adds an element on top of the stack
        st.push ("Apple"); st.push ("Banana");
        st.push ("Mango"); st.push ("Orange");
        st.push ("Grape");

        System.out.print("Size of the Stack is: " + st.size ());
        System.out.print("\nTop element using peek(): " + st.peek ());

        // pop() removes and returns the top element (LIFO order)
        System.out.print("\nRemoving elements using pop():");
        while (!st.isEmpty () )
            System.out.print (st.pop () + "\t");

        System.out.print("\nSize of the Stack after pop is: " + st.size ());
    }
}