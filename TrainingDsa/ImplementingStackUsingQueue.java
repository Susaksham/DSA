import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementingStackUsingQueue {
    public static void main(String[] args) {
    Stackkk stack = new Stackkk();
    stack.push(2);
        stack.push(3);

        stack.push(4);
        System.out.println( stack.pop());
    }
}
class Stackkk{

    Queue<Integer> q = new ArrayDeque<>() ;
    void push(int element){
        q.offer(element);
    }
    int pop(){
        for(int i=0 ; i < q.size() - 1 ; i++){
            q.offer(q.remove());
        }
        return q.remove();
    }

}