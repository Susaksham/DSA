package com.company;
interface A{
//   double cube(int a);
    void ok();
}

public class HackerRankQuestion {
    public static void main(String[] args) {
        if(matrix.length==1){
            if(binarySearch(matrix,0,matrix[0].length-1,target,0)){
                return true;
            }
            else{
                return false;
            }
        }

        int colMid=matrix[0].length/2;
        int rowfirst=0;
        int rowEnd=matrix.length-1;
        while((rowfirst+1)<rowEnd){
            int middle=rowfirst+(rowEnd-rowfirst)/2;
            if(matrix[middle][colMid]==target){
                return true;
            }
            else if(matrix[middle][colMid]>target){
                rowEnd=middle;
            }
            else if(matrix[middle][colMid]<target){
                rowfirst=middle;
            }
        }
        if(matrix[rowfirst][colMid]==target){
            return true;
        }
        else if(matrix[rowfirst][colMid]>target && colMid>0){
            if(binarySearch(matrix,0,colMid,target,rowfirst)){
                return true;
            }
        }
        else if(matrix[rowfirst][colMid]<target && colMid<matrix[0].length-1){
            if(binarySearch(matrix,colMid+1,matrix.length-1,target,rowfirst)){
                return true;
            }
        }
        else if(matrix[rowfirst+1][colMid]==target){
            return true;
        }
        else if(matrix[rowfirst+1][colMid]>target && colMid>0){
            if(binarySearch(matrix,0,colMid-1,target,rowfirst+1)){

            }
        }
        else if(matrix[rowfirst][colMid]<target && colMid<matrix[0].length-1){
            if(binarySearch(matrix,colMid+1,matrix.length-1,target,rowfirst)){
                return true;
            }
        }
        return false;

    }

    }
    static boolean binarySearch(int[][] array,int start,int end,int target,int row){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(array[row][mid]==target){
                return  true;

            }
            else if(array[row][mid]>target){
                end=mid-1;
            }
            else if(array[row][mid]<target){
                start=mid+1;
            }
        }
        return false;
    }
}
