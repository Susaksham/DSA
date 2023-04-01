package com.company;
import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner ob= new Scanner(System.in);
        char a=ob.next().trim().charAt(0);
        char b=ob.next().trim().charAt(1);
        if(a>='a' && a<='z'){
            System.out.println("it is in lower cases : "+a);

        }
        else if (a>='A' && a>='b'){
            System.out.println("it is in upper case : "+a);
        }
    }
}
