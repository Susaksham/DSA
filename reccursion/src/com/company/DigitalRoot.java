package com.company;

public class DigitalRoot {
    public static void main(String[] args) {
        System.out.println(digitalRoot(27640));
    }
    public static int digitalRoot(int n)
    {
        // add your code here
        return digitalRoott(n , 0);

    }
    public static int digitalRoott(int n , int sum){
        if((n==0)  && (sum <10)){
            return sum;
        }
        else if((n==0) && (sum >=10)){
            return digitalRoott(sum , 0);
        }

        sum = sum + n%10;

        return digitalRoott(n/10 , sum);

    }
}
