package tree;

public class Exist {

    static class Node {
        int data;

        Node left, right;

        public Node(int item)
        {
            data = item;
            left = right = null;
        }
    }

    Node root;

    boolean existInTree(int value) {
        return existInTree(root, value);
    }

    private boolean existInTree(Node node, int value) {
        if (node == null)
            return false;
        else {
            boolean inLeft = existInTree(node.left, value);
            boolean inRight = existInTree(node.right, value);
            return node.data == value || inLeft || inRight;
        }
    }

    private int max(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3)
            return n1;
        else if (n2 > n1 && n2 > n3)
            return n2;
        else
            return n3;
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

    public static void main(String[] args) {
        Exist tree = new Exist();

        tree.root = new Node(100);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4000);
        tree.root.left.right = new Node(5);

        System.out.println(tree.existInTree(3));
    }
}
