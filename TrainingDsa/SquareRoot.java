public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(squareRoot(17));
    }

    // Binary search on the real number is same as on integer with problem like
    // precision
    //break off condition

    public static double squareRoot(int n){
            double start = 0;
            double end = n + 1;

            int times = 0;
            while( times < 100){
                double mid  = start + (end - start)/2;


                if(mid * mid  <= n){
                start = mid;

                } else{
                    end = mid;
                }
                times++;

            }
            return start;
    }
}
