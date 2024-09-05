public class QueueLinkedList {

    public static void main(String[] args) {

        QueueLinked q = new QueueLinked();

        System.out.println( q.offer(1));;
        System.out.println( q.offer(2));;
        System.out.println( q.offer(3));;
        q.display();
        System.out.println(q.poll());
        q.display();
    }



}


class Node {
    int data;
    Node next = null;
}

class QueueLinked{

    Node front = null , rear = null;


    public boolean offer(int element){

        if(rear == null){
            Node newNode  = new Node();
            newNode.data = element;
            front = newNode;
            rear = newNode;
            return true;
        } else{

            if(front.next == null){

                System.out.println(element);
                Node newNode  = new Node();
                newNode.data = element;
                rear.next = newNode;
                front.next = newNode;
                rear = rear.next;
//                System.out.println("last insert element data " + rear.data);
                return true;
            } else{
                System.out.println(element);
                Node newNode  = new Node();
                newNode.data = element;
                rear.next = newNode;
                rear = rear.next;
//                System.out.println("last insert element data " + rear.data);
                return true;
            }

        }

    }
    public boolean poll(){
        if(rear == null){
            System.out.println("Underflow");
            return false;
        } else{
            if(front.next != null){
                front = front.next;
                return true;
            } else{
                front = null;
                rear = null;
                return true;
            }
        }


    }
    public void display(){
        Node iteratorNode = front ;


        if(front.next == null){
            System.out.println("front next is null");
        }
        while(iteratorNode!= null){
            System.out.print(iteratorNode.data +  " ");
            iteratorNode = iteratorNode.next;
        }
    }

}