package com.company;

public class FindPivotWithDuplicates {
    public static void main(String[] args) {
//        int[] array = {8, 9, 9, 0, 1, 3, 3, 5, 8};
        int[] array={1,2,4,4,4,6,8,9,10};
//        int[] array={5,6,7,1,2,3,4};
//        int[] array={1};
        System.out.println(findPivotWithDuplicates(array));
    }

    static int findPivotWithDuplicates(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid < end && array[mid] > array[mid + 1]) {
                return mid;
            }  if (start < mid && array[mid] < array[mid - 1]) {
                return mid - 1;
            } if (array[mid] == array[start] && array[mid] == array[end]) {
                //this is the condition if all start mid and end are equal
                //to each other
                if (start < end && array[start] > array[start + 1]) {
                    return start;//here i will cancel the start element if that element is not the pivot
                }
                start++;//we are increasing the start element one by one
                if (start < end && array[end] < array[end - 1]) {//start and end should not be equal to each other
                    return end - 1;
                }
                end--;
            }//else if condition is important rather than the if condition because after changing the start and end it can become
            //out of boundry
            else if (array[start] < array[mid] || array[mid] == array[start] && array[start] > array[end]) {
                /*start element can be smaller than the mid element than it means if that mid is not the pivot point(and it is
                not pivot point because if it was it would have been caught in above two statements
                if the start element is smaller than the middle element it means there are more bigger element of the right
                side of the mid

                if the mid element and the start element are equal and start element is greater than the end element
                this means that the (mid) element lie on the left side of the pivot point so start =mid+1
                */
                start = mid + 1;
                //else if condition is important in order it to work
            } else if (array[start] > array[mid] || array[end] > array[mid] || array[mid] == array[end] /*&& array[start] > array[end]*/) {
                /*array[start] > array[mid] :-this means that mid lie on the right side of the pivot element*/
                end = mid - 1;
            }

        }

        return -1;
    }
//        static int findPivotWithDuplicates(int[] arr) {
//            int start = 0;
//            int end = arr.length - 1;
//            while (start <= end) {
//                int mid = start + (end - start) / 2;
//                // 4 cases over here
//                if (mid < end && arr[mid] > arr[mid + 1]) {
//                    return mid;
//                }
//                if (mid > start && arr[mid] < arr[mid - 1]) {
//                    return mid-1;
//                }
//
//                // if elements at middle, start, end are equal then just skip the duplicates
//                if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
//                    // skip the duplicates
//                    // NOTE: what if these elements at start and end were the pivot??
//                    // check if start is pivot
//                    if (start < end && arr[start] > arr[start + 1]) {
//                        return start;
//                    }
//                    start++;
//
//                    // check whether end is pivot
//                    if (end > start && arr[end] < arr[end - 1]) {
//                        return end - 1;
//                    }
//                    end--;
//                }
//                // left side is sorted, so pivot should be in right
//                else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
//                    start = mid + 1;
//                } else {
//                    end = mid - 1;
//                }
//            }
//            return -1;
//        }
    }



