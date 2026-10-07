package LinkedList;


//////// convert from Array to Linked List/////////////////////
public  class Basics {

   public static  class Node{
        int data;
        Node next;
     
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
public static  class Linkedlist {

     private  static  Node ConvertArrtoLL(int [] arr){
        Node head = new  Node(arr[0]);
        Node mover = head;

        for(int i = 1; i< arr.length ; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
         return head;

     }

     private static int Length(Node head){
        int count = 0 ; 
        Node temp = head;
       while (temp != null) {
        temp = temp.next;
        count++;
       }
       return  count;
     }
   
    public static void main(String[] args) {
       int arr[] = {2,3,4,5,4};
       Node head = ConvertArrtoLL(arr);
      System.out.println(Length(head));
    }
   }
}