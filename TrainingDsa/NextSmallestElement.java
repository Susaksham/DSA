import java.util.Stack;

public class NextSmallestElement {
    public static void main(String[] args) {
        int[] arr = {-6 , 4 , -3 , 2 , 1 , 0 , 4};
        nextSmallestElement(arr);

    }
    public static void nextSmallestElement(int[] arr){


        Stack<Integer> stack = new Stack<>();
        Stack<Integer> ans = new Stack<>();

        for(int i=arr.length-1; i>=0 ; i--){
            if(stack.isEmpty()){
                ans.push(-1);
                stack.push(arr[i]);
            }
            else if(!stack.isEmpty() && arr[i] > stack.peek()){
                ans.push(stack.peek());
                stack.push(arr[i]);
            } else if ( !stack.isEmpty() && arr[i]  < stack.peek()){
                while(!stack.isEmpty() && arr[i] < stack.peek()){
                    stack.pop();

                }
                if(stack.empty()){
                    ans.push(-1);
                    stack.push(arr[i]);
                } else{
                    ans.push(stack.peek());
                    stack.push(arr[i]);
                }

            }

        }
        while(!ans.isEmpty()){
            System.out.println(ans.pop());

        }

    }
}
