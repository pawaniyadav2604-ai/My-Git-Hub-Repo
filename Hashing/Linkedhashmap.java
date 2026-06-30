package Hashing;
import java.util.*;
public class Linkedhashmap {
    public static void main(String[] args) {
         LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
         lhm.put("India", 100);
         lhm.put("china", 10);
         lhm.put("US", 400);

           HashMap<String, Integer> hm = new HashMap<>();
         hm.put("India", 100);
         hm.put("china", 10);
         hm.put("US", 400);

         System.out.println(" this is hashmap : "+hm);
         System.out.println("this is Linked Hashmap : " + lhm);

    }
}
