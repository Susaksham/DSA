package com.company;
import java.util.Scanner;

public class Vowels {
    public static void main(String args[]){
        char f='d';
        char b='c';
        Scanner ob= new Scanner(System.in);
        char c=ob.next().charAt(0);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            System.out.println("it is an vowel ");
        }
        else{
            System.out.println("it is a Constant");
        }
    }
}
