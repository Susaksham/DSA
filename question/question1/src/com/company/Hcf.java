package com.company;

public class Hcf {
    public static void main(String args[]){
        int hcf=2;
        int a=24;
        int b=32;

        int min=a;
        if(a>b){
            min=b;
        }
        for(int i=2;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println(hcf);

    }
}
