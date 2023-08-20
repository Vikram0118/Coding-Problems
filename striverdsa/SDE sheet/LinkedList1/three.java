class three  {
    public static void main(String[] args) {
        Node root1 = null;
        Node root2 = null;
        utils L = new utils();   

        root1 = L.InsertNode(root1, 1);
        root1 = L.InsertNode(root1, 2);
        root1 = L.InsertNode(root1, 5);
        root1 = L.InsertNode(root1, 8);
        root1 = L.InsertNode(root1, 10);

        root2 = L.InsertNode(root2, 1);    // understand how the repeat is also included
        root2 = L.InsertNode(root2, 3);
        root2 = L.InsertNode(root2, 7);
        root2 = L.InsertNode(root2, 10);

        Node root3 = mergetwoSortedList(root1, root2);

        L.PrintList(root3);
        
    }

    public static Node mergetwoSortedList(Node root1, Node root2) {
        if(root1 == null) {
            return root2;
        }

        if(root2 == null) {
            return root1;
        }

        Node result = root1;

        while(root1 != null && root2 != null) {

            Node temp = null;

            while(root1 != null && root1.i <= root2.i) {
                temp = root1;
                root1 = root1.next;
            }
            temp.next = root2;
            // brillent step
            Node headtemp = root1;
            root1 = root2;
            root2 = headtemp;
        }

        return result;
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
