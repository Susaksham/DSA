import java.sql.SQLOutput;

public class Question {
    public static void main(String[] args) {

        Node root = new Node(9);
        root.left = new Node(11);
        root.left = new Node(12);
        System.out.println(Math.max(ans(root  , false) , ans(root , true)));
    }
    public static int ans(Node node , boolean picked){

        if(node == null){
            return 0;
        }
        int pick = 0;
        if(!picked){
           pick =  node.data + ans(node.left ,  true ) + ans(node.right , true);

        }
        int notPicked = ans(node.left , false ) + ans(node.right , false);
        return Math.max(pick , notPicked);
    }
}
