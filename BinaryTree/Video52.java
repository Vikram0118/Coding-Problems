public class Video52 {
    public static void main(String[] args) {
        Node root = CreateBinaryTree(2);

        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(9);

        root.left.left = CreateBinaryTree(10);
        root.left.right = CreateBinaryTree(6);

        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);

        System.out.println("the minimum distance to leaf from root in a Binary Tree :");
        System.out.println(video52minidist(root, 0));
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.height = 0;
        A.left = null;
        A.right = null; 
        return A;
    }

    public static int video52minidist(Node root, int level) {
        // get the minimum distance to leaf from root
        if(root == null) {
            // return Integer.MAX_VALUE; // for finding  min distance 
            return Integer.MIN_VALUE; // for finding max distance
        }
        if(root.left == null && root.right == null) {
            return level;
        }
        return Math.min(video52minidist(root.left, level + 1), video52minidist(root.right, level + 1));
        // return Math.max(video52minidist(root.left, level + 1), video52minidist(root.right, level + 1));
    }
}

class Node {
    int data;
    int height;
    Node left ;
    Node right;
}
