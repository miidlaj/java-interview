package bst;

public class BST {

    class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    public BST() {
        root = null;
    }

    public void insert(int key) {
        root = insertKey(root, key);
    }

    private Node insertKey(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertKey(root.left, key);
        } else if (key > root.key) {
            root.right = insertKey(root.right, key);
        }

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    public void inOrderRec(Node root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.key + " -> ");
            inOrderRec(root.right);
        }
    }

    void deleteKey(int key) {
        root = deleteRec(root, key);
    }

    private Node deleteRec(Node root, int key) {

        if (root == null) {
            return root;
        }

        if (key < root.key)
            root.left = deleteRec(root.left, key);
        else if (key > root.key)
            root.right = deleteRec(root.right, key);
        else {
            // If the node is with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
        }
        // If the node has two children
        // Place the inorder successor in position of the node to be deleted
        root.key = minValue(root.right);

        // Delete the inorder successor
        root.right = deleteRec(root.right, root.key);

    return root;
}

    // Find the inorder successor
    public int minValue(Node root) {
        int minv = root.key;
        while (root.left != null) {
            minv = root.left.key;
            root = root.left;
        }
        return minv;
    }


    public static void main(String[] args) {
        BST tree = new BST();

        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);




    }
}
