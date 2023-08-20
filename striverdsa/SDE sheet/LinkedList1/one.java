class one  {
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
        root = ReverseList(root);
        System.out.println();
        L.PrintList(root);
    }

    public static Node ReverseList(Node root) {
        Node end = null;
        Node temp = null;

        while(root != null) {
            temp = root;
            root = root.next;
            temp.next = end;
            end = temp;
        }

        return end;
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
