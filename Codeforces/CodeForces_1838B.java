import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CodeForces_1838B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while(testCases > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            int indexOfOne = -1;
            int indexOfTwo = -1;
            int maximumElementIndex = 0;
            for(int i=0; i < arr.length; i++){
                if(arr[i] == 1){
                    indexOfOne = i;
                }
                if(arr[i] == 2){
                    indexOfTwo = i;
                }
                if(arr[maximumElementIndex] < arr[i]){
                    maximumElementIndex = i;
                }

            }
            if(Math.abs(indexOfOne - indexOfTwo) >= 2 ){
                int middle = indexOfOne + (indexOfTwo - indexOfOne)/2;
                // swap element
                int temp = arr[middle];
                arr[middle] = arr[maximumElementIndex];
                arr[maximumElementIndex] = temp;
                System.out.println(middle + " " + maximumElementIndex);
            } else{
                int swapIndex = Math.abs(indexOfOne - maximumElementIndex) > Math.abs(indexOfTwo - maximumElementIndex) ? indexOfTwo :  Math.abs(indexOfOne - maximumElementIndex) == Math.abs(indexOfTwo - maximumElementIndex) ? -1 : indexOfOne ;
                if(swapIndex >=0){
                    int temp = arr[swapIndex];
                    arr[swapIndex] = arr[maximumElementIndex];
                    arr[maximumElementIndex] = temp;
                    System.out.println(swapIndex+1 + " " + (maximumElementIndex+1));
                }
            }

            testCases--;
        }
    }
}
