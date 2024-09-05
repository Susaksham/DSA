import java.util.Scanner;

public class SeraphimtheOwl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int[] input = new int[2];
            for (int i=0 ; i < 2; i++){
                input[i] = sc.nextInt();
            }
            int n = input[0];
            int m = input[1];

            int[] a = new int[n];
            int[] b = new int[n];
            for(int i =0; i < n; i++){
                a[i] = sc.nextInt();
            }
            for(int i =0; i < n; i++){
                b[i] = sc.nextInt();
            }

            int index = a.length-1;

            long minResult = Long.MAX_VALUE;
            long currSum = 0;
            while(index>=0){

                if(index <= m - 1){
                    minResult = Math.min(minResult , currSum  + a[index]);
                }
                currSum += Math.min(a[index] , b[index]);
                index--;
            }
            System.out.println(minResult);
        }


    }
}
