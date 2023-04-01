package com.company;

public class Power {
    public static void main(String[] args) {
        int base =3;//11 3^1 * 3^2
        int power =10;//3^4 * 3^2  //10  3^8 * 3^2 //1010  & 0001
        int ans =1;
        while(power >0){
            if((power & 1)==1){
                ans *=base;
            }
            base *=base;//this condition is basically doing 3^1 3^2 3^4 3^8
            power = power >>1;
        }
        System.out.println( ans);
    }
}
//1 ---> 1(ans) base(9)
//2----->9(ans) base(81)
//3 ---->9(ans)  base(6561)
//4 ----->9 *6561  base(6561 *2)


