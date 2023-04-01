package com.company;

public class MinEatingSpeed {
    public static void main(String[] args) {
        int[] arr = {332484035,524908576,855865114,632922376,222257295,690155293,112677673,679580077,337406589,290818316,877337160,901728858,679284947,688210097,692137887,718203285,629455728,941802184};
        int h = 823855818;
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
            } else if(!isPossible(arr , mid , h) ){
                start = mid + 1;
            }

        }
        if(!flag){
            return (int)end;
        }
        return (int)lastResult;

    }
    public static boolean isPossible(int[] arr , long k , int h){
        int i = 0;
        long remainingPart = 0;
        long hours = 0;
        while(i < arr.length){
            if(hours == (h)){
                return false;
            }
            else if(remainingPart > 0){
                remainingPart = remainingPart - k;
                if(remainingPart <= 0){
                    remainingPart = 0;
                    i++;
                    hours++;


                }
                else{

                    hours++;
                }


            }
            else if(arr[i] <= k){
                hours++;
                i++;
            } else {
                remainingPart =  arr[i] - k;
                hours++;
            }
        }
        if(i == arr.length){
            return true;
        }
        return false;
    }
}
