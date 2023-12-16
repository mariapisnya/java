package cw_hw_10;

/**
 * task 8.1 - main
 * @author Pisnia Mariia
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SqrtEquation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input a coefficient: ");
        float a = in.nextFloat();
        System.out.print("Input b coefficient: ");
        float b = in.nextFloat();
        System.out.print("Input c coefficient: ");
        float c = in.nextFloat();

        try {
            if (a == 0) {
                throw new ArithmeticException("This is linear equation, not square, and root is: x = " + (-(c/b)));}


            double D = Math.pow(b, 2) - 4*a*c;

            if (D < 0)
                throw new EquationException("");

            double D_sqrt = Math.sqrt(D);
            double x1 = (-b + D_sqrt)/2*a;
            double x2 = (-b - D_sqrt)/2*a;

            System.out.println("Roots: x1 = " + x1 + " x2 = " + x2);

        }catch (EquationException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
