public class IdenticalCheck {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(5);
        root2.left.left = new Node(3);
        root2.left.right = new Node(4);
        root2.right.left = new Node(6);
        root2.right.right = new Node(7);
        System.out.println(identicalCheck(root , root2));
    }
    public static boolean identicalCheck(Node root , Node root2){
        if(root == null || root2 == null ){
            return root == root2;
        }
       return root.data == root2.data &&  identicalCheck(root.left , root2.left) && identicalCheck(root.right , root.right);
    }
}
