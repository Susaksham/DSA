import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int ans = 0;
        int[] arr = new int[n];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i < arr.length; i++){
            if(!set.isEmpty() && set.contains(arr[i])){
                ans++;
            }
            else if(arr[i] > n){
                ans++;
            } else{
                set.add(arr[i]);
            }
        }
        System.out.println(ans);

    }
}
