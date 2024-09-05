public class Knap {
    public static void main(String[] args) {
        String[] arr = {"10" , "0001" , "111001", "1" , "0"};
        int m = 5;
        int n = 3;
        System.out.println(knap(arr , 0 , m , n));
    }
    public  static int knap(String[] arr , int index , int m , int n ){
        if(index == arr.length || ((m == 0) && n == 0)){
            return 0;
        }
        String str  = arr[index];
        int countOfZero = 0;
        int indexOfString = 0;
        while(indexOfString < arr[index].length()){
            if(arr[index].charAt(indexOfString) == '0'){
                countOfZero++;
            }
            indexOfString++;
        }
        int pick = 0;
        if(m >= countOfZero && n >= (arr[index].length() - countOfZero)){
            pick = 1 + knap(arr , index + 1 , m - countOfZero , n - (arr.length - countOfZero));
        }
        int notPick = knap(arr , index + 1 , m , n);
        return Math.max(pick , notPick);



    }
}
