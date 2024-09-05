import java.util.Stack;

public class ImplementingStackUsingArray {
    public static void main(String[] args) {
        Stackk stack = new Stackk(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        ;
        stack.push(4);
        stack.push(5);
        System.out.println(stack.size());
        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(6);

    }
}

class Stackk{

    int[] arr;
    int top  = -1;
    int size;

    Stackk (int size){
        this.size  = size;
        arr = new int[size];
    }
    boolean isFull (){
        return top > size -2;
    }

    void push(int element){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        } else{
            top++;
            arr[top] = element;
        }
    }
    int pop(){
        if(top == -1){
            System.out.println("Array is empty");
            return -1;
        } else{
            int deletedElement = arr[top];
            arr[top] = 0;
            top--;
            return deletedElement;

        }
    }
    int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }
    int size (){
        return top + 1;
    }






}