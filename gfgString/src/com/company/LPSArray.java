package com.company;

import java.util.Arrays;

public class LPSArray {
    public static void main(String[] args) {
        String str = "ababacab";
        String temp = "";
        int[] array = new int[str.length()];
        int[] array2 = new int[str.length()];
        for(int i=0; i<str.length();i++){
            temp = temp + str.charAt(i);
            array[i] = lpsArray(temp);
            array2[i] = lpsArray1(temp , temp.length());
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array2));
        System.out.println( Arrays.toString(lpsEfficiant(str)));

    }
    //everything is  being explained properly in the notebook
    public static int[] lpsEfficiant(String str ){
        int[] lpsArray = new int[str.length()];
        lpsArray[0] = 0;// we already know for the first character it will be zero
        int len = 0;// it is the value of the i-1 index of lps array  which tells the longest constructive prefix and suffix

        int i=1;
        while(i < str.length()){
            if(str.charAt(i) == str.charAt(len)){// when the character are matching
                len++;
                lpsArray[i] = len;
                i++;
            }
            else if(str.charAt(i) != str.charAt(len) && len==0){
                lpsArray[i] = 0;
                i++;

            }
            else if(str.charAt(i) != str.charAt(len)){
                len = lpsArray[len-1];//this part is  explained in the notebook
            }
        }
        return lpsArray;
    }
    public static int lpsArray1(String str  , int n){
        for(int i = n-1; i>0; i--){
            boolean  flag = true;
            for(int j= 0;  j<i;j++){
                if(str.charAt(j) != str.charAt(n - i +j)){
                    flag = false;
                }
            }
            if(flag){
                return i;
            }
        }
        return 0;
    }
    public static int lpsArray(String str ) {
        int i = 0;
        int j = i + 1;
        int maxCount = 0;
        int currentCount = 0;
        while(j<str.length()){
            int iteratorOfI = i;
            boolean  flag = true;
            int count =0;
            for(int k=j; k<str.length();k++){
               if(str.charAt(iteratorOfI) != str.charAt(k)){
                   flag = false;
                   break;
               }
               iteratorOfI++;
               count++;
            }
            if(flag){
                maxCount = Math.max(maxCount , count);
            }
            j++;
        }
        return maxCount;
    }
}
