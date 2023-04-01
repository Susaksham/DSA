package com.company;

import java.util.Scanner;

public class Amcat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String str= sc.nextLine();
        String newStr  = "";
       for(int i=0; i<str.length(); i++){
           if(str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U' && str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u'){
               newStr = newStr + str.charAt(i);
           }
       }
        System.out.println(newStr);

    }
}
