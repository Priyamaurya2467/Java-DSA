public class intro {
    public static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value  = value;
        }
    }
    public static void display(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value + " -> ");
        if(root.left != null){
            System.out.print(root.left.value + " , ");
        }
        else{
            System.out.print("Null , ");
        }

        if(root.right != null){
            System.out.print(root.right.value + " ");
        }
        else{
            System.out.print("Null");
        }
        System.out.println();

        display(root.left);
        display(root.right);


    }
    public static int size(Node root){
        if(root == null){
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }
    public static int sum(Node root){
        if(root == null){
            return 0;
        }
        return root.value + sum(root.left) + sum(root.right);
    }

    public static int product(Node root){
        if(root == null){
            return 1;
        }
        return root.value * product(root.left) * product(root.right);
    }
    public static int max(Node root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        int a = root.value;
        int b = max(root.left);
        int c = max(root.right);
        return Math.max(a, Math.max(b, c));
    }

    public static int min(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int a = root.value;
        int b = max(root.left);
        int c = max(root.right);
        return Math.min(a, Math.min(b, c));
    }

    public static int height(Node root){
        if(root == null || root.left == null && root.right == null){
            return 0;
        }

        return 1 + Math.max(height(root.left), height(root.right));
    }

    public static void preorder(Node root){
        //preorder is root left right
        if(root == null){
            return;
        }
        System.out.println(root.value);
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root){
        //preorder is root left right
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.value);

        inorder(root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(2);
        Node a =  new Node(4);
        Node b = new Node(10);

        root.left = a;
        root.right = b;
        Node c = new Node(6);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(11);
        b.right = e;

        display(root);
        System.out.println(size(root));
        System.out.println(sum(root));
        System.out.println(max(root));
        System.out.println(min(root));
        System.out.println(height(root));
        System.out.println(product(root));

        preorder(root);


        System.out.println("inorder");

        inorder(root);
    }



}
