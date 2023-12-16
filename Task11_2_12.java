package cw_hw_11;

/**
 * task 2.12
 * @author Pisnia Mariia
 */


import java.util.Scanner;

public class Task11_2_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();

        if (isSymmetric(inputString)) {
            System.out.println("The string is symmetrical.");
        } else {
            System.out.println("The string is not symmetrical.");
        }

        scanner.close();
    }

    private static boolean isSymmetric(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
