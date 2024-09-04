import java.util.Scanner;

public class CodeForcesProblemA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while(testCases > 0){

            int n =  sc.nextInt();

            if( n == 2 || n == 3){
                System.out.println("Bob");

            } else{
                System.out.println("Alice");
            }
            testCases--;
        }
    }
}
