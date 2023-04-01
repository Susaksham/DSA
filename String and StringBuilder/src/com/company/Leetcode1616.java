package com.company;

public class Leetcode1616 {
    public static void main(String[] args) {
//        String a="X";
//        String b="Y";
//        String a="ulacfd";
//        String b="jizalu";
        String a="abc";
        String b="def";
        System.out.println(checkPalindromeFormation(a,b));

    }
    static public boolean checkPalindromeFormation(String a, String b) {
        for(int i=0;i<=a.length();i++){
            String aprefix= a.substring(0,i);
            String asuffix=a.substring(i,a.length());
            String bprefix=b.substring(0,i);
            String bsuffix=b.substring(i,b.length());
            String combination1=aprefix+bsuffix;
            String combination2=bprefix+asuffix;
            if(palindrome(combination1)){
                return true;
            }
            else if(palindrome(combination2)){
                return true;
            }

        }
        return false;

    }
    public static boolean palindrome(String string){
        int start=0;
        int end=string.length()-1;
        while(start<=end){
            if(!(string.charAt(start)==(string.charAt(end)))){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
