
class three {
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
        root = L.InsertNode(root, 8);

        L.PrintList(root);
        System.out.println();
        root = ReverseForKNode(root, 3);
        L.PrintList(root);
    }

    public static Node ReverseForKNode(Node root, int k) {
        int length = 0;
        Node temp = root;
        Node result = root;

        while(temp != null) {
            ++length; temp = temp.next;
        }
        Node pre = null;
        Node curr = null;
        Node head = root;
        System.out.println("length : "+length);

        while(length >= k) {
            curr = head.next;
            pre = curr.next;

            int i=1;
            while(i < k) {
                // 1 2 3
                // 2 1 3
                // 2 3 1
                curr.next = pre.next;
                pre.next = head.next;
                head.next = pre;
                pre = curr.next;
                i++;
            }
            head = curr;

            length -= k;
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
