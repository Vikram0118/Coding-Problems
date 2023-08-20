import java.util.HashSet;
import java.util.Set;

class one  {
    public static void main(String[] args) {
        Node root = null;
        utils L = new utils();   

        root = L.InsertNode(root, 1);
        root = L.InsertNode(root, 2);
        Node temp = root.next;
        // System.out.println(temp.i);
        root = L.InsertNode(root, 3);
        root = L.InsertNode(root, 4);
        root.next.next.next.next = temp;
        // System.out.println(temp.i);

        // L.PrintList(root);
        // System.out.println((UsingHashing(root) ? "There is a cycle" : "There is no cycle"));
        System.out.println((WithoutUsingExtraSpace(root) ? "There is a cycle" : "There is no cycle"));

    }

    public static boolean WithoutUsingExtraSpace(Node node) {
        Node slow = node;
        Node fast = node;

        while(fast != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast) {
                return true;
            } 
        }
        return false;
    }

    public static boolean UsingHashing(Node node) {
        Set<Node> S = new HashSet<>();

        while(node != null) {
            if(S.contains(node)) {
                return true;
            }
            else {
                S.add(node);
                node = node.next;
            }
        }
        return false;
    }

    // public static boolean MySolution(Node node) {   // this method does work, because while checeking itself it will stuck in the loop 
    //     Node tempref = node;

    //     while(node != null) {
    //         System.out.println("ll");
    //         tempref = node.next;
    //         while(tempref != null) {     // understand this shit
    //             System.out.println("kk");
    //             if(tempref.i == node.i) {
    //                 return true;
    //             }
    //             tempref = tempref.next;
    //         }
    //         node = node.next;
    //     }

    //     return false;
    // }
}


class utils {

    public Node InsertNode(Node root, int val) {
        if(root == null) {
            return NewNode(val);
        } else {
            root.next = InsertNode(root.next, val);
        }
        return root;
    }

    public Node NewNode(int val) {
        Node node = new Node();
        node.i = val;
        node.next = null;
        return node;
    }

    public void PrintList(Node root) {
        while(root != null) {
            System.out.print(root.i+" ");
            root = root.next;
        }
    }
}

class Node {
    int i;
    Node next;
}
