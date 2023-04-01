package com.company;

public class TwoStackInArray {
    public static void main(String[] args) {
    TwoArrayStack ob = new TwoArrayStack(10);
    ob.push1(0);
    ob.push2(9);
    ob.push1(1);
        ob.push1(12);
        ob.push1(13);
        ob.push1(14);
        ob.push1(15);
        ob.push1(16);

    ob.push2(8);
        ob.push2(7);
    ob.push2(6);
        System.out.println(ob.pop1());
        System.out.println(ob.pop1());
        System.out.println("===============================");
        System.out.println(ob.pop2());
        System.out.println(ob.pop2());
        System.out.println(ob.pop2());
    }

}
class TwoArrayStack{
    int[] array ;
    int cap;
    int topOfFirstStack = -1;
    int topOfSecondStack;
    TwoArrayStack(int cap){
        this.cap = cap;
        array = new int[this.cap];
        if(topOfFirstStack < array.length-1){
            topOfSecondStack =  array.length;
        }
    }
    public boolean push1( int x){
        if((topOfFirstStack+1) < topOfSecondStack){
            topOfFirstStack++;
            array[topOfFirstStack] = x;

            return true;
        }
        else{
            System.out.println("no more element in first stack can be added");
            return false;
        }
    }
    public boolean push2( int x){
        if((topOfFirstStack+1) < topOfSecondStack){
            topOfSecondStack--;
            array[topOfSecondStack] = x;
            return true;

        }
        else{
            System.out.println("no more element in second stack can be added");
            return false;
        }
    }
    public Integer pop1 (){
        if(topOfFirstStack>=0){
            int deletedElement = array[topOfFirstStack];
            topOfFirstStack--;
            return deletedElement;
        }
        else{
            System.out.println("item cannot be deleted");
            return null;
        }

    }
    public Integer pop2 (){
        if(topOfSecondStack < array.length){
            int deletedElement = array[topOfSecondStack];
            topOfSecondStack++;
            return deletedElement;
        }
        else{
            return null;
        }
    }

}
