package cw_hw2;
import java.util.Scanner;

/**
 * task 2.3
 * @author Mariia Pisnia
 */

public class Task2_3 {
    public static void main(String args[])
	{
        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("[\\s,]+");
        System.out.print("Введіть два числа: ");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println(Math.sqrt(num1*num2));
    }
}
