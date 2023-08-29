public class Video64 {
    public static void main(String[] args) {
        Node root = CreateBinaryTree(2);

        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(9);

        root.left.left = CreateBinaryTree(10);
        root.left.right = CreateBinaryTree(6);

        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);

        System.out.println("LCA of the TWO values in a Binary Tree :");
        System.out.println(video64lca(root, 11, 9).data);
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.height = 0;
        A.left = null;
        A.right = null; 
        return A;
    }

    public static Node video64lca(Node node, int n1, int n2) {

        if(node == null) {
            return null;
        }

        if(node.data == n1 || node.data == n2) {
            return node;
        }

        Node leftlca = video64lca(node.left, n1, n2);
        Node rightlca = video64lca(node.right, n1, n2); 

        if(leftlca != null && rightlca != null) {
            return node;
        }

        return (leftlca != null) ? leftlca : rightlca;
    }
}

class Node {
    int data;
    int height;
    Node left ;
    Node right;
}
