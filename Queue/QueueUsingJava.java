import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueUsingJava {
    public static void main(String[] args) {
//    Queue<Integer> q = new LinkedList<Integer>();
    Queue<Integer> q1  = new ArrayDeque<Integer>() ;
    q1.offer(10);
    q1.offer(20);
    q1.offer(30);
    System.out.println(q1.peek());
    System.out.println(q1.poll());
    System.out.println(q1.isEmpty());

    }

}
