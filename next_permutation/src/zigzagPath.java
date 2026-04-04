import java.util.ArrayList;

public class zigzagPath {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.right = new Node(1);
        root.right.left = new Node(1);
        root.right.right = new Node(1);
        root.right.right.left = new Node(1);
        root.right.right.right = new Node(1);
        root.right.right.left.right = new Node(1);
        root.right.right.left.right.right = new Node(1);

        System.out.println(zigzagLevelOrder(root));
    }

    public static int zigzagLevelOrder(Node root){
        int maxSum = 0;
        solve(root,0,true,0);
        solve(root,0,false,0);
        return maxSum;
    }

    public static void solve(Node root, int step, boolean goLeft,int maxSum ){
        if(root == null){
            return;
        }
        maxSum = Math.max(maxSum,step);
        if(goLeft){
            solve(root.left,step+1,false,maxSum);
            solve(root.right,1,true,maxSum);
        }
        else{
            solve(root.right,step+1,true,maxSum);
            solve(root.left,1,false,maxSum);
        }
    }
}
