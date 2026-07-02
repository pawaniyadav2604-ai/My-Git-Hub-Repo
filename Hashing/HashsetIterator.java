package Hashing;
import java.util.*;

public class HashsetIterator {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet();
        cities.add("Delhi");
        cities.add("MP");
        cities.add("Kolkata");
        cities.add("Chennai");

        // using iterators
        Iterator it = cities.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
System.out.println();

        //using advanced for loop
        for (String city : cities) {
            System.out.println(city);
        }

    }
}
