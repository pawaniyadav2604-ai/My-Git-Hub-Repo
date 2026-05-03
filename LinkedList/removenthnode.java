package LinkedList;

public class removenthnode {

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


    public void deletenthfromend(int n ){
        //calculate size
        int size = 0 ;
        nodes temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        if (n == size) {
            head= head.next;
            return;
        }

        // size-n
        int i = 1;
        int itofind = size-n;
        nodes prev = head;

        while (i < itofind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {

        removenthnode ll = new removenthnode();

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(3);
        ll.addLast(4);

        ll.print();
        ll.deletenthfromend(3);
        ll.print();
    }
}

