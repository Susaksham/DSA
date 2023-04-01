package com.company;

import java.util.Arrays;

public class Answer2 {
    public static void main(String[] args) {
        int[] arr = {1 , 2,3,4,5};
        System.out.println(solve(2 , arr , 5));
        ;
    }
    public static long solve(int x , int[] c , int n){
        long[][] dp = new long[n][3];
        for(long[] arr: dp){
            Arrays.fill(arr , -1);
        }
        return ans(n , x , 0 , c , 0, dp);
    }
    public static long ans(int n , int x , int index , int[] c , int lastPicked, long[][] dp){
        if(index == c.length - 1){
            return dp[index][lastPicked] = c[c.length -1 ];
        }
        if(dp[index][lastPicked] != -1){
            return dp[index][lastPicked];
        }
        if(lastPicked == 2 || index == 0 ){
            long pick = c[index] + ans(n , x , index + 1 , c , 0 , dp);
            return dp[index][lastPicked]=pick;
        }
        long pick = c[index] + ans(n , x , index + 1 , c , 0 ,dp);
        long notPick = x + ans(n , x , index + 1 , c , lastPicked + 1, dp);
        return dp[index][lastPicked]= Math.min(pick , notPick);
    }
}
