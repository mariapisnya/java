package cw_hw6;

import java.util.Scanner;

/**
 * task 2.2
 * @author Mariia Pisnia
 */

public class Task2_2 {
    public static void printMatrix(int[][] arr, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m = s.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int n = s.nextInt();
        System.out.print("Enter the number of shifts: ");
        int k = s.nextInt();

        int matrix[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("Input matrix[%d][%d] = ", i+1, j+1));
                matrix[i][j] = s.nextInt();
            }
        }

        System.out.println();
        printMatrix(matrix, m, n);
        System.out.println();

        int j = 0;
        while (j < m) {

            for (int i = k; i < m; i++)
                System.out.print(matrix[j][i] + " ");

            for (int i = 0; i < k; i++)
                System.out.print(matrix[j][i] + " ");

            System.out.println();
            j++;
        }
    }
}
