class four extends utils {
    public static void main(String[] args) {

        Node root = CreateBinaryTree(1);

        root.left = CreateBinaryTree(2);
        root.right = CreateBinaryTree(3);

        root.left.left = CreateBinaryTree(4);
        root.left.right = CreateBinaryTree(5);
        root.right.left = CreateBinaryTree(6);
        root.right.right = CreateBinaryTree(7);

        root.left.right.left = CreateBinaryTree(8);
        root.right.right.left = CreateBinaryTree(9);
        root.right.right.right = CreateBinaryTree(10);

        MoorisInorder(root);

    }

    public static void MoorisInorder(Node root) {  
    }
}