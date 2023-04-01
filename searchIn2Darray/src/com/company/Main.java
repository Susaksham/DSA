package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int k=3;
        int[][] mat={{1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}};
        int[] array= new int[mat.length];
        int[] array2=new int[mat.length];
        int index=0;
        for(int row=0;row<mat.length;row++){
            int count=0;
            for(int col=0;col<mat[row].length;col++){
                if(mat[row][col]==1){
                    count++;
                }
            }
            array[index]=count;
            array2[index]=row;

        }
        for(int i=1;i<array.length;i++){
            int keycard=array[i];
            int keycard2=array2[i];
            int j=i-1;
            while(j>=0 && array[j]>keycard){
                array[j+1]=array[j];
                array2[j+1]=array2[j];
                j--;
            }
            array[j+1]=keycard;
            array2[j+1]=keycard2;
        }
        int[] arrayfinal=new int[k];
        for(int f=0;f<arrayfinal.length;f++){
            arrayfinal[f]=array2[f];
        }
        for(int f=0;f<arrayfinal.length;f++){
            System.out.println(arrayfinal[f]);
        }
    }
}
