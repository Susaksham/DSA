package com.company;

import java.util.Arrays;

public class LeftMostNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "geekforgeeks";
        System.out.println(naiveSolution(str));
        System.out.println(leftMostNonRepeatingCharacter(str));
        System.out.println(mostEfficiantSolution(str));
    }
    // this is O(n) time complexity and constant space complexity with two times traversal
    static int mostEfficiantSolution(String str){
        int[] array = new int[256];
        Arrays.fill(array , -1);
        int minIndex = Integer.MAX_VALUE;
        for(int i=0; i< str.length();i++){
            if(array[str.charAt(i)] == -1){
                array[str.charAt(i)] = i;
            }
            else{
                array[str.charAt(i)] = -2;
            }
        }
        for(int i=0;i<256;i++){
            if(array[i] >=0){
                minIndex = Math.min(minIndex , array[i]);
            }
        }
        return minIndex;
    }
    static int leftMostNonRepeatingCharacter(String str){
        int[] array = new int[256];
        for(int i=0; i< str.length();i++){
            array[str.charAt(i)]++;
        }
        for(int i=0;  i< str.length();i++){
            if(array[str.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
    static int naiveSolution(String str){
        here:
        for(int i=0; i<str.length();i++){
            for(int j=i+1; j< str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    continue here;
                }
            }
            return i;
        }
        return -1;
    }

}
