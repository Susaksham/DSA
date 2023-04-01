package com.company;

import java.util.HashSet;

public class OptimalPartitionOfString {
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
        ;
    }
    public static int partitionString(String s) {
        return (reccur(s , 0 , 0 , s.length()-1) + 1);
    }
    public  static int reccur(String s , int k , int start , int end){
        if(checking(s.substring(start , end+1))){
            return k;
        }
        if(start > end){
            return k;
        }
        int minValue = Integer.MAX_VALUE;
        for(int i=start ; i<=end; i++){
            if(checking(s.substring(start , i+1))){
                minValue = Math.min(reccur(s , k + 1 , i+1 , end), minValue);
            }
        }
        return minValue;
    }

    public static boolean checking(String str){
        HashSet<Character> set = new HashSet<Character>();
        for(int i=0; i<str.length(); i++){
            if(!set.isEmpty()) {


                if (set.contains(str.charAt(i))) {
                    return false;
                }
                else{
                    set.add(str.charAt(i));
                }
            }
            else{
                set.add(str.charAt(i));
            }
        }
        return true;
    }
}
