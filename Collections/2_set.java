package Collections;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

class SetCollection {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<Integer>();
        // set collection stores all unique values in sorted manner
        s1.add(3);
        s1.add(3);
        s1.add(2);
        s1.add(2);
        s1.add(5);
        s1.add(5);
        for(Object x : s1){
            System.out.println(x);
        }
        Iterator<Integer> it = s1.iterator();
        System.out.println(it.next());
    }
}