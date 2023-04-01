package com.company;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[][] = {{1 , 4} , {0 , 6}};
        System.out.println(result( 2 , arr));
    }
    public static int result (int input1 , int[][] input2){

        Arrays.sort(input2,new Comparator<int[]>(){

            public int compare(int[] i1,int[] i2)
            {
                return i1[0] - i2[0];
            }
        });


        int res = 0;
        for(int i=1; i < input2.length; i++){
            if(input2[res][1] > input2[i][0]){
                input2[res][1] = Math.max(input2[res][1] , input2[i][1]);
                input2[res][0] = Math.min(input2[res][0] , input2[i][0]);

            }
            else{
                res++;
                input2[res][0] = input2[i][0];
                input2[res][1] = input2[i][1];

            }
        }
        int sum = 0;
        for(int i= 0; i<= res ; i++){
            sum = sum + input2[i][1] - input2[i][0];
        }
        return sum ;
    }
}
