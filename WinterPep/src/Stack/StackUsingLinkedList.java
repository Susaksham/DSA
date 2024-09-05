package Stack;

public class StackUsingLinkedList {
    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.push(5);
        stack.display();
    }
}

class LinkedListStack {

    Node top = null;


    public boolean push (int element){
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = top;
        top = newNode;
        return true;
    }
    public boolean pop(){
        if(top == null){
            System.out.println("There is no element to remove");
            return false;
        } else{
            top = top.next;
            return true;
        }
    }
    public void display(){
        while(top != null){
            System.out.println(top.data);
            top = top.next;
        }
    }
}
class Node {
    int data;
    Node next;

}