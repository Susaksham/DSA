package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class ArrayWork {

    public static void main(String[] args) {
	// write your code here
        int[] arr= new int[5];
        Scanner ob=new Scanner(System.in);
//        arr[0]=23;
//        arr[1]=425;
//        arr[2]=15;
//        arr[3]=25;
//        arr[4]=35;
//        System.out.println(arr[3]);
//        for(int i=0;i<arr.length;i++){
//            arr[i] =ob.nextInt();
//        }
////        for(int i:arr){
////            System.out.println(i);
////        }



//        System.out.print(Arrays.toString(arr));



        //Array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i]=ob.next();

        }

    }
}
