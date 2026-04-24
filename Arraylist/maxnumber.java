package Arraylist;

import java.util.ArrayList;

public class maxnumber {
     public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(7);
        list.add(8);
       System.out.println(list);
       int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            max = Math.max(max, list.get(i));  
        }
        System.out.println(max);
        

     //   int max=  Integer.MIN_VALUE;

     //   for (int index = 0; index < list.size(); index++) {
     //      if(max < list.get(index)){
     //           max = list.get(index);
     //      }
     //   }
     //   System.out.println("Max element is : " + max);

     }
}
