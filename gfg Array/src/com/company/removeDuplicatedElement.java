package com.company;

public class removeDuplicatedElement {
    /* it removes all the duplicate element from the sorted array in time complexity:-O(n)
    space comeplexity :- O(1);
     */
    public static void main(String[] args) {
        int[] arr ={1,1,2,2,3,3,3,3,4,4};

        int length = remDup(arr);
    for(int i=0; i<length;i++){
        System.out.println(arr[i]);
    }

    }
    public static int remDup(int[] arr){
        int res=1;//where the next distinct element will be present
        for(int i=1;i<arr.length;i++){
            /*when even we get a distinct element from the last distinct element(res-1) index this means this element is not
            present in our result collection we will add it there and
            as the elements are sorted there is no need to check it with the previous element
             */
            if(arr[i] != arr[res-1]){
                arr[res] = arr[i];//storing that distinct element at the res position
                res++;
            }
        }

        return res;

    }
}
