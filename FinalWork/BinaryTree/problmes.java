import java.util.*;

public class problmes extends Main {
    public static void main(String[] args) {

        Node root = CreateBinaryTree(2);
        root.left = CreateBinaryTree(7);
        root.right = CreateBinaryTree(5);
        root.left.left = CreateBinaryTree(2);
        root.left.right = CreateBinaryTree(6);
        root.left.right.left = CreateBinaryTree(5);
        root.left.right.right = CreateBinaryTree(11);
        root.right.right = CreateBinaryTree(9);
        root.right.right.left = CreateBinaryTree(4);

        // System.out.println(GetNumberOfLeafNode(root));
        // System.out.println(GetHeightOfATree(root));
        // PrintAllValuesAtGivenLevel(root, 4);
        // PrintElementsInLevelOrder(root);
        // PrintElementsInLevelOrderUsingQueue(root);
        // PrintElementsInReverseOrder(root);
        // PrintElementsInReverseOrderUsingQueue(root); // line by line is modifed along with it 
        // PrintElementsInLevelOrderUsingQueueLineByLine(root);
        // PrintLeftView(root, 0);
        // PrintRightView(root, 0);
        // BinaryTreeToItsMirrorTree(root);
        // DeleteTree(root);
        // GetLevelOfANode(root, 7);
        System.out.println(GetLevelOfANodeUsingRecursion(root, 7, 1));

    }

    // video - 6
    // get the number of leaf nodes in the binary tree - leaf node = node that have zero child 
    public static int GetNumberOfLeafNode(Node node) {
        if(node == null) {
            return 0 ;
        }
        if(node.left == null && node.right == null) {
            // System.out.println(node.data);
            return 1;
        }
        return ( GetNumberOfLeafNode(node.left) + GetNumberOfLeafNode(node.right) );
    }

    // video - 7
    // height of a tree
    public static int GetHeightOfATree(Node node) {
        if(node == null) {
            return -1 ;
        }
        return Math.max(GetHeightOfATree(node.left), GetHeightOfATree(node.right)) + 1;
        
    }
    
    // video - 8
    // print all the values at a given level
    public static void PrintAllValuesAtGivenLevel(Node node, int level) {
        if(node == null) {
            return ;
        }
        if(level == 1) {
            System.out.print(node.data+" ");
            return;
        }
        PrintAllValuesAtGivenLevel(node.left, level -1);
        PrintAllValuesAtGivenLevel(node.right, level -1) ;
    }

    // video - 9
    // Print elemenst in level order
    // we will use the height and print at given level functions here
    // time - n^2
    public static void  PrintElementsInLevelOrder(Node node) {
        if(node == null) {
            return ;
        }
        int height = GetHeightOfATree(node);
        for(int i=0; i<=height; i++) {
            PrintAllValuesAtGivenLevel(node, i + 1);
            System.out.println();
        }
    }

    // video - 10 
    // Print elemenst in level order
    // we will use Queue 
    // time  - n
    public static void  PrintElementsInLevelOrderUsingQueue(Node node) {
        if(node == null) {
            return ;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.add(node);

        while(Q.size() > 0) {
            Node top = Q.remove();
            System.out.print(top.data+" ");

            if(top.left != null) {
                Q.add(top.left);
            }
            if(top.right != null) {
                Q.add(top.right);
            }
        }
    }

    // video - 11
    // print elemnets in reversal order traversal using recursion
    // time - n^2
    public static void  PrintElementsInReverseOrder(Node node) {
        if(node == null) {
            return ;
        }
        int height = GetHeightOfATree(node);
        for(int i=height; i >= 0; i--) {
            PrintAllValuesAtGivenLevel(node, i + 1);
            System.out.println();
        }
    }

    // video - 12
    // Print elemenst in reverse order
    // we will use Queue 
    // time  - n
    public static void  PrintElementsInReverseOrderUsingQueue(Node node) {
        if(node == null) {
            return ;
        }
        Node newLine = new Node(); // for line by line
        newLine.data = -1;
        Queue<Node> Q = new LinkedList<>();
        Stack<Node> S = new Stack<>();
        Q.add(node);

        while(true) {
            int count = Q.size();
            if (count == 0)
                break;

            while(count > 0) {
                Node top = Q.remove();
                S.push(top);
                
                if(top.right != null) {
                    Q.add(top.right);
                }
                if(top.left != null) {
                    Q.add(top.left);
                }
                // if(top.right != null) {   // complete reverse of the tree
                //     Q.add(top.right);
                // }
                count --;
            }
            S.push(newLine);  // for line by line
        }
       

        while(!S.isEmpty()) {
            Node top = S.pop();
            // if(top == newLine) {
            //     System.out.println();
            //     continue;
            // }
            System.out.print(top.data+" ");
        }
    }

    // video - 13
    // Print elemenst in level order line by line
    // we will use Queue 
    // time  - n
    public static void PrintElementsInLevelOrderUsingQueueLineByLine(Node node) {
        if(node == null) {
            return ;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.add(node);

        while(true) {
            int count = Q.size();
            if(count == 0)
                break;

            while(count > 0) {
                Node top = Q.remove();
                System.out.print(top.data+" ");

                if(top.left != null) {
                    Q.add(top.left);
                }
                if(top.right != null) {
                    Q.add(top.right);
                }
                count --;
            }
            System.out.println();
        }

        
    }

    // video - 14
    // print the left view of the binary tree // super sum 
    static int maxlevel =0;
    public static void PrintLeftView(Node node, int level) {
        if(node == null) {
            return;
        }
        if(level >= maxlevel) {
            System.out.println(node.data);
            maxlevel++;
        }
        PrintLeftView(node.left, level + 1); // level will be same for the all the child of a parent , both child will have its own level variable increment
        PrintLeftView(node.right, level +1);
    }

    // summa i did - to print all the left branch
    public static void AllTheLeftBranch(Node root) {
        if(root == null) {
            return;
        }
        if(root.left != null) 
            System.out.println(root.left.data);
        AllTheLeftBranch(root.left);
        AllTheLeftBranch(root.right);
    } 

    // video - 15
    // print the left view of the binary tree // super sum 
    static int maxlevel2 =0;
    public static void PrintRightView(Node node, int level) {
        if(node == null) {
            return;
        }
        if(level >= maxlevel2) {
            System.out.println(node.data);
            maxlevel2++;
        }
        PrintRightView(node.right, level +1);
        PrintRightView(node.left, level + 1); // level will be same for the all the child of a parent , both child will have its own level variable increment
       
    }

    // video - 16
    // Inorder traversal without using recursion

    // video - 17
    // Preorder traversal without using recursion

    // video - 18
    // Postorder traversal without using recursion

    // video - 19
    // binary tree to its mirror tree
    public static Node BinaryTreeToItsMirrorTree(Node node) {
        if(node == null) {
            return null;
        }
        Node temp = node.left;
        node.left = node.right;
        node.right = temp;

        BinaryTreeToItsMirrorTree(node.left);
        BinaryTreeToItsMirrorTree(node.right);

        return node;
    }

    // video - 20 
    // delete the binary tree
    // we will be using post order
    public static Node DeleteTree(Node root) {
        if(root == null) {
            return null;
        }
        root.left = DeleteTree(root.left);
        root.right = DeleteTree(root.right);
        
        System.out.println(root.data);
        root = null;
        return root;

    }

    // video - 21
    // check if two tree are identical
    // we will traverse both the tree at the same time and check 

    // video - 22
    // level of a given node using queue
    public static void GetLevelOfANode(Node node, int nodeTarget) {
        // int height = GetHeightOfATree(node);

        Queue<Node> Q = new LinkedList<>();
        Q.add(node);
        int level =1;

        while(true) {
            int count = Q.size();
            if(count == 0){
                break;
            }

            while(count > 0) {
                Node top = Q.remove();

                if (top.data == nodeTarget){
                    System.out.println("The given node is in Level : "+level);
                    return;
                }

                if(top.left != null){
                    Q.add(top.left);
                }
                if(top.right != null){
                    Q.add(top.right);
                }

                count --;
            }
            level ++;
        }
    }

    // using recursion 
    public static int GetLevelOfANodeUsingRecursion(Node node, int nodeTarget, int level) {
        if(node == null) {
            return 0 ;
        }

        int l;

        if(node.data == nodeTarget) {
            return level;
        }

        l = GetLevelOfANodeUsingRecursion(node.left, nodeTarget, level + 1);

        if(l !=0 ){
            return l;
        }

        l = GetLevelOfANodeUsingRecursion(node.right, nodeTarget, level + 1);

        
        return l;
    }
}


