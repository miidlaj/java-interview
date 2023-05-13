package tree;



public class MirrorTree {

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

    public static void main(String[] args) {
        MirrorTree tree = new MirrorTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Inorder traversal of tree is ");
        tree.inOrder();

        System.out.println();

        tree.mirror();
        System.out.println("Inorder traversal of mirror tree is ");
        tree.inOrder();

    }


}
