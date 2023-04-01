import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateWithGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of elements : ");
        int element = sc.nextInt();
        int[] arr = new int[element];

        for(int i = 0 ; i < element; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the range");
        int n = sc.nextInt();
        printAllElements(arr , n);

    }
    public static void printAllElements(int[] arr , int n){
        Queue<String> q = new ArrayDeque<String>();
        for(int i = 0;  i < arr.length ;i++){
            q.offer(arr[i]+"");
        }
        for(int i = 0;  i < n; i++){
            String element = q.poll();
            System.out.print(element + " ");
            for(int j = 0; j < arr.length; j++ ){
                q.offer(element + arr[j] );
            }
        }
    }
}
