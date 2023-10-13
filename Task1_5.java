package cw_hw1;
import java.util.Scanner;

/**
 * task 1.5
 * @author Mariia Pisnia
 */

public class Task1_5 {

    
    public static void main(String[] args) {

        // System.out.println("Result: " + args[0] + ", " + args[1] + ", " + args[2]);

        Scanner scanner = new Scanner(System.in);

        System.out.print("1'st argument: ");
        String arg1 = scanner.nextLine();

        System.out.print("2'nd argument: ");
        String arg2 = scanner.nextLine();

        System.out.print("3'rd argument: ");
        String arg3 = scanner.nextLine();

        System.out.println("Result: " + arg1 + ", " + arg2 + ", " + arg3);
    }
}
