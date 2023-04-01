package com.company;

public class Palindrome {
    public static void main(String[] args) {
        String str = "aroraa";
        System.out.println(palindromeString(str,0,str.length()-1));
    }

    public static boolean palindromeString(String str, int start, int end){

       if(start >end){
           return true;
       }
       else if(str.charAt(start) == str.charAt(end)){
           return palindromeString(str,start+1,end-1);
       }
       return false;
    }
}

