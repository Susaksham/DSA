import java.util.Arrays;
import java.util.Scanner;

public class CountingOrders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i=0; i < a.length; i++){
                a[i] = sc.nextInt();

            }
            int[] b = new int[n];
            for(int i=0; i < b.length; i++){
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int i= 0;
            int j=0;
            int ans = 1;
            boolean flag = true;
            int index =0;
            while(i < a.length && j < b.length){
                if(a[i] > b[j]){
                    j++;
                } else if(b[j] >= a[i]){
                    if(j > i){
                        ans = ans * (j - i);
                    }
                    i++;
                    j++;
                }
                if(! (a[index] > b[index])){
                    flag = false;
                    break;
                }
                index++;
            }
            if(!flag){
                System.out.println(0);
            } else {
                System.out.println(ans);
            }
        }
    }
}
