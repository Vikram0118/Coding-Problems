class two  {
    public static void main(String[] args) {
        Node root = null;
        utils L = new utils();   

        root = L.InsertNode(root, 1);
        root = L.InsertNode(root, 2);
        root = L.InsertNode(root, 3);
        root = L.InsertNode(root, 4);
        root = L.InsertNode(root, 5);
        root = L.InsertNode(root, 6);
        root = L.InsertNode(root, 7);

        L.PrintList(root);
        int result = MiddleElement(root);
        System.out.println();
        System.out.println(result);
        int ans = BetterApproach(root);
        System.out.println(ans);
    }

    public static int MiddleElement(Node root) {
        int length =0;
        Node temp = root;

        while(temp != null) {
            length += 1;
            temp = temp.next;
        }
        // for(int i=0; i< ((length % 2 == 0) ? length/2 - 1: length/2) ; i++) {
        //     root = root.next;
        // }
        for(int i=0; i < length/2 ; i++) {
            root = root.next;
        }

        return root.i;
    }

    public static int BetterApproach(Node root) {
        // Tortoise-Hare-Approach
        Node slow = root;
        Node fast = root;

        while(fast != null && fast.next != null) {
            slow= slow.next;
            fast = fast.next.next;
        }

        return slow.i;
    }
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
