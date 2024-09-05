import java.util.*;

public class Codeforces_1832C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while(testCases > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;  i < n; i++){
                arr[i] = sc.nextInt();
            }
            if(arr.length == 0){
                System.out.println(1);
            }
            int ans = 0;
            boolean increasing = false;
            boolean decreasing = false;
            for(int i=1; i < arr.length; i++){
                if(arr[i] - arr[i-1] > 0 && !increasing){
                    ans++;
                    increasing = true;
                    decreasing = false;
                } else if(arr[i] - arr[i-1] < 0 && !decreasing){
                    ans++;
                    increasing = false;
                    decreasing = true;
                }
            }
            if(ans == 0){
                System.out.println(1);
            } else{
                System.out.println(ans+1);
            }
            testCases--;
        }
    }
}
