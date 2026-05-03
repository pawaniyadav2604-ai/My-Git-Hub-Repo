package LinkedList;

public class checkpalindrome {

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


   /////////////// slow-fast approach /////////
    public nodes findmid(nodes head){
        nodes slow = head ;
        nodes fast = head;

        while (fast != null  && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2

        }

         return slow;
    }


    public boolean palindrome(){
        if (head == null && head.next == null){
            return true;
        }
        // step 1 - find mid 
        nodes midnode = findmid(head);

        //step 2 - reverse 2nd half
       nodes prev = null;
        nodes curr = midnode;
        nodes next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        nodes right = prev; // right ka head 
        nodes left = head;

        // step 3 - check left and right half
        while (right != null) {
            if (left.data != right.data){
                return false;
            }
            left =left.next;
            right = right.next;
        }
        return true;
    }
   

    public static void main(String[] args) {

        checkpalindrome ll = new checkpalindrome();

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(2);
        ll.addLast(1);
        ll.addLast(5);

        ll.print();
        System.out.println(ll.palindrome());
       
    }
}



