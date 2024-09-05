import java.util.Scanner;

public class CodeForces_1838A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            boolean negative = false;
            int largestElement = -1;
            for(int i=0; i < arr.length; i++){
                if(arr[i] < 0){
                    System.out.println(arr[i]);

                   negative = true;
                   break;
                }
                largestElement = Math.max(largestElement , arr[i]);
            }
            if(!negative){
                System.out.println(largestElement);
            }
            testCases--;
        }
    }
}
