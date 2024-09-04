import java.util.Scanner;

public class ArrowPath {
    public static boolean isSafeZone(String firstRow, String secondRow , int row , int col){
        boolean safe2 = true;
        boolean safe1 = true;
        if(row == 0){
            if(firstRow.charAt(col + 1) != '>'){
                safe1 = false;
            }
            if(secondRow.charAt(col) != '>'){
                safe2 = false;
            }
        } else{
            if(firstRow.charAt(col) != '>'){
                safe1 = false;
            }
            if(secondRow.charAt(col + 1) != '>'){
                safe2 = false;
            }
        }
        return safe1 || safe2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while(testCases-- > 0){
            int n = sc.nextInt();
            String firstRow = sc.next();
            String secondRow = sc.next();
            boolean canReach = true;

            int row = 0, col = 0;
            while(row < 2 && col < n){
                if(col + 1  == firstRow.length() - 1 && row== 2){
                    break;
                } else if(col + 1 == firstRow.length() - 1 && row == 1){
                    canReach = false;
                    break;
                }
                if(isSafeZone(firstRow , secondRow , row , col)){

                }
            }
            if(canReach){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }

        }
    }
}
