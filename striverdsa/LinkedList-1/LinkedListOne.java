class Node {
    int data;
    Node next;
}

class Linked{
    public Node insertNode(Node root, int data){
        Node first = root;
        if(root == null){
            return createNode(root, data);
        } else {
            Node temp = createNode(root, data);
            while(root.next != null){
                root = root.next;
            }
            root.next = temp;
        }
        return first;
    }

    private Node createNode(Node root, int data){
        Node temp = new Node();
        temp.data = data;
        temp.next = null;
        return temp;
    }

    public void printList(Node root){
        while(root != null){
            System.out.print(root.data+" ");
            root = root.next;
        }
    }

    public int lenthgOfList(Node root) {
        int length =0;
        while(root != null){
            root = root.next;
            length++;
        }
        return length;
    }

    public Node reverseList(Node root) {
        
        if(root == null || root.next == null){
            return root;
        } else{
            // Node temp = null;
            // Node curr = root.next;
            // while(curr != null){
            //     root.next = temp;
            //     temp = root;
            //     root = curr;
            //     curr = curr.next;
            // }
            // root.next = temp;

            Node temp = null;
            Node next = null;
            while(root != null) {
                next = root.next;
                root.next = temp;
                temp = root;
                root = next;
            }
            root = temp;
        }
        return root;
    }

    public Node middleNode(Node root){
        if(root == null || root.next == null){
            return root;
        } else {
            Node a = root;
            // Node b = root;
            Node b = root.next;
            while(b != null && b.next != null){
                a = a.next;
                b = b.next.next;
            }
            root = a;
        }
        return root;
    }

    public Node mergeSort(Node root){
        if(root == null || root.next == null){
            return root;
        }
        Node middle = middleNode(root);
        Node next = middle.next;
        middle.next = null;
        return merge(mergeSort(root), mergeSort(next));        
    }

    public Node merge(Node a, Node b){
        Node temp = new Node();
        Node first = temp;

        while(a!=null && b != null){
            if(a.data<b.data){
                temp.next =a;
                a = a.next;
            } else {
                temp.next = b;
                b= b.next;
            }
            temp = temp.next;
        }
        temp.next = (a==null) ? b : a;
        return first.next;
    }

    public Node removeNthNodeFromBack(Node root, int data) {
        Node first = root;
        int length = lenthgOfList(root);
        if(data == length){
            root = root.next;
            return root;
        }
        int position = length - data;
        while(position > 1) {
            root = root.next;
            position--;
        }
        if(root.next.next == null){
            root.next = null;
            return first;
        } else {
            Node temp = root.next.next;
            root.next = temp;
            return first;
        }
    }
}

class LinkedListOne {
    public static void main(String[] vikram) {
        Node root = null;
        Linked linked = new Linked();
        // Reverse reverse = new Reverse();

        root = linked.insertNode(root, 5);
        root = linked.insertNode(root, 4);
        // root = linked.insertNode(root, 1);
        root = linked.insertNode(root, 2);
        root = linked.insertNode(root, 33);
        // root = linked.insertNode(root, 14);
        // root = linked.insertNode(root, 5);

        // root  = linked.reverseList(root);
        // linked.printList(root);

        // root = linked.middleNode(root);
        // root = linked.mergeSort(root);
        root = linked.removeNthNodeFromBack(root, 4);

        linked.printList(root);
        // System.out.println("THE MIDDLE ELEMENTS IS : "+root.data);
    }
}
