import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class CodeForces_797C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



            String str = sc.next();
            Stack<Character> stack  =  new Stack<>();
            int[] arr = new int[26];
            for(int i=0; i < str.length(); i++){
                arr[str.charAt(i) - 97]++;

            }
            for(int i=1; i < 26; i++){
                arr[i] = arr[i] + arr[i - 1];
            }

            String ans = "";
            for(int i=0 ;i < str.length(); i++){
                if(str.charAt(i) - 97 == 0 || str.charAt(i) - 97>=1 &&    arr[str.charAt(i) - 98] == 0){
                    ans = ans + str.charAt(i);
                    for(int j = str.charAt(i) - 97; j < 26; j++){
                        arr[j]--;
                    }
                }
                else if(  str.charAt(i) - 97>=1 &&   arr[str.charAt(i) - 97] > arr[str.charAt(i) - 98]){
                    stack.push(str.charAt(i));
                }
            }
            while(!stack.isEmpty()){
                ans = ans + stack.pop();
            }
            System.out.println(ans);


    }
}
// if the next element is greater