public class BinarySearch {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10,11,12};
        int target= 14;
        System.out.println(binarySearch(array,target,0,array.length-1));
    }
    public static int binarySearch(int[] array, int target,int start,int end){/*start and end is useful in
    every function call because it will help in the dividing the array into two parts*/
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;/*mid is present in the body of the function because same value is not useful in the
         next argument call it is only useful to that particular call only

        */
        if(array[mid]==target){
            return mid;
        }
        else if(array[mid]>target){
            return binarySearch(array,target,start,mid-1);/* it is very important to return it because when in the last call
            either it will return the -1 or mid but it will return only to the last call if we will not return the last call we will
            not get ans*/
        }
        else {
           return binarySearch(array,target,mid+1,end);
        }
    }
}
