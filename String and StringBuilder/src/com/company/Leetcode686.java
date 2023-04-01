package com.company;

public class Leetcode686 {
    public static void main(String[] args) {
        String a= "abcd";
        String b= "cdabcdab";
        String newString = a;
        int len1= a.length();
        int len2= b.length();
        int times=1;
        while(len1<=len2){
            newString= newString + a;
            times++;
            if(newString.contains(b)){
                break;
            }


            len1=newString.length();
        }
        if(newString.contains(b)){
            System.out.println(times);
        }
        System.out.println("-1");
    }
}
