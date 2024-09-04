import java.util.Scanner;

public class InhabitantOfTheDeepSea {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();
        while(testCases-- > 0){
            long[] inputArr = new long[2];
             inputArr[0] = sc.nextLong();
             inputArr[1] = sc.nextLong();
             int n = (int)inputArr[0];
             long k = inputArr[1];
            long[] shipsDurability = new long[n];
            long totalShipsDurabilty = 0;
            for(int i=0; i < shipsDurability.length; i++){
                shipsDurability[i] = sc.nextLong();
                totalShipsDurabilty += shipsDurability[i];
            }
            if(k >= totalShipsDurabilty){
                System.out.println(shipsDurability.length);
                continue;
            }
            long left = k%2 ==0 ? k/2 : k/2+1;
            long right = k/2;
            int leftIndex = 0;
            int rightIndex = shipsDurability.length - 1;
            while(leftIndex < shipsDurability.length){
                if(shipsDurability[leftIndex] <=left){
                    left = left - shipsDurability[leftIndex];
                } else{
                    break;
                }

                leftIndex++;
            }
            while(rightIndex >= 0){
                if(shipsDurability[rightIndex] <=right){
                    right = right - shipsDurability[rightIndex];
                } else{
                    break;
                }
                rightIndex--;
            }
            System.out.println(shipsDurability.length - (rightIndex - leftIndex + 1));
        }
    }
}
