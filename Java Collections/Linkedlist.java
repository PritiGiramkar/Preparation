import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist {
    public static void main (String argsp[]){
        /**
         * Makes use of doubly linked list
         * Inherits the abstractList which is sequential list
         * Also uses the deque which inherits the queue
         * duplicate elements
         * manipulation is fast no shifting occurs
         * can be used as list, stack or queue
         * we can add or remove elements from both side
         */

        LinkedList <String> ll = new LinkedList<>();
        ll.addFirst("hello");
        ll.add("world");
        ll.addFirst("new");
        ll.add("Good");
        ll.addLast("Morning");

        System.out.println(ll);
        System.out.println(ll.contains("Good"));
        System.out.println(ll.getLast());
        System.out.println(ll.peekLast());
        System.out.println(ll.poll());
        System.out.println(ll);

        String []arrayList = ll.toArray(new String[0]);

        System.out.println(arrayList);
    }
}
