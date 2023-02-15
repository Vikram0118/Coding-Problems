package tut.Binary_Tree;

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
}

class BinaryTree {
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
        root.right.right.left = binary.createNode(4);
    }
}