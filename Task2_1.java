package cw_hw2;
import java.util.Scanner;

/**
 * task 2.1
 * @author Mariia Pisnia
 */

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть прізвище: ");
        String surname = scanner.nextLine();

        System.out.println("Привіт, " + surname);
    }
}
