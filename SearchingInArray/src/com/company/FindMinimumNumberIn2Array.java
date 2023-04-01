package com.company;

public class FindMinimumNumberIn2Array {
    public static void main(String[] args){
        int[][] array={{2,31,42,53},{23,43,21},{1,81,91}};
        System.out.println(minimumNumberIn2dArray(array));
    }
    static int minimumNumberIn2dArray(int[][] arr){
        int minimumvalue2=0;
        int minimumValue=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr[i].length;j++){
                if(minimumValue>arr[i][j]){
                    minimumValue=arr[i][j];
                }
            }
           minimumvalue2=minimumValue;
        }
        return minimumvalue2;

    }
}
