package Arraylist;

import java.util.ArrayList;

public class reverse {
       public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
       System.out.println(list);
        for (int index = list.size()-1; index >=0; index--) {
            System.out.print(list.get(index) + " ");
        }
        System.out.println();
       }
}
