package LinkedList;

//import java.util.LinkedList;

public class Basics {
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
    public static void main(String[] args) {
        
        head = new nodes(1);
        head.next = new nodes(2);
        
    }
}
 