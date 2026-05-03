package LinkedList;

public class Reverse {
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
   
    public void reverse(){
        nodes prev = null;
        nodes curr = tail = head;
        nodes next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        Reverse ll = new Reverse();
        //LinkedList<Integer> ll = new LinkedList<>();
        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.print();
        System.out.println(ll.size);
        ll.reverse();
        ll.print();
    
    }
}


