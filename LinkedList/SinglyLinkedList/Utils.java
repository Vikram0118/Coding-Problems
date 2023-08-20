class Node {
    // Node(int val) {
    //     this.i = val;
    //     this.next = null;
    // }
    int i;
    Node next;
}

public class Utils {
    public static void main(String[] args) {
        LinkedList L = new LinkedList();
        Node root = null;
        root = L.Insert(1, root);
        root = L.Insert(2, root);
        root = L.Insert(3, root);
        root = L.Insert(4, root);
        root = L.Insert(5, root);
        root = L.Insert(6, root);
        root = L.Insert(7, root);

        // L.PrintLinkedList(root); // recursive

        // root = L.InsertAtFront(root, 7);
        // root = L.InsertAtPosition(root, 99, 0); // recursion
        root = L.deleteLastNode(root);
        L.PrintLinkedList(root);
        System.out.println();




        // root = L.RotateAntiKNodes(root, 2);
        // root = L.Reverse(root);
        // System.out.println();

        // L.PrintLinkedList(root);
    }
}

class LinkedList {

    public Node deleteLastNode(Node node) {
        if(node.next == null) {
            return null;
        }

        Node temp = node;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        return node;
    }

    public Node InsertAtPosition(Node root, int val, int position) {
        Node head = root;

        if(position == 1) {
            Node temp = new Node();
            temp.i = val;
            temp.next = root.next;
            root.next = temp;
            return head;
        }

        InsertAtPosition(root.next, val, position - 1);

        return head;
    }

    public Node InsertAtFront(Node root, int val) {
        if(root == null) {
            return NewNode(val); 
        }
        Node temp = new Node();
        temp.i = val;

        temp.next = root;
        return temp;
    }

    public Node Insert(int val, Node node) {
        if(node == null){
            return NewNode(val);
        } else {
            node.next = Insert(val, node.next); // using recursion
        }
        return node;
    }

    private Node NewNode(int val) {
        Node n = new Node();
        n.i = val;
        n.next = null;
        return n;
    }

    public void PrintLinkedList(Node node) {
        if(node == null) {
            return;
        }
        System.out.print(node.i+" ");
        PrintLinkedList(node.next);
    }

    public int GetSize(Node node) {
        if(node == null) {
            return 0;
        }
        int count = 1;
         
        while(node.next != null) {
            node = node.next;
            count ++;
        }
        return count;
    }

    public Node RotateAntiKNodes(Node root, int k) {
        Node temp = root.next;
        Node last = root;
        while(last.next != null){
            last = last.next;
        }
        while(k>0) {
            last.next = root;
            last = last.next;
            root = temp;
            temp = root.next;
            last.next = null;
            k--;
        }
        return root;
    }

    public Node Reverse(Node root) {
        Node pre = null;
        Node next = null;
        Node current = root;

        while(current != null) {
            next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }

        return pre; 
    }
}