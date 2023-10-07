package Collections;

import java.util.HashMap;
import java.util.Map;

class MapClass {
    public static void main(String[] args) {
        // key-value pair   
        // combination of <set,list>
        Map<String, Integer> mp = new HashMap<>();
        mp.put("one",1);
        mp.put("two",2);
        mp.put("three",3);
        
        System.out.println(mp);
        for(Object key : mp.keySet()){
            System.out.println(key + " : " + mp.get(key));
        }
    }
}