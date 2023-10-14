package cw_hw3;

import java.util.Scanner;

/**
 * task 2.2
 * @author Mariia Pisnia
 */

public class Task2_2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("i = ");
        int i = scanner.nextInt();

        i <<= 1;
        while (i > 0)
        {
            i >>= 1;
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
