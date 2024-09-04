import java.util.Arrays;
import java.util.Scanner;

public class MaximumMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] inputArr = new int[2];
        inputArr[0] = sc.nextInt();
        inputArr[1] = sc.nextInt();
        int[] arr = new int[inputArr[0]];
        for(int i=0; i < inputArr[0]; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(maximumMedian(arr , inputArr[1]));
    }
    public static int maximumMedian(int[] arr , int k){

        int start = arr[arr.length/2];

        int end = arr[arr.length - 1]  + k + 1;
        while(start + 1 < end){

            int mid = start + (end - start)/ 2;


            if(predicate(arr , k , mid)){
                start = mid;
            } else{
                end = mid;
            }

        }
        return start;

    }
    public static boolean predicate(int[] arr , int k , int mid){
        double steps = 0;

        for(int i= arr.length/2; i < arr.length; i++){

            if(arr[i] < mid){
                steps = steps + (mid - arr[i]);
            }
        }
        if(steps <= k){
            return true;
        }
        return false;
    }
}
