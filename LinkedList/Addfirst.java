package LinkedList;

import java.util.*;

class Addfirst {
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

    public void addfirst(int data ){
        
        /// create new node 
        nodes newNode  = new nodes(data);

        if (head == tail ) {
            head = tail= newNode;
            return;
        }

        // newnodes next = head 
        newNode.next = head; //// link  kiya hai ek node ko dusre node se 

           // head = newnode 
        head = newNode;
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
          ll.addFirst(1);
        ll.addFirst(2);
        
    }
}
 

