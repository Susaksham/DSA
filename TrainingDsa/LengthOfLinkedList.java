public class LengthOfLinkedList {
    public static void main(String[] args) {
        Node head = new Node("ab");
        head.next = new Node("bc");
        head.next.next = new Node("cd");
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);

        lengthOfLinkedlist(head);
    }
    public static void lengthOfLinkedlist(Node head){

        if(head == null){
            System.out.println(0);
        }
        Node pointer = head;

        while(pointer != null){
            System.out.println(pointer.data);
            pointer = pointer.next;
        }
        return ;
    }

}
class Node {
    String data = "" ;
    Node next;
    Node(String data){
        this.data = data;
    }

}