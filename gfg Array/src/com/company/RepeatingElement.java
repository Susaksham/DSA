package com.company;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr = {1 , 2, 3, 5,5};
        int[] arr1 = {0,2,1,3,2,2};
        System.out.println(repeatingElement1(arr1));;
    }
    public static int repeatingElement1(int[] arr){
        int slow = arr[0]+1;
        int fast = arr[0]+1;

        do{
            slow = arr[slow]+1;
            fast = arr[arr[fast]+1]+1;
        }while(slow != fast);

        slow = arr[0]+1;
        while(slow != fast){
            slow = arr[slow]+1;
            fast = arr[fast] +1;
        }
        return slow-1;
    }
    public static int repeatingElement(int[] arr){
        int slow = arr[0];
        int fast = arr[0];

        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow != fast);

        slow = arr[0];
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }

}
