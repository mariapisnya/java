package cw_hw2;

import java.util.Scanner;

/**
 * task 4.1.б
 * @author Mariia Pisnia
 */

public class Task4_1_b {
    public static float function(float x) {
        float a = x;
        float res = 1 + x;

        for (int j=0; j<3; j++) {
            x *= a;
            res += x;
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input x = ");

        float x = scanner.nextFloat();

        System.out.println("f(x) = x^4 + x^3 + x^2 + x + 1");
        System.out.println("f(" + x + ") = " + function(x));


    }
}
