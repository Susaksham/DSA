import java.util.HashSet;
import java.util.Scanner;

public class CodeForces_1837B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while(testCases > 0){

            int n = sc.nextInt();
            String str = sc.next();
            HashSet<Integer> set = new HashSet<>();
            int count = 0;
            set.add(0);
            for(int i=0; i < n; i++){
                if(str.charAt(i) == '<'){
                    count++;
                    set.add(count);
                } else{
                    count--;
                    set.add(count);
                }
            }
            System.out.println(set.size());
            testCases--;
        }
    }
}
