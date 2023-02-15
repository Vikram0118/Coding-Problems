
class Node {
    int data;
    Node next;
}

class Linked {

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
        Node node = new Node();
        node.data = data;
        node.next = null;
        return node;
    }

    public void printList(Node root){
        if(root == null) {
            return; 
        } else {
            // recursively
            System.out.print(root.data+" ");
            printList(root.next);
        }
    }
}

public class Recursive {
    public static void main(String[] args) {
        Node root = null;
        Linked linked = new Linked();

        root = linked.insertNode(12, root);
        root = linked.insertNode(99, root);
        root = linked.insertNode(37, root);

        linked.printList(root);
    }    
}