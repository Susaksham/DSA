package com.company;

public class RoughWorkArray {
    public static void main(String[] args) {
//        int[] nums={9,5,2,34,1,5,0};
//        int k=1;
        int[][] arr = {{1,2,3,4}
                ,{5,6,7,8},
                {9,10,11,12}};

//        int[][] arr={{1,2},{3,4}};
//        int[][] mat= {{1,2,3},
//                {4,5,6},
//                {7,8,9}};
//
//        int diagonal=0;
//
//        int k=mat[0].length-1;
//
//        for(int i=0;i<mat.length;i++){
//            if(i!=k && k>=0){
//                diagonal=diagonal+mat[i][i]+mat[i][k];
//            k=k-1;}
//            else {
//                diagonal=diagonal+mat[i][i];
//                k--;
//
//            }
//
//        }
//        System.out.println(diagonal);
//        int multi=(int)Math.pow(10,digits.length-1);
//        int sum=0;
//        for(int i=0;i<digits.length;i++){
//            sum=digits[i]*multi+sum;
//            multi=multi/10;
//
//        }
//        sum=sum+1;
//        int value=sum;
//        int digit=0;
//        int lastIndex=digits.length-1;
//        int numberOfdigit=0;
//        while(value>0){
//            value=value/10;
//            numberOfdigit++;
//        }
//        int[] newArray=new int[numberOfdigit];
//
//        value=sum;
//        while(value>0 && lastIndex>=0){
//            digit=value%10;
//            value=value/10;
//            newArray[lastIndex]=digit;;
//            lastIndex--;
//
//        }
//        if(digits[digits.length-1]>=0 && digits[digits.length-1]<=8){
//
//            int[] newArray= new int[digits.length];
//            newArray=digits;
//            newArray[digits.length-1]=newArray[digits.length-1]+1;
//            for(int i=0;i<newArray.length;i++){
//                System.out.print(newArray[i] +" ");
//            }
//
//
//
//        }
//        int[] newArray= new int[digits.length+1];
//        for(int i=0;i<digits.length;i++){
//            newArray[i]=digits[i];
//        }
//        newArray[newArray.length-2]=1;
//        newArray[newArray.length-1]=0;
//
//
//        for(int i=0;i<newArray.length;i++){
//            System.out.print(newArray[i] +" ");
//        }
//
//
//        for(int i=(nums.length-k);i<=nums.length-1;i++){
//            int value=nums[i];
//            int j=i-1;
//            int x=1;
//            int h=nums.length-k;
//
//            while(j>=0 && x<=h){
//                nums[j+1]=nums[j];
//                j--;
//                x++;
//            }
//            nums[j+1]=value;
//        }
//        for(int m=0;m<nums.length;m++){
//            System.out.print(nums[m]);


        //}

        int rowFirst=0;//k
        int rowEnd=arr.length-1;//m
        int columnFirst=0;//l
        int columnEnd=arr[rowFirst].length-1;//n
        while(rowFirst<=rowEnd && columnFirst<=columnEnd) {

            for (int j = columnFirst; j <= columnEnd; j++) {
                System.out.print(arr[rowFirst][j]+"  ");
            }
            rowFirst++;
            for (int k = rowFirst; k <=rowEnd; k++) {
                System.out.print(arr[k][columnEnd]+"  ");
            }
            columnEnd--;
            {
            for (int l = columnEnd; l >=columnFirst; l--) {
                System.out.print(arr[rowEnd][l]+"  ");
            }
            }
            rowEnd--;
             {
                for (int m = rowEnd; m >= rowFirst; m--) {
                    System.out.print(arr[m][columnFirst] + "  ");
                }
            }
            columnFirst++;

        }
    }

    }

