package com.company;

public class JavaArrayQuestion {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int[][] newArray = new int[matrix.length][matrix[0].length];
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
            newArray[i][j]=matrix[i][j];
            }
        }

                for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {

                if (matrix[i][j] == 0) {
                    for (int row = 0; row < newArray.length; row++) {
                        newArray[row][j] = 0;
                    }
                    for (int col = 0; col < newArray[0].length; col++) {
                        newArray[i][col] = 0;
                    }
                }
            }
        }
        for (int i = 0; i <= matrix.length - 1; i++) {
            for (int j = 0; j <= matrix[0].length - 1; j++) {
                System.out.print(newArray[i][j]+"  ");
            }

        }
        String text = "7496396288";






        if (text.length() <= 10) {
            text = text.substring(3, 6) + text.substring(2, 5);
            System.out.println(text);
        } else {
            System.out.println(text);
        }
        String ob="hello";
        ob="bye";
        System.out.println(ob);
    }
}
