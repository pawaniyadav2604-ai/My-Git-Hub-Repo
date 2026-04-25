package Arraylist;

import java.util.ArrayList;

class swapnumbers {
      public static void swap(ArrayList<Integer> list , int ind1, int ind2){
        int temp = list.get(ind1); 
        list.set(ind1, list.get(ind2));
        list.set(ind2,temp);
      }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(8);

        int ind1= 1;
        int ind2 = 3;
        System.out.println(list);
        swap(list, ind1, ind2);
        System.out.println(list);
    }
}
