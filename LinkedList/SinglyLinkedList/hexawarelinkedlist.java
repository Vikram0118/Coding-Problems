class hexawarelinkedlist {
    public static void main(String[] args) {

        Solution S = new Solution();

        LinkedList L1 = new LinkedList();
        Node root1 = null;
        root1 = L1.Insert(1, root1);
        root1 = L1.Insert(2, root1);
        root1 = L1.Insert(3, root1);

        Node root2 = null;
        root2 = L1.Insert(4, root2);
        root2 = L1.Insert(5, root2);
        root2 = L1.Insert(6, root2);

        L1.PrintLinkedList(root1);
        System.out.println();
        L1.PrintLinkedList(root2);
        System.out.println();

        // S.reverseGetSum(root1);
        // S.reverseGetSum(root2);
        Node ans = S.getAddedList(S.reverseGetSum(root1), S.reverseGetSum(root2));
        L1.PrintLinkedList(ans);
    }
}

    class Solution {
        public int reverseGetSum(Node node) {
            StringBuilder S = new StringBuilder();
            while(node != null) {
                S.insert(0, node.i);
                node = node.next;
            }
            return Integer.parseInt(S.toString());
        }

        public Node getAddedList (int n, int m) {
            LinkedList L1 = new LinkedList();
            String str = Integer.toString(n + m);
            // System.out.println(str);
            Node result  = null;

            for(int i=str.length() -1 ;i>=0; i--) {
                result = L1.Insert(Integer.parseInt(String.valueOf(str.charAt(i))), result);
            }
            return result;
        }


    }

    class LinkedList {
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
    }

    class Node {
        int i;
        Node next;
    }
