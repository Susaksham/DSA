import java.util.HashMap;
import java.util.Scanner;

public class StoneAgeProblem {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] arr = new int[2];
        for(int i=0; i< arr.length; i++){
            arr[i] = sc.nextInt();

        }
        int n = arr[0];
        int q = arr[1];

        int intial[] = new int[n];
        long currAns = 0;
        for(int i=0; i < intial.length; i++){
            intial[i] = sc.nextInt();
            currAns+= intial[i];
        }

        HashMap<Integer , Integer> map = new HashMap<>();
        boolean isAllMarked = false;
        int allValueExchangedWith = -1;
        for(int i=0; i < q; i++){
            int queryType = sc.nextInt();
            if(queryType == 1){
                int pos = sc.nextInt();
                int value = sc.nextInt();
                if(isAllMarked){
                    if(map.containsKey(pos - 1)){
                        currAns += value - map.get(pos - 1);
                        map.put(pos -1  , value);
                        System.out.println(currAns);
                    } else{
                        currAns += value - allValueExchangedWith;
                        map.put(pos - 1 , value);
                        System.out.println(currAns);
                    }
                } else{
                    currAns += value - intial[pos - 1];
                    intial[pos - 1] = value;
                    System.out.println(currAns);
                }
            } else{
                int allValue = sc.nextInt();
                isAllMarked = true;
                currAns = (long)allValue*intial.length;
                allValueExchangedWith = allValue;
                System.out.println(currAns);
                map.clear();
            }
        }

    }
}
