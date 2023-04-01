package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class LeftMostRepeatingCharacter {
    public static void main(String[] args){
//        String str = "abcd";
//        String  str = "geeksforgeeks";
        String str = "abccbd";
        System.out.println(leftMostRepeatingCharacter(str));
        System.out.println(normalApproach(str));
        System.out.println(anotherBestApproach(str));
        System.out.println(bestEfficiantSoulution(str));
    }
    public  static int bestEfficiantSoulution(String s1 ){
    // this is the best solution because here we are creating the array of the boolean type that has size of 1 bit
        // while the size of the integer is 4 so it more efficiant to use the boolean array
        boolean array[] = new boolean[256];
        int smallestIndex= Integer.MAX_VALUE;
        for(int i= s1.length() -1 ; i>=0; i--){
            if(array[s1.charAt(i)] == false){
                array[s1.charAt(i)] = true;
            }
            else{
                smallestIndex =  i;
            }
        }
        if(smallestIndex == Integer.MAX_VALUE){
            return -1;
        }
        return smallestIndex;
    }
    public static int leftMostRepeatingCharacter(String str){
        int  smallestIndex = Integer.MAX_VALUE;
        HashMap<Character , Integer> map = new HashMap<>();
        for(int i=0; i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                smallestIndex = Math.min(smallestIndex , map.get(str.charAt(i)));
            }
            if(map.containsKey(str.charAt(i)) == false){
                map.put(str.charAt(i) , i);
            }
        }
        if(smallestIndex == Integer.MAX_VALUE){
            return -1;
        }
        return smallestIndex;
    }
    public static int anotherBestApproach(String str){
        final int  CHARACTER = 256;
        int[] array = new int[CHARACTER];
        int smallestIndex = Integer.MAX_VALUE;
        Arrays.fill(array , -1);
        for(int i=0; i< str.length();i++){
            if(array[str.charAt(i)] == -1){
                array[str.charAt(i)] = i;
            }
            else{
                smallestIndex = Math.min(smallestIndex , array[str.charAt(i)]);
            }

        }
        if(smallestIndex == Integer.MAX_VALUE){
            return -1;
        }
        return smallestIndex;

    }
    public static int normalApproach(String str){
        final int CHARACTER = 256;
        int[] array = new int[CHARACTER];
        for(int i=0; i<str.length();i++){
            array[str.charAt(i)-97]++;
        }
        for(int i=0; i<str.length();i++){
            if(array[str.charAt(i)-97] > 1){
                return i;
            }
        }
        return -1;
    }
}
