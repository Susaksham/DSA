package com.company;

import java.util.ArrayList;
import java.util.List;

public class SubsetAndSubSequence {
    public static void main(String[] args) {
        int[] array={1,2,3};
//        subset(array , 0 , new ArrayList<>());
        System.out.println(subsets(array));

    }
    public static List<List<Integer>> subsets(int[] nums) {
        //first of all we can do this with help of bit
        /*total number of subsets = 2^n;

         */
        int n= nums.length;
        int power =(int) Math.pow(2,n);

        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<power;i++){
            List<Integer> tempList = new ArrayList<>();
            for(int j=0;j<n;j++){
                if(((1<<j)& i )>0){
                    tempList.add(nums[j]);
                }
            }
            list.add(tempList);

        }
        return list;
    }
   static void subset(int[] array ,int index , ArrayList<Integer> list){
        if(index == array.length ){
            System.out.println(list);

            return;
        }
        subset(array , index+1 ,list);//when we are not adding in the array
       list.add(array[index]);// by this we are adding the element in the array
        subset(array, index + 1 , list);//when we are adding the element in the array
        list.remove(list.size()-1);//this is used for backtracking

   }
    static void subSequence(String str , String curr, int index ){
        if(index== str.length()){
            System.out.println(curr);
            return;
        }
        subSequence(str, curr ,index+1);
        subSequence(str , curr + str.charAt(index) , index+1);

    }

}
