package Stack;


public class stackusingLL {

    static class  node {
        int data;
         node next;
         node(int data){
            this.data = data;
            this.next= null;
         }
    }
    static class  Stack {
        static node head = null;

        public static boolean isEmpty(){
            return head== null;
        }

        //push
        public static void push(int data){
            node newnode = new node(data);

            if (isEmpty()) {
                head = newnode;
                return;
            }

            newnode.next = head;
            head = newnode;
        }

        // pop
        public static int pop(){
          if (isEmpty()) {
            return -1;
          }  

          int top = head.data;
          head = head.next;
          return top;
        }

        ///peekk
        public static int peek(){
            if (isEmpty()) {
                return -1;
            }

            return head.data;
        }

    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
