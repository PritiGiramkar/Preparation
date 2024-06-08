import com.Student.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String args[]){
        /**
         * Uses the technique of hashing to store the element
         * inherits Set and Abstractset
         * Has unique elements
         * Does not maintain the insertion order
         * Best operation for searching
         * The initial default capacity of HashSet is 16, and the load factor is 0.75.
         */
        HashSet <String> hs = new HashSet<>();
        hs.add("Hello");
        hs.add("morning");
        hs.add("Hello");
        System.out.println(hs);
        hs.removeIf(a -> a.contains("Hello"));
        System.out.println(hs);

        ArrayList <String> ls = new ArrayList<>();
        ls.add("Hello");
        ls.add("morning");
        ls.add("Hello");

        HashSet <String> hs2 = new HashSet<>(ls);
        System.out.println(hs2);

        /**
         * Adding Student class as the element to hashset of student type
         */
        HashSet <Student> studentArrayList = new HashSet<>();

        Student student = new Student(1,"priti");
        Student student2 = new Student(1,"priti");

        studentArrayList.add(student);
        studentArrayList.add(student2);

        System.out.println(studentArrayList);

        Iterator <Student> ir = studentArrayList.iterator();

        while(ir.hasNext())
            System.out.println(ir.next().name);


    }
}
