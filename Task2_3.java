package cw_hw3;

import java.util.Scanner;

/**
 * task 2.3
 * @author Mariia Pisnia
 */

public class Task2_3 {
    public static void main(String args[]) {
        char c1 = 'a';
        char c2 = 'b';

        String binaryString1 = Integer.toBinaryString(c1);
        String binaryString2 = Integer.toBinaryString(c2);

        System.out.println(c1 + ": " + binaryString1);
        System.out.println(c2 + ": " + binaryString2);

    }
}
