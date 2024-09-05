import java.util.HashSet;
import java.util.Scanner;

public class Codeforces_Prefix_Permutation_Sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases > 0){


            int n = sc.nextInt();
            long[] input = new long[n- 1];
            for(int i=0; i < input.length; i++){
                input[i] = sc.nextLong();

            }
            HashSet<Long> set = new HashSet<>();
            for(long i=1; i <=n; i++){
                set.add(i);
            }
            boolean flag = true;
            long removeElement = 0;
            for(int i=1; i < input.length; i++){
                long diff = input[i] - input[i - 1];
                if(input[i] == 1){
                    set.remove(1);
                } else if(  diff > n){
                    if(removeElement > 0){
                        flag = false;
                        break;
                    }
                    removeElement = diff;
                } else{
                    set.remove(diff);
                }
            }
            if(set.size() > 2){
                flag = false;
            } else if (removeElement > 0){
                for(long element : set){
                    removeElement = removeElement - element;
                }
                if(removeElement != 0){
                    flag = false;
                }
            } else {
                int sum = 0;
                for(long element : set){
                    sum += element;
                }
                if(sum != input[0]){
                    flag = false;
                }
            }

            if(!flag){
                System.out.println("NO");
            } else{
                System.out.println("YES");
            }
            testCases--;
        }
    }
}
