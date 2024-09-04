public class PostionOfElementUsingRecc {
    public static void main(String[] args) {
        int[] arr = {1 , 3 , -1 , 7 , 8 ,-1 , 9 , 7};
        System.out.println(firstccurances(arr , arr.length - 1 , 100));
    }
    public static int firstccurances(int[] arr , int n , int element){
        if(n < 0 ){
            return -1;
        }
         int result =  firstccurances(arr , n - 1 , element);
        if(result >= 0){
            return result;
        }
        if(element == arr[n]){
            return n;
        }
        return -1;
    }
    public static int pairing(int[] arr ){



        return -1;
    }
}
