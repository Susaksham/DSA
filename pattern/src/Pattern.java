import java.util.Arrays;

public class Pattern {
    public static void main(String[] args) {
//        int[][] array2=pattern31a(4);
//        for (int i=0;i<array2.length;i++){
//            System.out.println(Arrays.toString(array2[i]));
//        }
        pattern31b(4);
    }
    static int[][] pattern31a(int n){
        int[][] array=new int[2*n-1][2*n-1];
        int rowStart=0;
        int rowEnd=array.length-1;
        int colStart=0;
        int colEnd=array[0].length-1;
        int value=n;
        while(rowStart<=rowEnd){
            for(int i=colStart;i<=colEnd;i++){
                array[rowStart][i]=value;

            }
            rowStart++;
            for(int j=rowStart;j<=rowEnd;j++){
                array[j][colEnd]=value;

            }
            colEnd--;
            for(int k=colEnd;k>=colStart;k--){
                array[rowEnd][k]=value;

            }
            rowEnd--;
            for(int l=rowEnd;l>=rowStart;l--){
                array[l][colStart]=value;

            }
            colStart++;
            value--;
        }
        return array;

    }
    static void pattern31b(int n){
        for(int i=0;i<2*n-1;i++){

            for(int j=0;j<2*n-1;j++){
                int col=n-Math.min(Math.min(j,2*n-2-j) , Math.min(i,2*n-2-i));
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        int row=1;
        int col=1;
        int value=1;
        while(row<=2*n-1){

            int numberOfSpaces=(2*n-1)-col;
            for(int j=1;j<=numberOfSpaces;j++){
                System.out.print(" ");
            }
//            for(int i=1;i<=col;i++){
//                System.out.print("* ");
//            }
            for(int i=value;i>=1;i--){
                System.out.print(i+" ");
            }
            for (int k = 2; k <=value ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
            if(row>=n){
                col=col-2;
                value--;
            }
            else{
                col+=2;
                value++;
            }

            row++;

        }
    }
    static void pattern30(int n){
        for(int i=1;i<=n;i++){
            int numberOfSpacing=n-i;
            for(int spacing=1;spacing<=numberOfSpacing;spacing++){
                System.out.print("  ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j+ " ");
            }
            for(int k=2;k<=i;k++){
                System.out.print(k +" ");
            }
            System.out.println();
        }
    }
    static void triangle(int n){
        for(int i=0;i<n;i++){//this is for the number of the rows
            int numberOfSpaces=n-i-1;
            for(int k=0;k<numberOfSpaces;k++){//this is for the number of spaces
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++ ){//this is for the number of the columns
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=0;i<n;i++){//this is for the number of the rows
            int numberOfSpaces=n-i-1;
            for(int k=0;k<numberOfSpaces;k++){//this is for the number of spaces
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++ ){//this is for the number of the columns
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern5a(int n){
        int row=1;
        int col=1;
        while(row<=2*n-1){

            for(int i=1;i<=col;i++){
                System.out.print("*");
            }
            System.out.println();
            if(row>=n){
                col--;
            }
            else{
                col++;
            }

            row++;

        }
    }
    static void pattern28(int n){
        int row=1;
        int col=1;
        while(row<=2*n-1){
            int numberOfSpaces=n-col;
            for(int j=1;j<=numberOfSpaces;j++){
                System.out.print(" ");
            }
            for(int i=1;i<=col;i++){
                System.out.print("* ");
            }
            System.out.println();
            if(row>=n){
                col--;
            }
            else{
                col++;
            }

            row++;

        }
    }
    static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
