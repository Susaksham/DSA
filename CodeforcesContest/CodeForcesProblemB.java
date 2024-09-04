import java.util.Scanner;

public class CodeForcesProblemB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while(testCases > 0) {

            int n = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            String ans = "1" ;

            boolean alwaysIncreasing = true;
            int lastAddedIndex = 0;
            for(int i=1; i < arr.length; i++){
                if(arr[i] >= arr[lastAddedIndex] && alwaysIncreasing){
                    ans = ans +  "1";
                    lastAddedIndex = i;
                } else if( arr[i] < arr[lastAddedIndex] && alwaysIncreasing){
                    if(arr[i] <= arr[0]){
                        ans = ans +  "1";
                        alwaysIncreasing = false;
                        lastAddedIndex = i;
                    } else{
                        ans = ans + "0";
                    }
                } else if(arr[i] >= arr[lastAddedIndex] && !alwaysIncreasing){
                    if(arr[i] <= arr[0]){
                        ans = ans +  "1";

                        lastAddedIndex = i;
                    } else {
                        ans = ans + "0";

                    }
                }else {
                    ans = ans + "0";

                }
            }
            System.out.println(ans);
            testCases--;
        }
    }
}
