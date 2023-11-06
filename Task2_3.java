package cw_hw6;


import java.util.Scanner;

/**
 * task 2.3
 * @author Mariia Pisnia
 */


public class Task2_3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows of the matrix: ");
        int m = in.nextInt();
        System.out.print("Enter the number of columns of the matrix: ");
        int n = in.nextInt();

        int matrix[][] = new int[m][n];

        System.out.println("Input your matrix row by row: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (matrix[i][j] < matrix[i][j+1])
                    count += 1;
                else {
                    count = 0;
                }
            }
        }

        System.out.println("The most numbers increase: " + count + 2);
    }
}