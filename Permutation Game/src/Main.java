import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
           long[] firstLine = new long[4];
           for(int i =0; i < firstLine.length; i++){
               firstLine[i] = sc.nextInt();
           }
           long[] permuation = new long[(int)firstLine[0]];
           int[] arr = new int[(int)firstLine[0]];
           for( int i=0; i < permuation.length; i++){
               permuation[i] = sc.nextInt();
           }
            for( int i=0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            long maxOfBodya = 0;
            long maxOfSash = 0;
            long currentSumForBodya = 0;
            long currentSumForSasha = 0;
            int currPosOfBodya = (int)firstLine[2];
            int currPosOfSasha = (int)firstLine[3];
            for(long i =0; i < Math.min(firstLine[1] , 2*Math.pow(10 , 5)); i++){
                currentSumForBodya += arr[currPosOfBodya - 1];
                currentSumForSasha += arr[currPosOfSasha - 1];
                // current sum , maxSumWhenStays on current position and maxOfBodya
                maxOfBodya = Math.max(maxOfBodya , Math.max(currentSumForBodya , (currentSumForBodya) + (firstLine[1] - 1 - i)*arr[currPosOfBodya - 1]));
                maxOfSash = Math.max(maxOfSash , Math.max(currentSumForSasha , (currentSumForSasha) + (firstLine[1] - 1 - i)*arr[currPosOfSasha - 1]));
                currPosOfBodya = (int)permuation[currPosOfBodya - 1];
                currPosOfSasha= (int)permuation[currPosOfSasha - 1];
            }
            String result = maxOfSash > maxOfBodya ?"Sasha" : "Bodya";
            if(maxOfSash == maxOfBodya){
                result = "Draw";
            }
            System.out.println(result);



        }

    }
}