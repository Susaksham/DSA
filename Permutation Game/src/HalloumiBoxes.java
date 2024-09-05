import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0 ){
            int[] input = new int[2];
            for(int i=0; i< input.length; i++){
                input[i] = sc.nextInt();
            }
            int n = input[0];
            int k = input[1];
            long[] arr = new long[n];
            boolean areAllEqual = true;
            boolean allIncreasingOrder = true;
            for(int i=0; i < arr.length; i++){
                arr[i] = sc.nextLong();
                if(i > 0 && arr[i] != arr[i-1]){
                    areAllEqual  = false;
                }
                if(i > 0 && arr[i] < arr[i -1]){
                    allIncreasingOrder  = false;
                }
            }
            if(areAllEqual || allIncreasingOrder){
                System.out.println("YES");
                continue;
            }
            if(k >=2){
                System.out.println("YES");

            }  else{
                System.out.println("NO");
            }
        }
    }
}
