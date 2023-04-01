package com.company;

public class KthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {10,5,30,12};
        int k=2;
        System.out.println(kthSmallestElement(arr , k , 0 , arr.length-1));
        System.out.println(kthSmallest(arr , arr.length, 2));
    }
    static int kthSmallest(int arr[],int n,int k){
        int l=0,r=n-1;
        while(l<=r){
            int p=lomutoPartitition(arr,l,r);
            if(p==k-1)
                return arr[p];
            else if(p>k-1)
                r=p-1;
            else
                l=p+1;
        }
        return -1;
    }
    public static int kthSmallestElement(int[] arr , int k , int start , int end){
        int partition = lomutoPartitition(arr , start , end);
        if(partition == k-1){
            return arr[k-1];
        }
        else if(partition > k-1){
          return  kthSmallestElement(arr ,k, start ,partition-1);
        }
        else{
            return kthSmallestElement(arr , k , partition + 1 , end);
        }
    }
    public static int lomutoPartitition (int[] arr , int start , int end){
        int pivot = arr[end];
        int i=-1;

        for(int j=start;j<end;j++){
            if(arr[j] < pivot){
                i++;
                swap(arr , j , i);
            }
        }
        swap(arr , i+1 , end);
        return (i+1);
    }
    public static void swap (int[]  arr , int index1 , int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
