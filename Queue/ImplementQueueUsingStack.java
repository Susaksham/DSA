import java.util.ArrayDeque;
import java.util.Queue;

public class ImplementQueueUsingStack {

    public static void main(String[] args) {
    Stackk st = new Stackk();
    st.push(3);
    System.out.println(st.top());
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

    }
}
class Stackk{
    Queue<Integer> q;
    Queue<Integer> q2;

    Stackk(){
         q = new ArrayDeque<>();
         q2 = new ArrayDeque<>();
    }
    int top(){
        return q.peek();
    }
    int pop(){
        return q.poll();
    }
    boolean push(int element){
        while(!q.isEmpty()){
            q2.offer(q.poll());
        }
        q.offer(element);
        while(!q2.isEmpty()){
            q.offer(q2.poll());
        }
        return true;
    }
}
