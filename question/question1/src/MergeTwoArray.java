import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
            int[] arr = {1,20 , 30 , 40};
            int[] arr2 = { 2,23, 34,63};
        System.out.println(Arrays.toString(mergeTwoArrayJ(arr, arr2)));
    }
    public static int[] mergeTwoArrayJ(int[] arr1 , int[] arr2){
        int[] res = new int[arr1.length + arr2.length];
        int first =0;
        int second =0;
        int k =0;

        while(first < arr1.length  && second < arr2.length ){
            if(arr1[first] <= arr2[second]){
                res[k] = arr1[first];
                k++;
                first++;

            }
            else{
                res[k] = arr2[second];
                k++;
                second++;
            }
        }
        while(first < arr1.length ){
            res[k] = arr1[first];
            k++;
            first++;
        }
        while(second < arr2.length){
            res[k] = arr2[second];
            k++;
            second++;
        }
        return res;
    }
}
