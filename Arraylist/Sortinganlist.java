package Arraylist;

// import java.util.ArrayList;
// import java.util.Collections;
import java.util.*;;
public class Sortinganlist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
     list.add(4);
     list.add(3);
     list.add(2);
     list.add(1);
     list.add(6);
     list.add(5);
     list.add(7);

     System.out.println(list);
     // ascending order mein sort hogi 
     Collections.sort(list);
     System.out.println(" ascensing order " + list);


     // descending order mein sort karne ke liye

     Collections.sort(list, Collections.reverseOrder());
     System.out.println("descending order " + list);
}
    }

