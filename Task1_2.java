package cw_hw5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * task 1.2
 * @author Mariia Pisnia
 */

public class Task1_2 {
    public static void main(String args[]) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.print("Your number (input 0 as soon, as you want to stop): ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int min = n;
        int max = n;

        while (n != 0) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }

            num.add(n);

            System.out.print("Your number (input 0 as soon, as you want to stop): ");
            n = scanner.nextInt();
        }

        System.out.println(String.format("Minimum: %d, Maximum: %d", min, max));
    }
}
