import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Codeforces_1839B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){

            int n = sc.nextInt();
            int[][] arr = new int[n][2];
            for(int i=0; i < arr.length; i++){
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            Arrays.sort(arr, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if(o2[0] < o1[0]){
                        return 1;
                    } else if( o2[0] == o1[0]){
                        return o2[1]  - o1[1];
                    } else{
                        return -1;
                    }
                }
            });
            for(int i=0; i < n; i++){
                System.out.print(Arrays.toString(arr[i]));
            }
            System.out.println();
            testCases--;
        }
    }
}
