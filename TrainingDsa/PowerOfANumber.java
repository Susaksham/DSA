public class PowerOfANumber {
    public static void main(String[] args) {
        System.out.println(power(3, 5));
    }
    public static int power(int a ,int n){
        int ans = 1;
        int power =n;
        int base = a;
        while(power > 0){
            if((power & 1) == 1){
                ans = ans * base;
            }
            power =  power>>1;

            base = base * base;
        }
        return ans;
    }
}
