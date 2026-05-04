package LinkedList;

public class zigzagll {
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





    public static void zigzag(){
       
        // step 1 - find mid 
       nodes slow = head ;
        nodes fast = head;

        while (fast != null  && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

        }

         nodes mid = slow;

        //step 2 - reverse 2nd half
        nodes curr = mid.next;
        mid.next = null;
       nodes prev = null;
        nodes next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        nodes right = prev; // right ka head 
        nodes left = head;
        nodes nextL, nextR;

        // step 3 - zig zag merge
        while (left != null && right != null) {
            nextL = left.next;
            left.next = right;
            nextR = right.next;
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }
   

    public static void main(String[] args) {

        zigzagll ll = new zigzagll();

        ll.addfirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        ll.print();
        
        ll.zigzag();
        ll.print();
       
    }
}