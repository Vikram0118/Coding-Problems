class Node {
    int data;
    Node next;

    // Node(int data) {   // chat gpt
    //     this.data = data;
    //     next = null;
    // }
}

class Linked {
    public Node insertNode(int data, Node node){
        Node firstNode = node;
        if(node == null) {
            return createNode(data);
        } else {
            while(node.next != null) {
                node = node.next;
            }
            node.next = createNode(data);
        }
        return firstNode;
    }

    private Node createNode(int data) {
        // Node a = new Node(data);
        Node a = new Node();
        a.data = data;
        a.next = null;
        return a;
    }

    public void printList(Node root){
        if(root == null) {
            System.out.println("THE LIST IS EMPTY");
        } else {
            while(root != null) {
                System.out.print(root.data+" ");
                // System.out.print(root+" ");
                root = root.next;
            }
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
        Node temp = new Node();
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
            System.out.println(root.data);
            temp.next = root.next;
            root.next = temp;
        }
        return firstNode;
    }

    //----------delete node at last-------
    public Node deleteAtLast(Node root){
        Node temp = root;
        while(root.next.next != null){
            root = root.next;
        }
        root.next = null;
        return temp;
    }

    //----------delete node at first-------
    public Node deleteAtFirst(Node root){
        if(root == null){
            System.out.println("THE LIST IN EMPTY");
            return null;
        } 
        return root.next; // both are same gavani
        // return root = root.next;
    }

    //--------------delete at a givenn position------------
    public Node deleteAtPosition(int p, Node root){
        int i=1;
        Node firstNode = root;
        Node temp = null;
        if(p==1){
            return firstNode = deleteAtFirst( root);
        } else if(p < 1 ){
            System.out.println((p==0) ? "POSITION CANNOT BE EQUAL TO ZERO" : "POSITION CANNOT BE NEGATIVE");
            return firstNode;
        } else {
            while(i<p-1){
                // System.out.println(i);

                root = root.next; // romba kolambitan
                i++;
        
                if(root.next == null) {
                    System.out.println("THE GIVEN POSITION IS EXSIDING THE LENGTH OF THE LIST") ;
                    System.out.println("THE LENGTH OF THE LIST IS : "+i) ;
                    return firstNode; 
                } 
            }
            temp = root.next.next;
            root.next = temp; 
        }
        System.out.println(root.data);
        return firstNode;
    }

    //----------getting the size of the linked list--------------
    public int getSize(Node node) {
        int count =1;
        while(node.next != null ) {
            node = node.next;
            count ++;
        }
        return count;
    }

    //------chech if the given node exsists-------
    public Boolean ifExists(int data, Node root){
        int size = getSize(root);
        for(int i=0; i<size; i++){
            if(root.data == data){
                return true;
            } else {
                root = root.next;
            }
        }
        return false;
    }

    //-----rotate the list clockwise--------
    public Node rotateClockWise(Node root){
        int size = getSize(root);
        Node temp = root;
        Node last = null;
        for(int i=0; i<size-1; i++){
            last = temp;
            temp = temp.next;
        }
        temp.next = root;
        last.next = null;
        return temp;
        // System.out.println(temp.data);
        // System.out.println(last.data);
        // return root;
    }

    //-----rotate the list anticlockwise by k nodes--------
    public Node rotateAntiClockWiseByKNodes(int k, Node root){
        int size = getSize(root);
        Node temp = root;
        for(int i=0; i<size-1; i++){
            temp = temp.next;
        }
        Node second = root.next;

        for(int i=0; i<k; i++){
            temp.next = root;
            temp = temp.next;
            root = second;
            second = second.next;
            temp.next = null;
        }
        // temp.next = root;
        // return temp;
        // System.out.println(temp.data);
        // System.out.println(root.data);
        return root;
    }

    //-----reverse--------
    public Node reverse(Node root) {
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

    //------------middele node-------------

    public Node middleNode(Node root) {   // understanding the logic
        Node a = root;
        Node b = root.next;

        while(b != null && b.next != null) {
            a=a.next;
            b=b.next.next;
        }
        return a;
    }

    // ------------sort the list-------merge sort--------------

    public Node mergeSorted(Node root, int p) {

        if(root ==null || root.next == null) {
            return root;
        }

        Node middleNode = middleNode(root);
        Node seondHalf = middleNode.next;
        middleNode.next = null;

        Node temp = new Node();

        if(p==1){
            temp = mergeIncrese(mergeSorted(root, p) , mergeSorted(seondHalf, p));
        } else {
            temp = mergeDecrese(mergeSorted(root, p) , mergeSorted(seondHalf, p));
        }
        return temp;
    }

    public Node mergeIncrese(Node a, Node b){
        Node temp = new Node();
        Node finalList = temp;

        while(a!=null && b!=null){
            // System.out.println("debug");
            if(a.data < b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }

        temp.next = (a==null) ? b : a;
        return finalList.next;
    }

    public Node mergeDecrese(Node a, Node b){
        Node temp = new Node();
        Node finalList = temp;

        while(a!=null && b!=null){
            // System.out.println("debug");
            if(a.data < b.data) {
                temp.next = b;
                b = b.next;
            } else {
                temp.next = a;
                a = a.next;
            }
            // else if(a.data > b.data) {
            //     temp.next = a;
            //     a = a.next;
            // }
            // else {
            //     temp.next = a;
            //     a = a.next;
            //     b = b.next;
            // }
            temp = temp.next;
        }

        temp.next = (a==null) ? b : a;
        return finalList.next;
    }

    //------------merge two linked list--------------

    public Node mergeTwoLL(Node root1, Node root2, int p) {

        if(root1 ==null || root2 == null){
            if(root1 ==null && root2 == null){
                System.out.println("CANNOT MERGE TWO NULL LIST");
            }
            return ( (root1 == null) ? mergeSorted(root2 , p) : mergeSorted(root1 ,p) );
        }

        Node first = root1;

        while(root1.next != null) {
            root1 = root1.next;
        }
        root1.next = root2;
        // System.out.println(p);

        first = mergeSorted(first, p);

        return first;
    }

    public Node getIntersect(Node a, Node b) {
        a = mergeSorted(a, 1);
        // printList(a);
        // System.out.println();
        b = mergeSorted(b, 1);
        // printList(b);
        Node temp = new Node();
        Node first = temp;
        while(a != null && b != null){
            if(a.data == b.data){
                temp.next = a;
                a = a.next;
                b = b.next;
            } else if(a.data < b.data) {
                a = a.next;
                continue;
            } else {
                b = b.next;
                continue;
            }

            temp = temp.next;
            temp.next = null;
            // System.out.println(temp.data);
        }

        return first.next;
    }

    public Node getUnion(Node a, Node b) {
        a = mergeSorted(a, 1);
        printList(a);
        System.out.println();
        b = mergeSorted(b, 1);
        printList(b);
        System.out.println();
        Node temp = new Node() ;
        Node first = temp;

        while(a != null || b != null) {
            if(a == null || b == null){
                temp.next = (a==null) ? b: a;
                if(a == null)
                    b = b.next;
                else if(b == null)
                    a = a.next;
            }else if(a.data == b.data) {
                temp.next = a;
                a = a.next;
                b = b.next;
            } else if(a.data < b.data) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
            temp.next = null;
        }
        return first.next;
    }

    public Node getLowestCommon(Node a,Node b) {
        a = mergeSorted(a, 1);
        b = mergeSorted(b, 1);

        while( a!=null && b!=null ){
            if(a.data == b.data){
                return a;
            } else if(a.data<b.data){
                a= a.next;
            } else{
                b= b.next;
            }
        }
        return null;
    }

    //----------remove duplicate from a sorted linked list------------

    public Node removeDuplicate(Node root) {
        Node temp = new Node();
        Node first = temp;
        temp.next = root;
        temp = temp.next;
        int count=0, i = 0;
        while(root != null) {
            
            if(root.data != temp.data) {
                System.out.println(i+" OCCURED "+count+" TIMES");
                count=1;
                // System.out.println(root.data);
                temp.next = root;
                temp = temp.next;
            } else {
                count++;
            }
            i = root.data;
            root = root.next;
        }
        System.out.println(i+" OCCURED "+count+" TIMES");  // eppadilam panna kudathu pa thambi :(

        return first.next;
    }
}

public class Iterative {
    public static void main(String[] args) {


        Node root1 = null;
        // Node root2 = null;
        Node root3 = new Node() ;
        Linked linked = new Linked();

        root1 = linked.insertNode(8, root1);
        root1 = linked.insertNode(8, root1);
        root1 = linked.insertNode(8, root1);
        root1 = linked.insertNode(13, root1);
        root1 = linked.insertNode(34, root1);
        root1 = linked.insertNode(37, root1);
        root1 = linked.insertNode(37, root1);
        root1 = linked.insertNode(45, root1);

        // root2 = linked.insertNode(18, root2);
        // root2 = linked.insertNode(14, root2);
        // root2 = linked.insertNode(8, root2);
        // root2 = linked.insertNode(18, root2);
        // root = linked.insertNode(18, root);

        // linked.printList(root1);
        // System.out.println();

        // root = linked.insertAtFront(3, root);
        // root = linked.insertAtPosition(3, 2, root);
        // root = linked.deleteAtLast(root);
        // root = linked.deleteAtFirst(root);
        // root = linked.deleteAtPosition(0, root);
        // int size = linked.getSize(root);
        // System.out.println("THE SIZE OF THE LIST : "+size);
        // System.out.println(linked.ifExists(16, root));
        // root = linked.rotateClockWise(root);
        // root = linked.rotateAntiClockWiseByKNodes(2, root);
        // root = linked.reverse(root);    //IMPORTANT
        // System.out.println(linked.middleNode(root)); // jumping method
        // p == ( 1 - increasing order ) - ( 2 - decreasing order )
        // root = linked.mergeSorted(root);
        // root3 = linked.mergeTwoLL(root1, root2, 2);
        // root3 = linked.getIntersect(root1, root2);
        // root3 = linked.getUnion(root1, root2);
        // root3 = linked.getLowestCommon(root1, root2);
        // System.out.println((root3 != null) ? "LEAST COMMON VALUE IN THE LIST : "+root3.data : "THE LIST HAVE NO COMMON VALUE");
        
        root3 = linked.removeDuplicate(root1);
        linked.printList(root3);
    }
}
