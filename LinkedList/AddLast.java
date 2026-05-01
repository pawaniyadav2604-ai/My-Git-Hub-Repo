package LinkedList;

import java.util.*;

class AddLast {
     public static class  nodes {
        int data ;
         nodes next;

         public nodes(int data){
            this.data = data;
            this.next = null;
         }
    }
    public static nodes head;
    public static nodes tail ;

    public void addLast(int data ){
        
        /// create new node 
        nodes newNode  = new nodes(data);

        if (head == null ) {
            head = tail= newNode;
            return;
        }

        tail.next = newNode; //// link  kiya hai ek node ko dusre node se 

        tail = newNode;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
          ll.addLast(1);
        ll.addLast(2);
        
    }
}
 

