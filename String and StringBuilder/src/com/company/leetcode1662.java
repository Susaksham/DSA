package com.company;

public class leetcode1662 {
    public static void main(String[] args) {
        String[] word1={"ab","c"};
        String[] word2={"a","bc"};
        System.out.println(arrayStringsAreEqual(word1,word2));
    }
     public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder ob=new StringBuilder();
        StringBuilder ob1=new StringBuilder();
        for(int i=0;i<word1.length;i++){
            ob.append(word1[i]);
        }
        for(int j=0;j<word2.length;j++){
            ob1.append(word2[j]);
        }
        if(ob.toString().equals(ob1.toString())){
            return true;
        }
        return false;
    }
}
