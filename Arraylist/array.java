package Arraylist;

import java.util.ArrayList;
class array {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(); 
        // operations in arraylist 
        // 1. add element ;

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,20);
        System.out.println(list);
        

        //2. get operation
        int element =list.get(2);
        System.out.println(element);

        //3. remove element 
        list.remove(3);
        System.out.println(list);

        //4. set element at index
        list.set(2, 30);
        System.out.println(list);

        //5. contains element 
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));
        System.out.println(list.contains(30));
    }
}
