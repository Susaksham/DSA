import java.util.Stack;

public class CarSpeed {
    public static void main(String[] args) {
        int[] arr = {5 , 7 , -2 , -4};
        carSpeed(arr);
    }
    public static void carSpeed(int[] arr){

        Stack<Integer> stack = new Stack<>();

        for(int i=0; i < arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
            } else if(!stack.isEmpty() && (stack.peek() >= 0 ) && arr[i] < 0){
                int peekedElement = stack.pop();
                stack.push(peekedElement + arr[i] );
                

            }else{
                stack.push(arr[i]);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
