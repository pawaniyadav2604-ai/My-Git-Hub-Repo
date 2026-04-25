package Arraylist;

import java.util.ArrayList;

public class multidimensionallist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
    //     ArrayList<Integer> list1 = new ArrayList<>();
    //     list1.add(1);
    //     list1.add(2);
    //     list1.add(3);
    //     list1.add(4);
    //     list1.add(5);
    //   /// list1 ko main list mein add karne ke liye 
    //     main.add(list1);


    //      ArrayList<Integer> list2 = new ArrayList<>();
    //     list2.add(2);
    //     list2.add(4);
    //     list2.add(6);
    //     list2.add(8);
    //     list2.add(10);
    //   /// list1 ko main list mein add karne ke liye 
    //     main.add(list2);



    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();
    ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1 ; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        main.add(list1);
        main.add(list2);
        main.add(list3);

        // for(int i =0 ; i<main.size(); i++){
        //     ArrayList<Integer> currentlist = main.get(i);
        //     for (int j = 0; j < currentlist.size(); j++) {
        //         System.out.print(currentlist.get(j) + " ");
        //     }
        //     System.out.println();
        // }
        System.out.println(main);
    }
}
