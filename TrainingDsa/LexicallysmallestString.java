import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LexicallysmallestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for(int i=0; i < arr.length; i++){
            arr[i] = sc.next();
        }
        System.out.println(smallestLexicalgraphical(arr));
    }
    public static String smallestLexicalgraphical(String[] arr){
        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo (o2 + o1);
            }
        });
        String ans = "";
        for(int i=0; i < arr.length; i++){
            ans = ans + arr[i];
        }
        return ans;
    }
}
