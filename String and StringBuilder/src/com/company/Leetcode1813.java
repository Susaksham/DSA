package com.company;

public class Leetcode1813 {
    public static void main(String args[]){

        String sentence1="eTUny i b R UFKQJ EZx JBJ Q xXz";
        String sentence2="eTUny i R EZx JBJ xXz";
        boolean result=false;
        if(sentence2.contains(sentence1)){//when the correct array is present
            String[] arrayOfSentence1=sentence1.split(" ");
            String[] arrayOfSentence2=sentence2.split(" ");
            if(arrayOfSentence1[0].equals(arrayOfSentence2[0])  || arrayOfSentence1[arrayOfSentence1.length-1].equals(arrayOfSentence2[arrayOfSentence2.length-1]) ){
                System.out.println(true);

            }
            else {//when sentence first is present but in the middle of the second sentence
                System.out.println(false);
            }
        }
        else{
            String[] arrayOfSentence1=sentence1.split(" ");
            String[] arrayOfSentence2=sentence2.split(" ");
            if(arrayOfSentence1[0].equals(arrayOfSentence2[0])  || arrayOfSentence1[arrayOfSentence1.length-1].equals(arrayOfSentence2[arrayOfSentence2.length-1] )){
                System.out.println(true);

            }
            else{
                result=false;
            }
        }
        if(sentence1.contains(sentence2)){
            String[] arrayOfSentence1=sentence1.split(" ");
            String[] arrayOfSentence2=sentence2.split(" ");
            if(arrayOfSentence1[0].equals(arrayOfSentence2[0])  || arrayOfSentence1[arrayOfSentence1.length-1].equals(arrayOfSentence2[arrayOfSentence2.length-1] )){
                System.out.println(true);

            }
            else{
                System.out.println(false);
            }
        }
        else{
            String[] arrayOfSentence1=sentence1.split(" ");
            String[] arrayOfSentence2=sentence2.split(" ");
            if(arrayOfSentence1[0].equals(arrayOfSentence2[0])  || arrayOfSentence1[arrayOfSentence1.length-1].equals(arrayOfSentence2[arrayOfSentence2.length-1] )){
                System.out.println(true);

            }
            else{
                System.out.println(false);
            }
        }
        System.out.println(false);
}
}
