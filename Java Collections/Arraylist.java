import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] arr){

        /** It is dynamic array with no size limit
            - Maintains the insertion order.
            - Non synchronized
            - Cannot create arraylist of primitive types
            - Requires wrapper class only
            - new generic type (allows typecasting)
         */
        ArrayList <Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(20);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));

        Iterator it = arrayList.iterator();

        // Using for loop
        for (Integer i:
             arrayList) {
            System.out.println(i);
        }

        // using while
        while(it.hasNext())
            System.out.println(it.next());
        arrayList.add(0);
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);

        /** By Iterator interface.
         By for-each loop.
         By ListIterator interface.
         By for loop.
         By forEach() method.
         By forEachRemaining() method.
         *
         */
    }


    }
