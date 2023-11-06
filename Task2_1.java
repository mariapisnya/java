package cw_hw6;

import java.util.Arrays;
import java.util.Scanner;

/**
 * task 2.1
 * @author Mariia Pisnia
 */

public class Task2_1 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.print("Rows: ");
        int m = s.nextInt();
        System.out.print("Columns: ");
        int n = s.nextInt();

        int matrix[][] = new int[m][n];
        int arr[] = new int[n*m];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(String.format("Input matrix[%d][%d] = ", i+1, j+1));
                int e = s.nextInt();
                matrix[i][j] = e;
                arr[index] = e;
                index += 1;
            }
        }
        
        Arrays.sort(arr);
        index = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = arr[index];
                index += 1;
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
