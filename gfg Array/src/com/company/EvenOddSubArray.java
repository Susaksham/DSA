package com.company;

public class EvenOddSubArray {
    public static void main(String[] args) {
        int[] arr ={10,12,8,4};
        System.out.println(contigiousEvenOddSubArray(arr));
        System.out.println(contigiousEvenoddSubArrayOptimized(arr));
    }
    /*Time complexity :- O(N)
    it is very similar to the kadan's algorithm
     In this whenever we get the contigiousEven odd element we increase the subaaray if we dont get the contigious subarray we start the
     new subarray*/
    public static int contigiousEvenoddSubArrayOptimized(int[] arr){
        int contigious =1;
        int maxContigious = Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if((arr[i] %2 ==0 && arr[i-1]%2 ==1) || (arr[i-1]%2 ==1 && arr[i] %2 ==0)){
                contigious++;
                maxContigious = Math.max(maxContigious,contigious);

        }
            else{
                contigious=1;
                maxContigious = Math.max(maxContigious,contigious);
            }

    }
        return maxContigious;
    }
    public static int contigiousEvenOddSubArray(int[] arr){
        String previousStr ="";
        String currentString ="";
        int contigious =1;
        int maxContigious = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2 ==0){
                currentString = "even";
            }
            else if(arr[i]%2==1){
                currentString ="odd";
            }
            if(currentString.equals(previousStr) || previousStr.isEmpty()){
                maxContigious = Math.max(maxContigious,contigious);
                contigious=1;
                previousStr = currentString;
            }
            else{
                contigious++;
                maxContigious = Math.max(maxContigious,contigious);
                previousStr = currentString;
            }
        }
        return maxContigious;

    }
}
