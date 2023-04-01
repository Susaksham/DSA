import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class LevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(10);
       root.left = new Node(20);
       root.right = new Node(30);
       root.left.left = new Node(40);
       root.left.right = new Node(50);
       root.right.left = new Node(60);
       root.right.right = new Node(70);

        Queue<Node> q = new ArrayDeque<>();
        q.offer(root);
//        levelOrderTraveral(root , q);
        ArrayList<ArrayList<Integer>> list = levelOrderTraversalIterative(root);
        for(int i = 0; i < list.size(); i++){
            System.out.print("[");
            for(int j = 0; j < list.get(i).size(); j++){
                System.out.print(list.get(i).get(j) + ",");
            }
            System.out.print("]");
        }

    }
    public static ArrayList<ArrayList<Integer>>  levelOrderTraversalIterative(Node head  ){
        Queue<Node> q = new ArrayDeque<>();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        q.offer(head);
        while(!q.isEmpty()){
            ArrayList<Integer> nested = new ArrayList<>();
            int size = q.size();
            for(int i = 0; i < size ; i++){
                if(q.peek().left != null){
                    q.offer(q.peek().left);

                }
                if(q.peek().right != null){
                    q.offer(q.peek().right);
                }
                nested.add(q.peek().data);
                q.poll();
            }
            list.add(nested);


        }
        return list;
    }
    public static void levelOrderTraveral(Node head , Queue<Node> q){
        if(q.isEmpty()){
            return;
        }

        Node node = q.poll();
        System.out.println(node.data);
        if(node.left != null){
            q.offer(node.left);
        } if(node.right != null) {
            q.offer(node.right);
        }
        levelOrderTraveral(head , q);
    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node(int val){
        data = val;
    }
}
