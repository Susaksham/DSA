public class MaximumNumberOfAchievableRequest {
    public static void main(String[] args) {
        int[][] requests = {{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}};
        int n = 5;
        System.out.println(maximumRequests(requests.length-1 , requests));
    }
        public static int maximumRequests(int n, int[][] requests) {
            int[] arr = new int[n];
            return recurrsion(requests.length -1 , arr , requests);
        }
        public static int recurrsion(int length , int[] arr , int[][] requests){
            if(length == -1){
                for(int i=0; i < arr.length ; i++){

                    if(arr[i] != 0){
                        return Integer.MIN_VALUE;
                    }
                }
                return 0;
            }
            arr[requests[length][0]]--;
            arr[requests[length][1]]++;
            int take  = 1 + recurrsion(length -1 , arr , requests);
            arr[requests[length][0]]++;
            arr[requests[length][1]]--;
            int notTake = recurrsion(length - 1 , arr , requests);
            if(take == 0){
                take = -1;
                System.out.println(length);
            }
            return Math.max(take , notTake);
        }

}
