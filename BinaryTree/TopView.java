import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class TopView {
    public static void main(String[] args) {
        
        Node root = CreateBinaryTree(5);
        root.left = CreateBinaryTree(3);
        root.right = CreateBinaryTree(7);
        root.left.left = CreateBinaryTree(1);
        root.left.right = CreateBinaryTree(4);
        root.left.left.left = CreateBinaryTree(0);
        root.right.left = CreateBinaryTree(6);
        root.right.right = CreateBinaryTree(9);
        root.right.right.left = CreateBinaryTree(8);

        System.out.println("Top View :");
        TopViewOfBinaryTree(root);
    }

    public static Node CreateBinaryTree (int k) {
        Node A = new Node();
        A.data = k;
        A.height = 0;
        A.left = null;
        A.right = null; 
        return A;
    }

    public static void TopViewOfBinaryTree(Node root) {
        if(root == null) {
            return ;
        }

        TreeMap<Integer, Integer> TreeMap = new TreeMap<>();
        Queue<Node> Queue = new LinkedList<>();
        Queue.add(root);

        while(!Queue.isEmpty()) {
            Node temp = Queue.remove();
            int hd = temp.height;

            if(temp.left != null) {
                Queue.add(temp.left);
                temp.left.height = hd - 1;
            }
            if(temp.right != null) {
                Queue.add(temp.right);
                temp.right.height = hd + 1;
            }

            if(TreeMap.get(hd) == null) {
                TreeMap.put(hd, temp.data);
            }
        }

        System.out.println(TreeMap.values());
    }
}

class Node {
    int data;
    int height;
    Node left ;
    Node right;
}
