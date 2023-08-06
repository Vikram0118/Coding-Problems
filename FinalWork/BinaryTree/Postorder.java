public class Postorder extends Main {
    public static void main(String[] args) {
        // Postorder Traversal = ( left - right - node )

        // Main a = new Main(); 
        Node root = CreateBinaryTree(2);
        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(5);
        root.left.left = CreateBinaryTree(2);
        root.left.right = CreateBinaryTree(6);
        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);
        root.right.right = CreateBinaryTree(9);
        root.right.right.left = CreateBinaryTree(4);

        System.out.println("Postorder :");
        PostorderTraversal(root);

    }

    public static void PostorderTraversal(Node node) {
        if(node == null) {
            return;
        }
        PostorderTraversal(node.left);   
        PostorderTraversal(node.right);
        System.out.print(node.data+" ");
    }
}
