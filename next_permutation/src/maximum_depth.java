import java.util.LinkedList;
import java.util.Queue;

public class maximum_depth {
    static class Node {
        int data; // Data stored in the node
        Node left; // Reference to the left child
        Node right; // Reference to the right child

        // Constructor to initialize a node with data and null children
        public Node(int key) {
            data = key;
            left = null;
            right = null;
        }
    }

        public static void main(String[] args) {
            // Create the root node
           Node root = new Node(1);
           root.left = new Node(2);
           root.right = new Node(3);
           root.left.left = new Node(4);
           root.left.right = new Node(5);

            System.out.println(minDepth(root));
        }

        public static int minDepth(Node root) {
//        if (root == null) return 0;
//
//        Queue<Node> queue = new LinkedList<>();
//        int depth = 1;
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            int size = queue.size();
//            for (int i = 0; i < size; i++) {
//                Node temp = queue.poll();
//
//                if (temp.left == null && temp.right == null) {
//                    return depth;
//                }
//                if (temp.left != null) {
//                    queue.add(temp.left);
//                }
//                if (temp.right != null) {
//                    queue.add(temp.right);
//                }
//            }
//                depth++;
//            }
//
//        return depth;

            if (root == null) return 0;
            if (root.left == null && root.right == null) return 1;
            int l = root.left != null ? minDepth(root.left) : Integer.MAX_VALUE;
            int r = root.right != null ? minDepth(root.right) : Integer.MAX_VALUE;
            return 1 + Math.min(l, r);
        }
    }


