package Hashing;

import java.util.*;

public class Treemap {
    public static void main(String[] args) {
       TreeMap<String, Integer> tm = new TreeMap<>();
         tm.put("India", 100);
         tm.put("china", 10);
         tm.put("US", 400);

           HashMap<String, Integer> hm = new HashMap<>();
         hm.put("India", 100);
         hm.put("china", 10);
         hm.put("US", 400);

         System.out.println(" this is hashmap : "+hm);
         System.out.println("this is treemap : " + tm);
    }
}
