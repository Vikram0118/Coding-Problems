class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Linked {

//-----------insert at end----------------
    public Node insertNode(int data, Node node){
        if(node == null) {
            return createNode(data);
        } else {
            // recursively
            node.next = insertNode(data, node.next);
        }
        return node;
    }

    private Node createNode(int data){
        Node node = new Node(data);
        return node;
    }

//----------print the list-------------
    public void printList(Node root){
        if(root == null) {
            return; 
        } else {
            // recursively
            System.out.print(root.data+" ");
            printList(root.next);
        }
    }

//---------insert at front---------------
    public Node insertAtFront(int data, Node node) {
        Node a = createNode(data);
        if(node == null ) {
            return a;
        } else {
            a.next = node;
            node = a;
        }
        return node;
    }

//----------inserting at a given position--------------
    public Node insertAtPosition(int p, int data, Node root) {
        int i=1;
        Node temp = new Node(data);
        Node firstNode = root;
        if(p==1){
            firstNode = insertAtFront(data, root);
        } else if(p < 1 ){
            System.out.println((p==0) ? "POSITION CANNOT BE EQUAL TO ZERO" : "POSITION CANNOT BE NEGATIVE");
        } else {
            // ------iterative----------
            while(i<p-1){
                root = root.next;
                if(root==null){
                    System.out.println("THE GIVEN POSITION IS EXSIDING THE LENGTH OF THE LIST") ;
                    System.out.println("THE LENGTH OF THE LIST IS : "+i) ;
                    return null;
                }
                i++;
            }
            temp.next = root.next;
            root.next = temp;
        }
        return firstNode;
    }
}

public class Main {
    public static void main(String[] args) {
        Node root = null;
        Linked linked = new Linked();

        root = linked.insertNode(12, root);
        root = linked.insertNode(99, root);
        root = linked.insertNode(37, root);

        linked.printList(root);
        System.out.println();

        // root = linked.insertAtFront(3, root);
        // root = linked.insertAtPosition(-5, 67, root);

        linked.printList(root);
    }    
}