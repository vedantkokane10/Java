package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class ArrayListClass {
    public static void main(String[] args) {
        // use of component . It does not support index
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(4);
        nums.add(8);
        System.out.println(nums);
        for (Object x : nums) {
            System.out.println(x);
        }
        System.out.println(nums.size());

        // use of List. It does support index
        List<Integer> a = new ArrayList<Integer>();
        a.add(4);
        a.add(7);
        a.add(9);
        a.add(3);
        System.out.println(a);
    }
}