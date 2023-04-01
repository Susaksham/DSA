package com.company;
import java.util.Scanner;
public class SwitchAdcance {
    public static void main(String args[]){
        Scanner ob= new Scanner(System.in);
        String input=ob.next();
        switch (input) {
            case "Mango" -> System.out.println("King of fruits");//automatically break statement will appear
            case "Apple" -> System.out.println("Red sweet fruti");
            case "Orange" -> System.out.println("Round fruit");
            case "grapes" -> System.out.println("Small fruits");
            default -> System.out.println("Please Enter the valid fruit");
        }

    }
}
