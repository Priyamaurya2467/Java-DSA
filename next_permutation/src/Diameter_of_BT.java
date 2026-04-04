public class Diameter_of_BT {

    static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data = data;
            left=right=null;

        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(diameter(root));

    }

    public static int diameter(Node root){
        int diameter = 0;
        height(root,diameter);
        return diameter;
    }
    public static int height(Node root ,  int diameter ){
        if(root==null){
            return 0;
        }
        int left=height(root.left,diameter);
        int right=height(root.right,diameter);
        diameter = Math.max(diameter,left+right);
        return Math.max(left,right)+1;
    }
}
