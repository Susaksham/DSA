import java.util.*;
public class Codeforces_1833A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while(testCases > 0){


            int n = sc.nextInt();
            String str = sc.next();

            HashSet<String> store = new HashSet<>();


            String ans = "";
            for(int i=0; i < str.length() && i < 2; i++){
                ans = ans + str.charAt(i);


            }
            store.add(ans);
            for(int i = 2; i < str.length(); i++){
                ans = ans.charAt(1) +""+ str.charAt(i);
                if(!store.contains(ans)){
                 store.add(ans);
                }
            }
            System.out.println(
                    store.size()
            );
          
            testCases--;
        }
    }
}
