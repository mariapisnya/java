package cw_hw_11;

/**
 * task 2.36 --> Рядки 2 №4
 * @author Pisnia Mariia
 */

 
import java.util.Scanner;

public class Task11_2_36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input string: ");
        String inputString = scanner.nextLine();

        int plusCount = countOccurrences(inputString, '+');
        int minusCount = countOccurrences(inputString, '-');
        int asteriskCount = countOccurrences(inputString, '*');

        System.out.println("Number of '+' symbol: " + plusCount);
        System.out.println("Number of '-' symbol: " + minusCount);
        System.out.println("Number of '*' symbol: " + asteriskCount);

        scanner.close();
    }

    private static int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}