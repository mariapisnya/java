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
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int n = in.nextInt();
        System.out.print("Enter the number of shifts: ");
        int k = in.nextInt();

        int matrix[][] = new int[m][n];


        System.out.println("Input your matrix row by row: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

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
