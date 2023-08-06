
public class Main extends Node {
    
    public static void main(String[] args) {

        Node root = CreateBinaryTree(2);
        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(5);
        root.left.left = CreateBinaryTree(2);
        root.left.right = CreateBinaryTree(6);
        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);
        root.right.right = CreateBinaryTree(9);
        root.right.right.left = CreateBinaryTree(4);
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.left = null;
        A.right = null; 
        return A;
    }
}

