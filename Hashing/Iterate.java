package Hashing;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Iterate {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("Chnina", 150);
        hm.put("Indonesia", 10);
        hm.put("US", 50);
        hm.put("Nepal", 200);

        // Iterate
        Set<String> Keys = hm.keySet();
        System.out.println(Keys);

        for (String k : Keys) {
            System.out.println("Keys : " + k + ", Values :" + hm.get(k));
        }

        
    }
}
