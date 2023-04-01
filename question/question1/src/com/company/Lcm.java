package com.company;

public class Lcm {
    public static void main(String args[]){

        int a=24;
        int b=32;
        int lcm=a>b?a:b;
        while(lcm%a!=0 || lcm%b!=0){
            lcm=lcm+1;

        }
        System.out.println(lcm);






    }

}
