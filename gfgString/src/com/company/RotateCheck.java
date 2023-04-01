package com.company;

public class RotateCheck {
    public static void main(String[] args) {
        String str = "abcd";
        String s2 = "cdab";
        System.out.println(rotateCheck(str , s2));
        ;
    }
    public static boolean rotateCheck(String  s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }

        if((s1 + s1).indexOf(s2) >=0){
            System.out.println((s1 + s2).indexOf(s2));
            return true;
        }
        return false;
    }
}
