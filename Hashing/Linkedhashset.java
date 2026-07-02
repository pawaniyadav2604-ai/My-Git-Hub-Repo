package Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bengluru");
        cities.add("Noida");
        System.out.println(cities);
        System.out.println();

        LinkedHashSet<String> lhs = new LinkedHashSet();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Bengluru");
        lhs.add("Noida");
        System.out.println(lhs);

        lhs.remove("Delhi");
        System.out.println(lhs);
    }
}
