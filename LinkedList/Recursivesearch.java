package LinkedList;

public class Recursivesearch {
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
    public static int helper(nodes head, int key){
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }
        return index+1;
    }

    public static int recursivesearch(int key){
        return helper(head,key);
    }

    public static void main(String[] args) {
        Recursivesearch ll = new Recursivesearch();
        //LinkedList<Integer> ll = new LinkedList<>();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
    
        
        ll.print();
        System.out.println(ll.size);
        System.out.println(ll.recursivesearch(4));
    
    }
}
