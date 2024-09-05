public class Kadans {
    public static void main(String[] args) {
        int[] arr = {-5 , 2 , 4 , 8 , -6, -9 , 4 , -50};
        System.out.println(kadans(arr));
    }
    public static int kadans(int[] arr){

        int ans = Integer.MAX_VALUE;
        int currentAns = 0;

        for(int i =0; i < arr.length; i++){
            currentAns = currentAns + arr[i];
            currentAns = Math.min(currentAns , arr[i]);
            ans = Math.min(currentAns , ans);

        }
        return ans;




    }
}
