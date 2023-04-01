package com.company;

public class Seive {
    public static void main(String[] args) {
        int n=40;

        boolean[] primes = new boolean[n+1];
        seive(n,primes);
    }
    public static void seive(int n , boolean[] primes){
        // if the value of the element is false then it is prime
        //if the value of the element is true then it is true
        for(int i=2; i*i<=n;i++){
            if(!primes[i]){//if the value of  primes[i] is false then it i is the prime number

                for(int j=i*2;j<= n;j=j+i){//converting the multiple of the current number to true
                    primes[j]= true;
                }
            }
        }
        //printing the elements
        for(int k=2;k<=n;k++){
            if(!primes[k]){
                System.out.print(k + " ");
            }

        }

    }

}
