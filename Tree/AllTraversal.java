import java.awt.*;
import java.util.ArrayList;
import java.util.Stack;

public class AllTraversal {
    static class Pair{
        Node node;
        int value;
        Pair(Node node , int value){
            this.node = node;
            this.value = value;
        }
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        allTraversal(root);
    }
    public static void allTraversal(Node head){

        Stack<Pair> stack = new Stack<>();
        ArrayList<Integer> preorder = new ArrayList<>();
        ArrayList<Integer> inorder = new ArrayList<>();
        ArrayList<Integer> postOrder = new ArrayList<>();
        stack.push(new Pair(head , 1));
        while(!stack.isEmpty()){
            Pair p = stack.peek();

            if(p.value == 1){
                preorder.add(p.node.data);
                p.value++;
                if(p.node.left != null){
                    stack.push(new Pair(p.node.left , 1));
                }

            } else if(p.value == 2){
                inorder.add(p.node.data);
                p.value++;
                if(p.node.right != null){
                    stack.push(new Pair(p.node.right , 1));
                }
            } else if(p.value == 3){
                postOrder.add(p.node.data);
                stack.pop();

            }
        }
        for(int i = 0; i < preorder.size(); i++){
            System.out.print(preorder.get(i) + " ");
//            System.out.println(inorder.get(i));
//            System.out.println(postOrder.get(i));
        }
        System.out.println();
        for(int i = 0; i < preorder.size(); i++){
//            System.out.print(preorder.get(i) + " ");
            System.out.print(inorder.get(i) + " ");
//            System.out.println(postOrder.get(i));
        }
        System.out.println();
        for(int i = 0; i < preorder.size(); i++){
//            System.out.print(preorder.get(i) + " ");
//            System.out.println(inorder.get(i));
            System.out.print(postOrder.get(i) + " ");
        }

    }
}
