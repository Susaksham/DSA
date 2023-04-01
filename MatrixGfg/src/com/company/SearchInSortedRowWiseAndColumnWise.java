package com.company;

import java.util.Arrays;

public class SearchInSortedRowWiseAndColumnWise {
    public static void main(String[] args) {
        int[][] array = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32, 33, 39, 50}
        };
        int[] ans = sort(array , 38);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] sort(int[][] arr , int element ){
        int col = arr[0].length-1;
        int row=0;
        while(row < arr.length && col >=0){
            if(arr[row][col] == element){
                return new int[]{row , col};
            }
            else if( arr[row][col] > element){
                col--;

            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}
