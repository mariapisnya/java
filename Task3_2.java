package cw_hw4;

import java.util.Random;

/**
 * task 3.2
 * @author Mariia Pisnia
 */

public class Task3_2 {
    public static void main(String args[]) {
        Random rand = new Random();

        // int nums[] = new int[25];
        // nums[0] = rand.nextInt(100);
        int num = rand.nextInt(100);
        System.out.println("First random number is: " + num);

        for (int i = 1; i < 25; i++) {
            int num1 = rand.nextInt(100);

            if (num1 > num)
                System.out.println(String.format("Random number %d is bigger than %d", num1, num));
            else if (num1 < num)
                System.out.println(String.format("Random number %d is less than %d", num1, num));
            else
                System.out.println(String.format("Random number %d is equal to %d", num1, num));

        }
    }
}
