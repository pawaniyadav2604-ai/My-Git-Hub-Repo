package BinaryTree;

public class InorderTree {
     static class Node {
        int data;
        Node left;
        Node right;

         Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
         }
            
        }
         static class  Binarytree {
        static int index = -1;
        public static Node buildTree(int nodes[]){
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
              return newNode;
        }
          public static void Ineorder(Node root){
            if (root == null) {
                return;
            }
            Ineorder(root.left);
            System.out.println(root.data + " ");
            
            Ineorder(root.right);
        }
            
        }

         public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Binarytree tree = new Binarytree();
        Node root =tree.buildTree(nodes);
    tree.Ineorder(root);
    }
}
