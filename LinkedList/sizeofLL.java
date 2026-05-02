package LinkedList;
//import java.util.LinkedList;
public class sizeofLL {

    public static class nodes {
        int data;
        nodes next;

        public nodes(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static nodes head;
    public static nodes tail;
    public int size;/// by default iski value 0 hoti hai 


    public void addfirst(int data) {
        nodes newNode = new nodes(data);
        size++;
        if (head == null) {  
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        nodes newNode = new nodes(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        nodes temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }


    public void add(int ind, int data){
        if(ind == 0){
        addfirst(data);
        return;
    }

        nodes newNode = new nodes(data);
        size++;
        nodes temp = head;
        int i =0 ; 
        while (i < ind-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public static void main(String[] args) {
       sizeofLL ll = new sizeofLL();
        //LinkedList<Integer> ll = new LinkedList<>();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2,3);
        
        ll.print();
        System.out.println(ll.size);
    
    }

}


