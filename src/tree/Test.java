package tree;

import bst.BinarySearchTree;

public class Test {

    static class Node {

        int data;

        Node left, right;

        public Node(int item) {
            this.data = item;
            left = right = null;
        }
    }

    Node root;

    void mirror() {
        root = mirror(root);
    }

    private Node mirror(Node node) {

        if (node == null)
            return node;

        Node left = mirror(node.left);
        Node right = mirror(node.right);

        node.left = right;
        node.right = left;

        return node;
    }

    void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node == null)
            return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    public boolean isBinarySearchTree() {

        return isBinarySearchTree(root);
    }

    private boolean isBinarySearchTree(Node node) {

        if (node.data < node.left.data && node.data > node.right.data)
            return false;

        boolean isLeft = isBinarySearchTree(node.left);
        boolean isRight = isBinarySearchTree(node.right);

        if (isLeft && isRight)
            return true;
        else
            return false;
    }


    public static void main(String[] args) {

        Test tree = new Test();

        tree.root = new Test.Node(2);
        tree.root.left = new Test.Node(1);
        tree.root.right = new Test.Node(3);
        tree.root.left.left = new Test.Node(4);
        tree.root.left.right = new Test.Node(5);

//        System.out.println("Inorder traversal of tree is ");
//        tree.inOrder();
//
//        System.out.println();
//
//        tree.mirror();
//        System.out.println("Inorder traversal of mirror tree is ");
//        tree.inOrder();

        System.out.println(tree.isBinarySearchTree());
    }
}
