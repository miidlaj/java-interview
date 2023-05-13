package tree;

public class Sum {

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

    int getSum() {
      return getSum(root);
    }

    private int getSum(Node node) {
        if (node == null)
            return 0;
        else {
            int leftSum = getSum(node.left);
            int rightSum = getSum(node.right);
            return node.data + leftSum + rightSum;
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
        Sum tree = new Sum();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println(tree.getSum());
    }
}
