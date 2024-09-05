package Stack;

public class StackUserArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
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


class StackArray {

    int[] arr;
    int maxSize ;
    int top = -1;
    StackArray(int maxSize){
        arr = new int[maxSize];
        this.maxSize = maxSize;
    }


    boolean push(int element){


        if(top >= maxSize - 1){
            System.out.println("Overflow");
            return false;
        } else{
            top++;
            arr[top] = element;
            return true;
        }
    }
    boolean pop(){
        if(top < 0){
            System.out.println("UnderFlow");
            return false;
        } else{

            top--;
            return true;

        }
    }
    int peek(){
        if(top >= 0){
            return arr[top];
        } else{
            System.out.println("No element preset");
            return -1;
        }
    }

    void display(){
        while(top >=0){
            System.out.println(arr[top]);
            top--;
        }
    }


}