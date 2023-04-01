package com.company;

public class HashCode{

    public static void main(String[] args) {
        /*----> hashCode() :- it returns an int value of every object and that int value will always be same
        if  equals() of two objects are true;
        but it is not mandatory that if two objects are different than hashcode() value always be different
         */


	// write your code here
        String x="hello";
        String y="hellos";
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
    }
}
