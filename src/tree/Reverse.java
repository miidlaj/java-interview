package tree;

public class Reverse {

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

    void reverse() {
        reverse(root);
    }

    private void reverse(Node node) {
        if (node == null)
            return;
        else {
            reverse(node.left);
            reverse(node.right);

            Node temp = node.left;
            node.left = node.right;
            node.right = temp;
        }
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
        Reverse tree = new Reverse();

        tree.root = new Node(100);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4000);
        tree.root.left.right = new Node(5);

        tree.inOrder();

        System.out.println();

        tree.reverse();
        tree.inOrder();
    }
}
