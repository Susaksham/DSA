import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class PostOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        ArrayList<Integer> list =  postOrderTraversalUsingOneStack(root);
        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }
    }
    public static ArrayList<Integer> postOrderTraversalUsingOneStack(Node head){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();

        Node curr = head;
        while(!stack.isEmpty() || curr != null){

            if(curr != null){
                stack.push(curr);
                curr = curr.left;
            } else {
                Node temp = stack.peek().right;
                if(temp == null){
                    temp = stack.peek();
                    stack.pop();
                    list.add(temp.data);

                    while(!stack.isEmpty() && stack.peek().right == temp){
                        temp = stack.peek();
                        stack.pop();
                        list.add(temp.data);
                    }
                } else{
                    curr = temp;
                }
            }
        }
        return list;




    }
    public static ArrayList<Integer> postOrderTraversal(Node head){

        Stack<Node> stack2 = new Stack<>();
        Stack<Node> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        Node node = head;
        stack.push(node);

        while(!stack.isEmpty()){
            node = stack.pop();
            stack2.push(node);
            if(node.left != null){
                stack.push(node.left);
            } if(node.right != null){
                stack.push(node.right);
            }

        }
        while(!stack2.isEmpty()){
            Node iteratorNode = stack2.pop();
            list.add(iteratorNode.data);
        }
        return list;
    }
}
