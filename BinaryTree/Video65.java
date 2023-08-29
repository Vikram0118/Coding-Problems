public class Video65 {
    public static void main(String[] args) {
        Node root = CreateBinaryTree(2);

        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(9);

        root.left.left = CreateBinaryTree(10);
        root.left.right = CreateBinaryTree(6);
        root.right.right = CreateBinaryTree(3);

        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);

        System.out.println("distance between two nodes in a Binary Tree :");
        System.out.println(video65distbetwtwonode(root, 11,3));
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.height = 0;
        A.left = null;
        A.right = null; 
        return A;
    }

    public static int video65distbetwtwonode(Node root, int n1, int n2) {
        // find the distance between two values
        // LCA - least common ancestor
        if(root == null) {
            return -1;
        }

        Node lca = LCA(root, n1, n2);

        if(lca == null) {
            return -1;
        }

        int d1 = distancefromlca(lca, n1, 0);
        int d2 = distancefromlca(lca, n2, 0);

        return (d1 + d2);
    }

    public static int distancefromlca(Node lca, int n, int dist) {
        if(lca == null) {
            return -1;
        }

        if(lca.data == n) {
            return dist;
        }

        int d = distancefromlca(lca.left, n, dist+1);
        if(d != -1) {
            return d;
        }
        d = distancefromlca(lca.right, n, dist+1);
        return d;
    }

    public static Node LCA(Node node , int n1, int n2) {
        if(node == null) {
            return null;
        }

        if(node.data == n1 || node.data == n2) {
            return node;
        }

        Node leftlca = LCA(node.left, n1, n2);
        Node rightlca = LCA(node.right, n1, n2); 

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
