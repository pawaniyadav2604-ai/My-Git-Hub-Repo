package LinkedList;

public class IterativeSearch {
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

    public static int itrsearch(int key){
        nodes temp = head;
        int i = 0;

        while(temp != null){
           if (temp.data == key) {
            return i;   //// key found
           }
           temp = temp.next;
           i++;
        }
        // for key not found
        return -1;

    }

    public static void main(String[] args) {
       IterativeSearch ll = new IterativeSearch();
        //LinkedList<Integer> ll = new LinkedList<>();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
    
        
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.itrsearch(7));
    
    }
}
