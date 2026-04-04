public class balanced_tree {
    static class TreeNode {
        int data; // Data stored in the node
        TreeNode left; // Reference to the left child
        TreeNode right; // Reference to the right child

        // Constructor to initialize a node with data and null children
        public TreeNode(int key) {
            data = key;
            left = null;
            right = null;
        }

    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(balanced(root));


    }

    public static boolean balanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int lh = height(root.left);
        int rh = height(root.right);

        if(Math.abs(lh - rh) > 1) {
            return false;
        }
        return true;


    }
    public static int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
}
