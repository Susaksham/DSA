import java.util.Arrays;
import java.util.Scanner;

public class WoodenByFestivalD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){

            int n = sc.nextInt();

            int[] arr = new int[n];
            for(int i=0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(binarySearch(arr , 3));

            testCases--;
        }
    }
    public static int binarySearch(int[] arr , int carvers){
        int start = 0;
        int end = Integer.MAX_VALUE;
        int ans = end;
        while(start <=end){
            int mid = start + (end - start)/2;
            if(predicateFunction(arr , mid)){
                ans = mid;
                end = mid -1;
            } else{
                start = mid + 1;
            }
        }
        return ans;
    }
    public static boolean predicateFunction(int[] arr , int waitTime){

        int average = arr[0] + waitTime;
        int totalWorker = 1;
        for(int i=0; i < arr.length; ){
            if(Math.abs(arr[i] - average) <= waitTime){
                i++;
            } else{
                totalWorker++;
                average = arr[i] + waitTime;
                i++;
            }
        }
        if(totalWorker <= 3){
            return true;
        }
        return false;
    }
}
