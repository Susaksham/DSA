import java.util.*;

public class Scuza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int[] input = new int[2];
            input[0] = sc.nextInt();
            input[1] = sc.nextInt();
            int n = input[0];
            int q = input[1];
            int[] arr = new int[n];
            int[] questions = new int[q];
            for(int i=0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            for(int i=0; i < questions.length; i++){
                questions[i] = sc.nextInt();
            }
            ArrayList<Triple> list = new ArrayList<>();
            long sumTillNow = 0;
            for(int i=0; i < arr.length; i++){
                sumTillNow += arr[i];
                list.add(new Triple(arr[i] , i  , sumTillNow ));
            }
            Collections.sort(list , (d1 , d2) -> {
                return d1.stepSize - d2.stepSize;
            });
            for(int i=0; i < questions.length; i++){

            }

        }
    }


}
class Triple{

    public int stepSize;
    public int index;
    public long sum;

    Triple(int stepSize , int index , long sum){
        this.stepSize = stepSize;
        this.index = index;
        this.sum = sum;
    }
    public String toString(){
        return String.format("{ %d , %d , %d}" , this.stepSize , this.index , this.sum);
    }

}
