package ass2ima2022;

import java.util.Scanner;

public class Ass2_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            // for loop to check each row
            for (int j = 0; j < matrix[i].length; j++) {
                // for loop to check next element in one row 
                for (int k = 0; k < matrix[i].length - j - 1; k++) {
                    if (matrix[i][k] > matrix[i][k + 1]) {
                        // set temporary for left & middle sorts
                        int temp = matrix[i][k];
                        // set the temporary as the left & middle sort 
                        matrix[i][k] = matrix[i][k + 1];
                        matrix[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
