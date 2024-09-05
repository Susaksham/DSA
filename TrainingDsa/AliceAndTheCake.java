import java.util.*;

public class AliceAndTheCake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCasess = sc.nextInt();
        while(testCasess > 0){

            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i < n; i++){
                arr[i] = sc.nextInt();
            }
            cakes(arr);
            testCasess--;
        }
    }
    public static boolean cakes(int[] arr) {
        int totalCake = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            totalCake += arr[i];
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        Queue<Integer> q = new ArrayDeque<>();
        q.offer(totalCake);
        int divide = 0;
        while (divide < arr.length - 1 && !q.isEmpty()) {
            if (!q.isEmpty() && map.get(q.peek()) >= 1) {
                map.put(arr[q.peek()], map.get(q.peek()) - 1);
                q.remove();
            } else if (!q.isEmpty()) {
                q.offer((int) Math.ceil(q.peek() / 2));
                q.offer((int) Math.floor(q.peek() / 2));
                divide++;
            }

        }

        return true;

    }
}
