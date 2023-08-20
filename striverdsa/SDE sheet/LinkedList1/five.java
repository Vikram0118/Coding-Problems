class five {
    public static void main(String[] args) {
        Node root1 = null;
        Node root2 = null;
        utils L = new utils();   

        root1 = L.InsertNode(root1, 2);
        root1 = L.InsertNode(root1, 4);
        root1 = L.InsertNode(root1, 3);

        root2 = L.InsertNode(root2, 5);
        root2 = L.InsertNode(root2, 6);
        root2 = L.InsertNode(root2, 4);

        Node root3 = AddTwonumbers(root1, root2);
        System.out.println();
        L.PrintList(root3);
    }

    public static Node AddTwonumbers(Node root1, Node root2) {
        Node head = new Node();
        Node temp = head;
        int carry =0;

        while(root1 != null || root2 != null || carry != 0) {
            int sum =0;
            if(root1 != null) {
                sum += root1.i;
                root1 = root1.next;
            }
            if(root2 != null) {
                sum += root2.i;
                root2 = root2.next;
            }
            sum += carry;
            carry = sum / 10;
            Node node = new Node(sum%10); // new node
            temp.next = node;
            temp = temp.next;
        }

        return head.next;
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

    Node() {}
    Node(int i) { this.i = i; }
    Node(int i, Node next) { this.i = i; this.next = next; }
}
