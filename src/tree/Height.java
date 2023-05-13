package tree;

public class Height {

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

    int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node node) {
        if (node == null)
            return 0;
        else {
            int leftHeight = getHeight(node.left);
            int rightHeight = getHeight(node.right);
            return 1 + max(leftHeight, rightHeight);
        }
    }

    private int max(int n1, int n2) {
        if (n1 > n2)
            return n1;
        else
            return n2;
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
        Height tree = new Height();

        tree.root = new Node(100);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4000);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(5);
        tree.root.left.left.left.left = new Node(5);



        System.out.println(tree.getHeight());
    }
}
