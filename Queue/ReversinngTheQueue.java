import java.util.ArrayDeque;
import java.util.Queue;

public class ReversinngTheQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0; i < 5 ; i++){
            q.offer(i + 1);
        }
        reverse(q);
        for(int i = 0; i < 5; i++){
            System.out.println(q.poll());
        }
    }
    public static void reverse(Queue<Integer> q){
        if(q.isEmpty()){
            return;
        }
        int value = q.poll();
        reverse(q);
        q.offer(value);
    }
}
