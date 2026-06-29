package Hashing;
import java.util.HashMap;

public class Operations {
    public static void main(String[] args) {
        //create
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert -- O(1)
        hm.put("India", 130);
        hm.put("China", 180);
        hm.put("US", 50);
        System.out.println(hm);

        //get -- O(1)
        int pop = hm.get("India");
        System.out.println(pop);

        // containskey -- O(1)
        System.out.println(hm.containsKey("US"));
        System.out.println(hm.containsKey("INDO"));

        // remove-- O(1)
        hm.remove("India");
        System.out.println(hm);

        //size
        System.out.println("The size of hashmap is : " + hm.size());


        //is empty 
        hm.clear(); // map ko empty kar deta hai 
        System.out.println(hm.isEmpty());
    }
}
