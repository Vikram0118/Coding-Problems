public class MoorisPreOrder {
    public static void main(String[] args) {
        // pre order - r+node - left - right
        Node root = CreateBinaryTree(2);

        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(9);

        root.left.left = CreateBinaryTree(10);
        root.left.right = CreateBinaryTree(6);

        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);

        MoorisPreOrderFunction(root);
        System.out.println();
        PreOrder(root);
    }

    public static void MoorisPreOrderFunction(Node root) {
        if(root == null) {
            return ;
        }
        Node current;
        Node pre;
        current = root;
        while(current != null) {
            if(current.left == null) {
                System.out.print(current.data+" ");
                current = current.right;
            } else {
                pre = current.left;
                while(pre.right != null && pre.right != current) 
                    pre = pre.right;
                if(pre.right == null) {
                    pre.right = current;
                    System.out.print(current.data+" ");
                    current = current.left;
                } else {
                    pre.right = null;
                    current = current.right;
                }
            }
        }
    }

    public static void PreOrder(Node root) {
        if(root == null) {
            return ;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.left = null;
        A.right = null; 
        return A;
    }
}
