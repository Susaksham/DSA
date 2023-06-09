import java.util.Stack;

public class PreOrderTraversalIteration {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        iterative(root);
    }
    public static void iterative(Node root){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            int size = stack.size();


                Node value = stack.pop();
                int val = value.data;
                if (value.right != null) {
                    stack.push(value.right);
                }
                if (value.left != null) {
                    stack.push(value.left);

                }

                System.out.print( val+ " ");
            }


    }
}
