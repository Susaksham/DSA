public class ReverseALinkedListUsingRecurrsion {
    public static void main(String[] args) {
        Node2 head = new Node2(1);
         head.next = new Node2(2);
        head.next.next = new Node2(3);
        head.next.next.next = new Node2(4);
        head.next.next.next.next = new Node2(5);

        head = reverse(head);

        Node2 node = head;
        while(node != null){
            System.out.println(node.data);
            node = node.next;
        }

    }
    public  static Node2 reverse (Node2 node){
        if(node.next == null){
            return node;
        }
        Node2 head = reverse(node.next);
        node.next.next = node;
        node.next = null;
        return head;


    }
}

class Node2 {

    int data;
    Node2 next;
    Node2 (int data){
        this.data  = data;
    }

}