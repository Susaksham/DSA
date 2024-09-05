public class TimeComplexity {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(primeOrNot(n));
        System.out.println(seive(33));
    }

    public static boolean primeOrNot(int n){


        for(int i = 2; i*i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static int seive (int n){
        int arr[] = new int[n+1];

        for(int i=2; i <=n ; i++){
            if(arr[i] == i){


                for(int j=i*i; j <=n; j = j + i){
                    arr[j] = i;
                }
            }
        }
        return arr[n];


    }

}
