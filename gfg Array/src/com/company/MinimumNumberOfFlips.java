package com.company;

public class MinimumNumberOfFlips {
    public static void main(String[] args) {
String s = "111000";
        System.out.println(minFlips(s));
    }
    public static int minFlips(String s) {
        int minimumCount =0;
        char currentCharacter = 'a';
        StringBuilder str = new StringBuilder(s);
        char previousCharacter = str.charAt(0);
        for(int i=1;i<str.length();i++){
            currentCharacter = str.charAt(i);
            if(currentCharacter == previousCharacter){
                int value = Integer.parseInt(currentCharacter +  "");
                value = value^1;
                str.replace(i,i+1,value+"");
                previousCharacter = (char)(value);
                minimumCount++;
            }
            else{
                previousCharacter = currentCharacter;
            }
        }
        return minimumCount;
    }
}
