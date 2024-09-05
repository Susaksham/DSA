import java.util.ArrayDeque;
import java.util.Queue;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabaccb";
        firstNonRepeatingCharacter(str);
    }
    public static void firstNonRepeatingCharacter(String input){

        int[] arr = new int[26];
        Queue<Character> q = new ArrayDeque();
        for(int i=0; i < input.length(); i++){
            arr[input.charAt(i) - 97]++;
            if(q.isEmpty() && arr[input.charAt(i) - 97] == 1){
                q.offer(input.charAt(i));
            }
            else if(!q.isEmpty()){
                while(!q.isEmpty() && arr[q.peek() - 97] > 1){
                    q.remove();
                }
            }
            if(q.isEmpty()){
                System.out.print(-1);
            } else{
                System.out.print(q.peek());

            }
        }

    }
}
