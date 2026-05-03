package LinkedList;

public class Removealoop {
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

    
    public static boolean isCycle(){
        nodes slow = head;
        nodes fast = head;

        while (fast != null && fast.next != null) {
            slow= slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; /// cycle exist
            }
        }
        return false; //// cyclre doesnt exist
    }


    public static  void removecycle(){
        // detect cycle 
        nodes slow = head;
        nodes fast = head;
        boolean cycle = false;
        while ( fast != null  && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if ( fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false){
            return;
        }


        // find meeting point 
        slow = head;
        nodes prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // remove cycle -- last.next= null 
        prev.next = null;
    }

    public static void main(String[] args) {
        head = new nodes(1); 
        nodes temp = new nodes(2);
        head.next= temp;        
        head.next.next = new nodes(3);       
        head.next.next.next = temp;  
        System.out.println(isCycle());
        removecycle();
        System.out.println(isCycle()); 
          
    }
}
