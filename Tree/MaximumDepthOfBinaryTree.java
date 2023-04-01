public class MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        root.left.left.left = new Node(880);
        System.out.println(maximumDepth(root ));

    }
    public static int maximumDepth( Node node){
        if(node == null){
            return 0;
        }
        int left = maximumDepth(node.left);
        int right = maximumDepth(node.right);
        return 1 + (Math.max(left , right));
    }
    public static int maximumDepthOfBinaryTree(Node node , int count){
        if(node == null){
            return count;
        }
        int left = maximumDepthOfBinaryTree(node.left , count + 1);
        int right = maximumDepthOfBinaryTree(node.right , count + 1);
        return Math.max(left , right);
    }
}
