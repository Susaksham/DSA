import java.util.Arrays;
import java.util.Scanner;

public class Codeforces_279B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int time = sc.nextInt();
        int[] arr  = new int[n];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(maximumBooks(arr , time));
    }
    public static int maximumBooks(int[] arr , int time){
        int start = 0;
        int end = arr.length + 1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;

            if(predicate(arr , mid , time)){

                start = mid;
            } else{
                end = mid;
            }
        }
        return start;
    }
    public static boolean predicate(int[] arr , int books , int time){
        int totalTime  = 0;
        int totalBooks = 0;
        for(int i=0; i < books && (i < arr.length); i++){
            totalTime += arr[i];
            totalBooks++;
        }

        if(totalTime <= time && totalBooks == books){

            return true;
        }
        for(int i=books; i < arr.length; i++){
            totalTime  = totalTime + arr[i] - arr[i  - books];
            if(totalTime <= time && totalBooks == books){
                return true;
            }
        }
        return false;
    }
}
