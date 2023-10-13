package cw_hw2;

import java.lang.Math;
import java.util.Scanner;

/**
 * task 3.13
 * @author Mariia Pisnia
 */

public class Task3_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x = ");

        float x = scanner.nextFloat();

        System.out.println(String.format("%20.4f", (Math.pow(x, 8))));


    }
}
