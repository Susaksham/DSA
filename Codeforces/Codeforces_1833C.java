
import java.util.*;
public class Codeforces_1833C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while(testCases>0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i < n; i++){
                arr[i] = sc.nextInt();
            }


            int leftOddElement =  Integer.MAX_VALUE;
            int leftEventElement  = Integer.MAX_VALUE;
            int smallestElement = Integer.MAX_VALUE;
            for(int i = arr.length - 1; i >=0; i--){
                if(arr[i] % 2 == 0 && arr[i] < leftEventElement){
                    leftEventElement = arr[i];
                } else if (arr[i] % 2 == 1 && arr[i] < leftOddElement){
                    leftOddElement = arr[i];
                }
                if(arr[i] < smallestElement  ){
                    smallestElement = arr[i];
                }
            }
            boolean even = smallestElement % 2 == 0;

            boolean no = false;
            for(int i=0; i < arr.length; i++){
                if(even){
                    if(arr[i] % 2== 1){
                        if(!(leftOddElement != Integer.MAX_VALUE && (arr[i] - leftOddElement) > 0)){

                            no = true;
                            break;
                        }
                    }

                }
            }
            if(no){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }


            testCases--;
        }

    }
}
