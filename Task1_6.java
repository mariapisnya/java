package cw_hw1;
import java.util.Scanner;

/**
 * task 1.6
 * @author Mariia Pisnia
 */

public class Task1_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("1'st argument: ");
        float arg1 = scanner.nextFloat();

        System.out.print("2'nd argument: ");
        float arg2 = scanner.nextFloat();

        System.out.println("Sum is equal to " + (arg1 + arg2));
}
}