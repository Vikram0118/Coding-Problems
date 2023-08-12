public class Preorder extends Main {
    public static void main(String[] args) {
        // Preorder Traversal = ( node - left - right )

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

        System.out.println("Preorder :");
        PreorderTraversal(root);

    }

    public static void PreorderTraversal(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.data+" ");
        PreorderTraversal(node.left);   
        PreorderTraversal(node.right);
    }
}
