package com.company;

public class FindPivotPoint {
    public static void main(String[] args) {
    int[] array={0,1,2,3,4,5,6};
        System.out.println(findPivot(array));
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1])
            if ( arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            if (arr[mid] <=arr[start]) {//equal to sign is important because when start is at 6 and mid is also 6 and end is 6
                //if we will not put = then loop will never end as start will never be greater than the end
                end = mid - 1;
            } else if(arr[mid]>arr[start]){//we can also put the = to sign here so that loop can end otherwise when mid and start
                // will be equal at that time no condition will work that will cause infinite loop
                //we already know mid between two consecutive element is previous element
                start = mid + 1;
            }
        }
        return -1;//when the array we be sorted(means no pivot point) at that it will return -1 as we will not find any element whose next(m+1) is
        //smaller than the previous element(mid) this means array is not rotated

    }
}
