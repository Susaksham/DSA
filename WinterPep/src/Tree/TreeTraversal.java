package Tree;

public class TreeTraversal {
    public static void main(String[] args) {

    Node head = insertANode(null , 20);
    insertANode(head , 30);
        insertANode(head , 40);
        insertANode(head , 10);
        insertANode(head , 1);
        insertANode(head , 3);
        insertANode(head , 100);


    inorder(head);
        System.out.println();
    preorder(head);
        System.out.println();
    postorder(head);

    }
    public static Node insertANode(Node head , int data){
        if(head == null){
            Node newnode = createANode(data);
            return newnode;
        }
        if(data < head.value ){
            head.left = insertANode(head.left , data);
        } else if(data  > head.value){
            head.right = insertANode(head.right , data);
        }
        return head;
    }
    public static Node createANode(int data){

        Node newNode = new Node();
        newNode.value = data;
        newNode.left = null;
        newNode.right = null;
        return newNode;
    }
    public static void inorder(Node head ){
        if(head == null){
            return;
        }
        inorder(head.left);
        System.out.print(head.value + " ");
        inorder(head.right);
    }
    public static void postorder(Node head ){
        if(head == null){
            return;
        }
        postorder(head.left);

        postorder(head.right);
        System.out.print(head.value + " ");
    }
    public static void preorder(Node head ){
        if(head == null){
            return;
        }
        System.out.print(head.value + " ");
        preorder(head.left);

        preorder(head.right);

    }
}

class Node {
    int value;
    Node left;
    Node right;
}


