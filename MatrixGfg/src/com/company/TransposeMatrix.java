package com.company;

import java.util.Arrays;

public class TransposeMatrix {

        public static void main(String[] args) {
            int[][] array = {
                    {1,2,3},
                    {4,5,6},
                    {7,8,9},

            };
            transposeMatrix(array);
            for(int i=0;i< array.length;i++){
                System.out.println((Arrays.toString(array[i])));
            }
            ;
        }
        public static void transposeMatrix(int[][] arr ){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr[i].length;j++){
                    swap(arr,i,j );
                }
            }
        }
        public static void swap(int[][] arr , int index1, int index2){
            int temp = arr[index1][index2];
            arr[index1][index2] = arr[index2][index1];
            arr[index2][index1] = temp;
        }

}
