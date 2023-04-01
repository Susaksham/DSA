public class DiameterOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.right.left = new Node(4);
         root.right.left.left = new Node (5);
         root.right.left.left.left = new Node(6);
         root.right.right = new Node(7);
         root.right.right.right = new Node(8);
         root.right.right.right.right = new Node(9);
         diameterOfBinaryTree(root);
        System.out.println(diameter);
        

    }
    static int diameter = 0;
    public static int diameterOfBinaryTree(Node node ){
        if(node == null){
            return 0;
        }
        int leftHeight = diameterOfBinaryTree(node.left);
        int rightHeight =diameterOfBinaryTree(node.right);
        diameter = Math.max(diameter , 1 + leftHeight +  rightHeight);
        return 1 + Math.max(leftHeight , rightHeight);


    }

}
