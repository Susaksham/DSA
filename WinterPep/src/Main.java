import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the size of the queue");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        QueueTemp q = new QueueTemp(n);
        System.out.println(q.offer(1));;
        System.out.println(q.offer(2));

        System.out.println(q.offer(3));
        System.out.println(q.offer(4));
        System.out.println(q.offer(5));
        System.out.println(q.length());
        System.out.println("Peeked element " + q.peek());
        System.out.println(q.front);
        System.out.println(q.pop());
        System.out.println(q.offer(8));
        System.out.println("It should be 2 "  + q.peek());
        System.out.println(q.pop());
        System.out.println(q.offer(6));
        System.out.println(q.offer(7));
        System.out.println(q.offer(8));
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());
        System.out.println(q.pop());
        System.out.println(q.peek());



    }
}

class QueueTemp {

    int[] q ;
    int front = -1 , rear = -1 , size = 0;
    int maxSize;
    QueueTemp(int length){
        q = new int[length];
        maxSize = length;

    }
    public boolean offer(int element){
        if(front == -1){
            front++;
            q[front] =  element;
            rear = 0;
            size++;
            return true;
        } else if(( (size < maxSize) ) ){
            if(rear == maxSize - 1){
                rear = 0;
                q[rear] = element;
                size++;
                return true;
            } else{
                rear++;
                q[rear] = element;
                size++;
                return true;
            }
        } else{
            return false;
        }
    }

    public int peek(){
        if(size > 0){
          
            return q[front];
        } else{
            return -1;
        }
    }
    public boolean pop(){
        if(size == 0){
            return false;
        }
        else{
            size--;
           front = (front + 1)% maxSize;

           return true;
        }
    }
    int length(){
        return size;
    }


}