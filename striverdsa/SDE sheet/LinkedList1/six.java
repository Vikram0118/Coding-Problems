class six  {
    public static void main(String[] args) {

        // Problem Statement: Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list instead, you will be given access to the node to be deleted directly. It is guaranteed that the node to be deleted is not a tail node in the list.
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
        Node t = GetNode(root, 5);
        DeleteElement(t);
        System.out.println();
        L.PrintList(root);
    }

    public static Node GetNode(Node root, int position) {
        int i=1;
        while(i<position) {
            root = root.next;
            i++;
        }
        return root;
    }

    public static void DeleteElement(Node node) {
        if(node.next == null) {
            node = null;
        }

        node.i = node.next.i;
        node.next = node.next.next;
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
