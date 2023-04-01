package com.company;

public class NewClass {
    public static void main(String[] args){
        int[] arr = {2 , 2};
        int h = 2;
        System.out.println(minEatingSpeed(arr , h));
    }
    public static int minEatingSpeed(int[] arr, int h) {
        long max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            max = Math.max(arr[i] , max);
        }

        long lastResult = 0;
        long start  = 1;
        long end = max;
        boolean flag = false;
        while(start <= end){
            long mid = start + (end - start) / 2;
            if(isPossible(arr , mid , h)){
                // if we can eat bananas
                flag = true;
                lastResult = mid;
                end = mid  - 1;
            }  else if(start + 1 == end && (isPossible(arr , end , h))){

                    flag = true;
                    lastResult = end;
                    end = mid -1;

            }  else if(!isPossible(arr , mid , h) ){
                start = mid + 1;
            }

        }
        if(!flag){
            return (int)end;
        }
        return (int)lastResult;

    }
    public static boolean isPossible(int[] arr , long k , int h){
        long hours  = 0;
        for(int i = 0; i < arr.length ; i++){
            if(hours >= h){
                return false;
            }
            if(arr[i] >= k && arr[i] % k == 0){
                hours = hours +  arr[i]/k;
            } else if(arr[i] < k && arr[i]% k == 0){
                hours = hours + 1;
            } else if(arr[i] % k != 0){
                hours = hours + (int)arr[i]/k + 1;
            }
            if(hours > h){
                return false;
            }
        }
        return true;
    }
}
