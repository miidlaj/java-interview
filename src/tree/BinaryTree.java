package tree;

public class BinaryTree {
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        private TreeNode(int data) {
            this.data = data;
            left = right = null;
        }
    }

    TreeNode root;

    public BinaryTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {

        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        // Insert the new node in the left subtree
        root.left = insertRec(root.left, data);

        return root;
    }


    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
    }
    public static void main(String[] args) {

    }
}
