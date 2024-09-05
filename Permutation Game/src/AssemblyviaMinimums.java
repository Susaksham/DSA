import java.util.*;

public class AssemblyviaMinimums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();

        while(testCases -- > 0 ){
            int n = sc.nextInt();
            int[] input = new int[n];
            TreeMap<Integer , Integer> map = new TreeMap<Integer , Integer>();
            for(int i=0; i < input.length; i++){
                input[i] = sc.nextInt();
                map.put(input[i] , map.getOrDefault(input[i] , 0 ) + 1);
            }
            ArrayList<Integer> list =new ArrayList<>();

            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + "/" + entry.getValue());
            }



        }
    }
}
