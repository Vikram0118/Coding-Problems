public class four extends Main {
    public static void main(String[] args) {
        // Get of differnce of value at Even and Odd levels

        Node root = CreateBinaryTree(2);
        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(5);
        root.left.left = CreateBinaryTree(2);
        root.left.right = CreateBinaryTree(6);
        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);
        root.right.right = CreateBinaryTree(9);
        root.right.right.left = CreateBinaryTree(4);

        System.out.println("differnce between left and right node : "+Solution(root));

    }

    public static int Solution(Node node) {
        if(node == null) {
            return 0;
        }
        return ( node.data - Solution(node.right) - Solution(node.left) );
    }
}
