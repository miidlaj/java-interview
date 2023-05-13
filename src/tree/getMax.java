package tree;

public class getMax {

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

    int getMax() {
        return getMax(root);
    }

    private int getMax(Node node) {
        if (node == null)
            return 0;
        else {
            int leftMax = getMax(node.left);
            int rightMax = getMax(node.right);
            return max(node.data, leftMax, rightMax);
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
        getMax tree = new getMax();

        tree.root = new Node(100);
        tree.root.left = new Node(10);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4000);
        tree.root.left.right = new Node(5);

        System.out.println(tree.getMax());
    }
}
