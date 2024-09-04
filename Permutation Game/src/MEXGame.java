import java.util.Scanner;

public class MEXGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCasese = sc.nextInt();
        while(testCasese--  > 0 ){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] count = new int[n];
            for(int i=0; i < arr.length; i++){
                arr[i] = sc.nextInt();
                count[arr[i]]++;
            }


            int firstIndex = -1;
            int secondIndex = -1;

            // whome ever he will try to attack i will it up first
//
//            for(int index = 0 ;index < count.length;index++){
//                if(firstIndex < 0 && count[index] > 0 &&  count[index] <= index ){
//                    firstIndex = index;
//                }
//                else if((secondIndex < 0 &&  (count[index] <= index || count[index] == 0))){
//                    secondIndex = index;
//                }
//
//            }
//            if(secondIndex == -1){
//                System.out.println("length count " + count.length);
//            }else{
//                System.out.println("second index " + secondIndex);
//            }
            int ans = 0;
            for(int index = 0; index < count.length; index++){
                if(firstIndex < 0 && count[index] == 1){
                    firstIndex  = index;
                } else if(secondIndex < 0 && (count[index] == 0 || count[index] == 1)){
                    secondIndex = index;
                }
                if(secondIndex < 0 && count[index] >= 1 ){
                    ans = index;
                }
            }
            if(secondIndex < 0){
                System.out.println(ans + 1);
            }else{
                System.out.println(secondIndex);
            }





        }
    }
}
