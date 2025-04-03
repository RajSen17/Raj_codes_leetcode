import java.util.HashSet;
import java.util.Iterator;

public class Hashing {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        //add element in hashset
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);
       // Search the element
        if (set.contains(1)) {
            System.out.println("Element exit");


        }
        if(!set.contains(8)){
            System.out.println("Element not exit");
        }
        // Iterator: functions are: hasnext(), next()
        // hasnext(): return ture or false value
        // next(): return integer value
        Iterator it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
