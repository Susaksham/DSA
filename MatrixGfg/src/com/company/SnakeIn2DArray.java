package com.company;

public class SnakeIn2DArray {
    public static void main(String[] args) {
        int[][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12},
                {13,14,15}
        };
        snakeIn2dArray(array);
    }
    public static void snakeIn2dArray(int[][] arr){
        int rowStart =0;
        int rowEnd = arr.length;
        int colStart =0;
        int colEnd = arr[0].length ;
        int col =0;
        int row =0;
        int direction = 0;
        while(row < rowEnd){
            if(col < colEnd && direction==0){
                System.out.print(arr[row][col] + " ");
                col++;
            }
            else if(col>=0 && col < colEnd && direction == 1){
                System.out.print(arr[row][col] + " ");
                col--;
            }
            else if( col == colEnd){
                row++;
                col--;
                direction = direction ^ 1;

            }
            else{
                row++;
                col++;
                direction = direction ^ 1;
            }
        }
    }
}
