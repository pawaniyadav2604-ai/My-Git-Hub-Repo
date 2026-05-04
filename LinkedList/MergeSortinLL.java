package LinkedList;



public class MergeSortinLL {
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

        if (head == null) {   
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


     private nodes getmid(nodes head){
        nodes slow = head;
        nodes fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // mid node 
     }


     
    private nodes mergesort(nodes head1, nodes head2) {
        nodes mergell = new nodes(-1);
        nodes temp = mergell;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
         while (head2 != null) {
             temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
        }
        return mergell.next;
    }



   public nodes mergesort(nodes head){
    if(head == null || head.next == null){
        return head;
    }
    
    // find mid
    nodes mid = getmid(head);


    /// left and right merge sort 
    nodes righthead = mid.next;
    mid.next = null ;
    nodes newLeft =mergesort(head);
    nodes newRight = mergesort(righthead);

    
    /// merge 
    return mergesort(newLeft, newRight);
    
   }



    public static void main(String[] args) {
MergeSortinLL ll = new MergeSortinLL();
ll.addfirst(3);
ll.addfirst(7);
ll.addfirst(9);
ll.addLast(5);
ll.addLast(4);
ll.addLast(6);

ll.print();;
ll.head = ll.mergesort(ll.head);
ll.print();
    }
}