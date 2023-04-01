package com.company;

import java.util.ArrayList;

public class OccuredElementInNRange {
    public static void main(String[] args) {
        int[] L = { 1, 4, 9, 13, 21 };
        int[] R = { 15, 8, 12, 20, 30 };
        int n = L.length;
        System.out.println(maximumOccurredElement(L, R, n));
    }
    static int maximumOccurredElement(int[] L, int[] R, int n) {
        int MAX = 1000;
        // Initialising all element of array to 0.
        int[] arr = new int[MAX];

        // Adding +1 at Li index and
        // subtracting 1 at Ri index.
        int maxi = -1;
        for (int i = 0; i < n; i++) {
            arr[L[i]] += 1;//first of all we will increase the index by 1 for all the beginning of the index
            arr[R[i] + 1] -= 1;// we will decrease the element by one for every ending range element + 1
            if (R[i] > maxi) {
                maxi = R[i];
            }
        }

        // Finding prefix sum and index
        // having maximum prefix sum.
        int msum = arr[0];
        int ind = 0;
        for (int i = 1; i < maxi + 1; i++) {
            arr[i] += arr[i - 1];// when ever we first find the starting element from that point we are going to make everything one
            if (msum < arr[i]) {
                msum = arr[i];
                ind = i;
            }
        }

        return ind;
    }
}
