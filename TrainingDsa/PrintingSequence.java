public class PrintingSequence {
    public static void main(String[] args) {
        solve(5);
    }
    public static void solve(int n){
        if( n == 1){
            System.out.println(1);
            return;
        }
        solve(n - 1);
        System.out.println(n);
    }
}
