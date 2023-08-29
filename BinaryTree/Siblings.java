
public class Siblings {
    public static void main(String[] args) {
        
        Node root = CreateBinaryTree(2);

        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(9);

        root.left.left = CreateBinaryTree(10);
        root.left.right = CreateBinaryTree(6);
        root.right.right = CreateBinaryTree(3);

        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);

        System.out.println("Check if the two nodes are siblings in a Binary Tree :");
        System.out.println(video62(root, root.left.left, root.left.right));
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.height = 0;
        A.left = null;
        A.right = null; 
        return A;
    }

    public static boolean video62(Node root, Node sib1, Node sib2) {
        // check if the give two nodes are siblings
        if(root == null) {
            return false ;
        }
        return ((root.left == sib1 && root.right == sib2) || (root.left == sib2 && root.right == sib1) || video62(root.left, root.left.left, root.left.right) || video62(root.right, root.right.left, root.right.right)) ;

    }
}

class Node {
    int data;
    int height;
    Node left ;
    Node right;
}

