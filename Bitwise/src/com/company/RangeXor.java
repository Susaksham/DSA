package com.company;

public class RangeXor {
    public static void main(String[] args) {
    //range xor for a,b = xor(b) ^ xor (a-1)
        int a = 3;
        int b=9;
        int ans = xor(b) ^ xor(a-1);
        System.out.println(ans);
        System.out.println(32^1);
        System.out.println(xor(5));
    }
    //this gives xor from 0 to a
    //5 0^1^2^3^4^5^4^3^2^1^0
    static int xor(int a){
        if(a % 4 ==0){
            return a;
        }
        if(a % 4 ==1){
            return 1;
        }
        if(a % 4 ==2){
            return a+1;
        }
        if(a % 4 ==3){
            return 0;
        }
        return 0;
    }

}
