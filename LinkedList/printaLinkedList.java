package LinkedList;

public class printaLinkedList {

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

    public void addfirst(int data) {
        nodes newNode = new nodes(data);

        if (head == null) {   // ✅ fixed
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        nodes newNode = new nodes(data);

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

    public static void main(String[] args) {

        printaLinkedList ll = new printaLinkedList();  // ✅ use your class
        ll.print();
        ll.addfirst(2);
        ll.print();
        ll.addfirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);

        ll.print();
    }
}