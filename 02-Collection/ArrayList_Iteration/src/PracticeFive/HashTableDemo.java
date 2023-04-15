package PracticeFive;
import java.util.*;
public class HashTableDemo {

    public static void main(String[] args) {


        Hashtable ht = new Hashtable<>();

        ht.put(1, "A");
        ht.put(2, "B");
        ht.put(3, "C");
        ht.put(4, "D");
        ht.put(5, "E");

        String s = (String)ht.get(3);

        Enumeration e = ht.elements();
        Enumeration k = ht.keys();

        while(e.hasMoreElements())
        {
            System.out.println(e.nextElement() + " " + k.nextElement());
        }


    }
}
