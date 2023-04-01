package com.company;

public class Consecutive1s {
    public static void main(String[] args) {
        int[] arr ={1,0,1,1,1,1,0,1,1};
        System.out.println(consecutive(arr));
    }
    public static int consecutive(int[] arr){
        int maxConsecutive =0;
        int currentConsecutive =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 1){
                currentConsecutive++;
            }
            else{
                maxConsecutive = Math.max(maxConsecutive, currentConsecutive);
                currentConsecutive =0;
            }
        }
        maxConsecutive = Math.max(currentConsecutive ,maxConsecutive);
        return maxConsecutive;
    }
}
