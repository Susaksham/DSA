import java.util.Scanner;

public class CodeForces_1840B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while(testCases > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;
            int value = (int)Math.min(n , Math.pow(2 , k) - 1);
            for(int i= 30; i >= 0; i--){

                if(((int)value & (1 <<i)) > 0){
                    ans = ans + (int)Math.pow(2 , i);
                }
            }
            System.out.println(ans + 1);
            
            testCases--;
        }
    }
}
