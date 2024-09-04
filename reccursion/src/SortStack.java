import java.util.Stack;

public class SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(2);
        stack.push(1);
        sorting(stack , stack.size());
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    public static void sorting(Stack<Integer> stack , int n){
        if(n == 1){
            return ;
        }
        int removeElement = stack.pop();
        sorting(stack , n-1);

        while(removeElement < stack.peek()){

        }

    }
    public static void helper(Stack<Integer> stack , int number){
        if(!stack.isEmpty() && stack.peek() < number){
            stack.push(number);
        }
        if(stack.peek() > number){
            stack.pop();
          helper(stack , number);
        }

    }
}
