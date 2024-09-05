import java.util.Scanner;

public class PlusMinusPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            long[] input = new long[3];
            for(int i=0; i < input.length;i++){
                input[i] = sc.nextInt();
            }
            long n = input[0];
            long x = input[1];
            long y = input[2];
            long lcm = (x*y)/getGcd(x ,y);
            long numberOfX = n/x;
            long numberOfY = n/y;
            long common = n/lcm;
            numberOfX -= common;
            numberOfY -= common;
//            System.out.println(numberOfX + " " + numberOfY);
//            System.out.println(((numberOfX/2)*(2*n + (numberOfX - 1)*-1)));
//            System.out.println( ((numberOfY/2)*(2 + (numberOfY-1))));
            long ans = ((numberOfX)*(2*n + (numberOfX - 1)*-1))/2 - ((numberOfY)*(2 + (numberOfY-1)))/2;
            System.out.println(ans);

        }
    }
    public static long getGcd(long a , long b){
        if(a == 0){
            return b;
        }
        return getGcd(b%a , a);
    }
}


