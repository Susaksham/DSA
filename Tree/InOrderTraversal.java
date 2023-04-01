import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        List<Integer> list = inOrderTraversal(root);
        for(int i =0 ; i < list.size(); i++ ){
            System.out.println(list.get(i) + "");
        }
    }
    public static List<Integer> inOrderTraversal(Node head){
        Stack<Node> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        Node node = head;
        while(true){

            if(node != null){
                stack.add(node);
                node = node.left;
            } else{
                if(stack.isEmpty()){
                    break;
                } else{
                    node = stack.pop();
                    list.add(node.data);
                    node = node.right;
                }
            }
        }
        return list;
    }
}

//    Node node = stack.peek();
//            while(node != null){
//                    stack.push(node);
//
//                    node = node.left;
//                    }
//                    if(node == null){
//                    if(stack.isEmpty()){
//                    break;
//                    } else{
//                    list.add(stack.peek().data);
//                    node = stack.pop();
//                    node = node.right;
//                    }
//                    while(node != null){
//                    stack.push(node);
//                    node = node.right;
//                    }
//                    }