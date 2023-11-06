package cw_hw6;

import java.util.Scanner;

/**
 * task 2.4
 * @author Mariia Pisnia
 */


public class Task2_4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int n = in.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Input ypur matrix row by row: ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            int s = 0;
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > 0)
                    s += matrix[i][j];
                else
                    s = 0;
            }
            System.out.println("Sum in " + (i + 1) + " row is: " + s);
        }

    }
}