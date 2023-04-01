public class SearchIn2DarraythatIsSortedRowColumn {
    public static void main(String[] args) {
//    int[][] array=new int[][]{{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int[][] array=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    for(int i:searchIn2DarraythatIsSortedRowColumn(array,11))
        System.out.println(i);
    }
    static int[] searchIn2DarraythatIsSortedRowColumn(int[][] array,int target){
        int r=0;
        int c=array[0].length-1;
        // so r and c are is the index of that element which is larget in the row and smallest in the column
        while(r<=array.length-1  && c>=0){
           if(array[r][c]==target){
               return new int[]{r,c};
           }
           else if(array[r][c]>target){
               //if that element is larger than the target element it means that column does not contain  the target element
               // as that element is that smallest in the column and all other elements are bigger than that element
               c--;
           }
           else if(array[r][c]<target){
               r++;
           }
        }
        return new int[]{-1,-1};
    }
}
