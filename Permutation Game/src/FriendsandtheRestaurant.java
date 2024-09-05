import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class FriendsandtheRestaurant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while(testCases-- > 0 ){
            int n = sc.nextInt();
            int[] spendArray = new int[n];
            int[] budgetArray = new int[n];
            for(int i=0; i < spendArray.length; i++){
                spendArray[i] = sc.nextInt();
            }
            for(int i=0; i < budgetArray.length; i++){
                budgetArray[i] = sc.nextInt();
            }

            int diff[] = new int[spendArray.length];
            boolean haveNegativeValue = false;
            boolean havePositive = true;
            for(int i=0; i < diff.length; i++){
                diff[i] = - spendArray[i] +  budgetArray[i];
                if(diff[i] < 0){
                    haveNegativeValue = true;
                }
                if(diff[i] >=0){
                    havePositive = true;
                }
            }
            Arrays.sort(diff);

            int index  = 0;
            if(haveNegativeValue){
                if(havePositive){
                    index = binarySearch(diff , 0);
                } else{

                }

            }
            if(!havePositive){
                System.out.println(0);
                continue;
            }
            int rightPointer = index;
            int leftPointer = index - 1;

            int currAns = 0;
            int maxAns = (diff.length  - rightPointer)/2;
            if(!haveNegativeValue){
                maxAns = (diff.length - rightPointer)/2;
            }
            int man = 0;
            while(leftPointer >=0 &&   rightPointer < diff.length){

                man++;
                if(man == 2){

                    currAns++;
                    rightPointer++;

                    man= 0;
                    continue;
                }
                if(diff[leftPointer] + diff[index] < 0){


                    rightPointer++;

                man = 1;
                    continue;
                } else if(diff[leftPointer] + diff[index] >=0){

                    currAns++;
                    rightPointer++;
                    leftPointer--;
                    man = 0;
                }
            }
            maxAns = Math.max(currAns + (int)((diff.length - rightPointer)/2) , maxAns);
            System.out.println(maxAns);
        }
    }
    public static int binarySearch (int[] arr , int element){
        int start = 0;
        int end = arr.length - 1;
        while(start + 1< end ){
            int mid = start + (end - start)/2;

            if(arr[mid] == element){
                end = mid;
                return end;
            }
            else if(arr[mid] >=0){
                end = mid;
            }
            else if(arr[mid] < 0){
                start = mid + 1;
            }
        }
        return end;
    }
}
