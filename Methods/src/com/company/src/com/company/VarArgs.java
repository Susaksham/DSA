package com.company.src.com.company;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {

        call(2,3,4,5,6,7);
    }
    static void call(float...value){

        System.out.println(Arrays.toString(value));
    }
}
