public class BinarySearchTraining {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3, 4 , 5, 6};
        System.out.println(binarySearch(arr , 5));
    }




    // intuition
    //-------------->fix a search space
    // ------------> determine if b.s is possible or not.
    // -------------> select search space such that it has both good and bad numbers ( l  and  r should be different in terms of 1 and 0
    // ----------> se would have to create a predicate function ( a[i] > x ,  a[i] < x ) ( we mostly use the greedy and maths)
    // binary search will always be applied on which we have to find the maximum and min.
    // template


    
    public static int binarySearch(int[] arr , int element){
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while(start <= end){
            int mid = start + (end - start)/2;
           if(arr[mid] >= element){
                end  = mid -1;

            } else if(arr[mid] < element){
               ans = mid;

                start = mid + 1;
            }
        }
        return ans;

    }

    public static int rotatedArraySearch(int[] arr){
        int start = 0;
         int end= arr.length -1;
         while(start<=end){
             int mid = start + (end - start)/2;
             if(start < mid && end > mid && arr[mid] < arr[mid + 1] && arr[mid - 1]  < arr[mid]){
                 return mid;
             } else if(arr[start] < arr[mid]){
                 start  = mid + 1;
             } else if(arr[end] > arr[mid]){
                 end  = mid -1;
             }
         }
         return -1;
    }

    // new approach
    public static int betterApproach(int[] arr){
        int start =0;
        int end = arr.length - 1;
        int ans = 0;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] >= arr[start]){
                ans = mid;
                start = mid + 1;
            } else if(arr[mid] <= arr[end]){
                end = mid -1;
            }
        }
        return ans;
    }
    public static int bestApproach(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start + 1 < end){
            int mid = start + (end - start)/2;

            if(predicateFunction(arr)){
                start = mid;
            } else{
                end = mid;
            }
        }
        return start;
        // or return end
    }
    public static boolean predicateFunction(int[] arr){
        return true;
    }


}

