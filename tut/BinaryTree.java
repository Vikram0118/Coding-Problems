
// only thing that you have to understand in binary tree is that - 
// if you understand the logic of a single node
// that do that recursively that would given you the answer

// inorder traversal =  ( left - root - right ) ::: preorder traversal =  ( root - left - right ) ::: inorder traversal =  ( left - right - root )
// hard : height of thr tree/node
// medium : leftview of the tree

class Node {
    int data;
    Node left;
    Node right;
}

class BinaryTreeMethods {

    public Node createNode (int data){
        Node a = new Node();
        a.data = data;
        a.left = null;
        a.right = null;
        return a;
    }

    // inorder traversal =  ( left - root - right )
    public static void inorderTraversal(Node root) {
        if(root == null) {
            return ;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    // preorder traversal =  ( root - left - right )
    public static void preorderTraversal(Node root) {
        if(root == null) {
            return ;
        }
        System.out.print(root.data+" ") ;
        preorderTraversal(root.left);
        preorderTraversal(root.right);

    }

    // postorder traversal =  ( left - right - root )
    public static void postorderTraversal(Node root) {
        if(root == null){
            return;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static int sumOfAllNodes(Node root) {
        int sum =0;
        if(root == null){
            return sum ;
        }
        sum += root.data;            // pre order
        int s1 = sumOfAllNodes(root.left);
        int s2 = sumOfAllNodes(root.right);    // nane panna just after listening the idea
        return sum + s1 + s2;
    }

    // sum of nodes nane pattutu i started taking rest and after some 3 hrs did his. at that time i forgot even how i did sum of nodes :(
    public static int differnceOfEvenAndOddLevels(Node root){
        if(root == null){     
            return 0;
        }
        return root.data - differnceOfEvenAndOddLevels(root.left) - differnceOfEvenAndOddLevels(root.right); // video pathu tha panna 
    }

    // get number of nodws in binary tree
    public static int numberOfNodes(Node root){
        int sum =0;
        if(root == null){
            return 0;
        }     
        sum += 1; // pre order
        return sum + numberOfNodes(root.left) + numberOfNodes(root.right);
    }

    public static int numberOfLeftNodes(Node root){
        int sum = 0 ;
        if(root == null){
            return 0;
        }
        if(root.left != null){
            sum += 1;
        }
        return sum + numberOfLeftNodes(root.left) + numberOfLeftNodes(root.right) ;
    }

    public static int numberOfLeafNodes(Node root){
        // int sum = 0 ;   // zero space utilization 
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null ){
            // sum += 1;
            return 1;
        }
        // return sum + numberOfLeftNodes(root.left) + numberOfLeftNodes(root.right) ;
        return  numberOfLeftNodes(root.left) + numberOfLeftNodes(root.right) ;
    }

    // height of a node = maximum length of the edge in that node; // hard
    public static int heightOfTheNode(Node root) {
        
        if(root == null ){
            return -1;
        } 

        return 1 + ((heightOfTheNode(root.left) > heightOfTheNode(root.right)) ? heightOfTheNode(root.left) : heightOfTheNode(root.right));
    }

    // print level wise elements 
    public static void printLevelWiseElements(Node root, int level){
        if(root == null){
            return;
        }
        if(level == 1) {
            System.out.print(root.data+" ");
            return;
        }
        level --;
        printLevelWiseElements(root.left, level);
        printLevelWiseElements(root.right, level);
    }

    // printing elements in level order 
    public static void printElementsInLevelOrder(Node root) {
        // first i will get the height of the tree 
        int height = heightOfTheNode(root);

        for(int i=1 ; i<=height + 1 ; i++){
            printLevelWiseElements(root, i) ;
            System.out.println();
        }
    }

    // reverse level order 
    public static void printReverseLevelElements(Node root){
        int height = heightOfTheNode(root);

        for(int i=height +1; i>0; i--){
            printLevelWiseElements(root, i);
            System.out.println();
        }
    }

    // right view of the tree
    static int max = 0;
    public static void printRightView(Node root, int level) {
        if(root == null) {
            return;
        }
        if( level >= max) {
            System.out.println(root.data);
            max ++;
        }
        // printRightView(root.left, level +1);   // left view
        // printRightView(root.right, level +1);

        printRightView(root.right, level +1);     // right view
        printRightView(root.left, level +1);
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node();
        BinaryTreeMethods binary = new BinaryTreeMethods();
        root = binary.createNode(2);
        root.left = binary.createNode(7);
        root.right = binary.createNode(5);
        root.left.left = binary.createNode(2);
        root.left.right = binary.createNode(6);
        root.left.right.left = binary.createNode(5);
        root.left.right.right = binary.createNode(11);
        root.right.right = binary.createNode(9);
        root.right.right.left = binary.createNode(4);

        System.out.println();

        // System.out.println("INORDER TRAVERSAL :");
        // BinaryTreeMethods.inorderTraversal(root);
        // System.out.println("\n");

        // System.out.println("PREORDER TRAVERSAL :");
        // BinaryTreeMethods.preorderTraversal(root);
        // System.out.println("\n");

        // System.out.println("POSTORDER TRAVERSAL :");
        // BinaryTreeMethods.postorderTraversal(root);
        // System.out.println("\n");

        // System.out.println("SUM OF ALL THE NODES : "+BinaryTreeMethods.sumOfAllNodes(root));
        // System.out.println("SUM OF ALL THE NODES : "+BinaryTreeMethods.differnceOfEvenAndOddLevels(root));
        // System.out.println("SUM OF ALL THE NODES : "+BinaryTreeMethods.numberOfNodes(root));
        // System.out.println("SUM OF ALL THE NODES : "+BinaryTreeMethods.numberOfLeftNodes(root));
        // System.out.println("SUM OF ALL THE NODES : "+BinaryTreeMethods.numberOfLeafNodes(root));
        // System.out.println("SUM OF ALL THE NODES : "+BinaryTreeMethods.heightOfTheNode(root));

        // BinaryTreeMethods.printLevelWiseElements(root, 3);
        // BinaryTreeMethods.printElementsInLevelOrder(root);
        // BinaryTreeMethods.printReverseLevelElements(root);
        // BinaryTreeMethods.printLeftView(root);
        BinaryTreeMethods.printRightView(root, 0);
    }
}