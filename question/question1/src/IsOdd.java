

public class IsOdd {
    public static void main(String[] args) {
        int n=621;
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n){
        return (n & 1)==1 ;
    }
}
