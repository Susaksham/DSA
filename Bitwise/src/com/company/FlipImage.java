package com.company;

import java.util.Arrays;

public class FlipImage {
    public static void main(String args[]){
        int array[][] = {{1,1,0},{1,0,1},{0,0,0}};
        int[][] array2 = flipAndInvertImage(array);
        for(int[] arr : array2){
            System.out.println(Arrays.toString(arr));
        }


    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int end=image[i].length-1;
            int start=0;
            int temp;
            while(end>=start){
                temp=(image[i][start]) ^ 1 ;
                image[i][start]=(image[i][end]) ^ 1;
                image[i][end]=temp;
                end--;
                start++;
            }

        }


        return image;


    }
}
