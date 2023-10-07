package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Foreach {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,3,4,4,55);
        nums.forEach(x -> System.out.println(x));
       
    }
}