package cw_hw3;

import java.util.Scanner;

/**
 * task 2.12
 * @author Mariia Pisnia
 */

public class Task2_12 {
    static int jBitTo0(int n, int j) {
        int j1 = 1 << j - 1; 
        return (n & ~j1) | ((0 << j - 1) & j1); }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        System.out.print("j = ");
        int j = scanner.nextInt();

        System.out.println(n + " in a binary form: " + Integer.toBinaryString(n));
        n = jBitTo0(n, j);
        System.out.println("Modyfied: " + Integer.toBinaryString(n));

        System.out.println("Decimal: " + n);
        System.out.println("Hexadecimal: " + Integer.toHexString(n));


    }
}
