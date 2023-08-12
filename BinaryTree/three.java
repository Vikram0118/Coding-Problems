public class three extends Main {
    public static void main(String[] args) {
        // Get the sum of all the nodes in a Binary Tree.

        Node root = CreateBinaryTree(2);
        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(5);
        root.left.left = CreateBinaryTree(2);
        root.left.right = CreateBinaryTree(6);
        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);
        root.right.right = CreateBinaryTree(9);
        root.right.right.left = CreateBinaryTree(4);

        System.out.println("Sum of all node of the Binary Tree : "+Sum(root));
        System.out.println();

    }

    public static int Sum(Node node) {
        if(node == null) {
            return 0;
        }
        return ( node.data + Sum(node.right) + Sum(node.left) );
    }
}
