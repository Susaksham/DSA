public class facbonic {
    public static void main(String[] args) {
        int ans=fiboformula(8);
        System.out.println(ans);
    }
    static int fibo(int n){
        if(n<2){//this is the base condition
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    static int fiboformula(int n){
        return (int)(((Math.pow((1+ Math.sqrt(5))/2,n)) - (Math.pow((1 - Math.sqrt(5))/2,n)))/Math.sqrt(5));
    }
}
