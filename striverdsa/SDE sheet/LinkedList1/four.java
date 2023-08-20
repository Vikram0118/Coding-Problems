class four  {
    public static void main(String[] args) {
        Node root = null;
        utils L = new utils();   

        root = L.InsertNode(root, 1);
        root = L.InsertNode(root, 2);
        root = L.InsertNode(root, 3);
        root = L.InsertNode(root, 4);
        root = L.InsertNode(root, 5);

        L.PrintList(root);
        root = RemoveNthNodeFromEnd(root, 2);
        System.out.println();
        L.PrintList(root);
    }

    public static Node RemoveNthNodeFromEnd(Node root, int position) {
        Node Nth = root;
        Node End = root;
        int i=0;

        while(i<position ) {
            End = End.next;
            i++;
        }
        while(End.next != null) {
            End = End.next;
            Nth = Nth.next;
        }

        Nth.next = Nth.next.next;
    
        return root;
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
