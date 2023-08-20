
class two {
    public static void main(String[] args) {
        Node root1 = null;
        Node root2 = null;
        utils L = new utils();   

        root1 = L.InsertNode(root1, 1);
        root1 = L.InsertNode(root1, 3);
        root1 = L.InsertNode(root1, 1);
        root1 = L.InsertNode(root1, 2);
        Node temp = root1.next.next.next;
        root1 = L.InsertNode(root1, 4);

        root2 = L.InsertNode(root2, 3);
        root2.next = temp;

        System.out.println(DetectIntersection(root1, root2).i);
    }

    // it cane be done using hashing easily

    public static Node DetectIntersection(Node head1, Node head2) {
        //  using their length 
        int diff = getDifference(head1,head2);
        System.out.println("differnece : "+diff);
        if(diff < 0) 
            while(diff++ != 0) head2 = head2.next; 
        else while(diff-- != 0) head1 = head1.next;
        while(head1 != null) {
            if(head1 == head2) return head1;
            head2 = head2.next;
            head1 = head1.next;
        }
        return head1;
    }

    static int getDifference(Node head1,Node head2) {
     int len1 = 0,len2 = 0;
        while(head1 != null || head2 != null) {
            if(head1 != null) {
                ++len1; head1 = head1.next;
            }
            if(head2 != null) {
                ++len2; head2 = head2.next;
            }
            
        }
        System.out.println("len1 : "+len1);
        System.out.println("len2 : "+len2);
        return len1-len2;//if difference is neg-> length of list2 > length of list1 else vice-versa
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
