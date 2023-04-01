package com.company;

public class NewtonSQT {
    public static void main(String[] args) {
        System.out.println(sqrt(69));
    }
    static double sqrt(double n){
        double x=n;
        double root;
        while(true){
             root = 0.5 * (x + (n/x));//formula of the newton Raphson
            if(Math.abs(root - x)==0){//error than is fine for us
                break;
            }
            x = root;
        }
        return root;
    }
}
