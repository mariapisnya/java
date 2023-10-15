package cw_hw4;

import java.util.Random;

/**
 * task 3.6
 * @author Mariia Pisnia
 */

public class Task3_6 {
    static int task3_6() {
        int Alice = 0;
        int Bob = 0;

        int prev = -1;
        int curr = -1;

        Random rand = new Random();

        do {
            prev = curr;
            curr = rand.nextInt(2);
            Alice++;
        } while (prev != 0 || curr != 0);

        curr = -1;

        do {
            prev = curr;
            curr = rand.nextInt(2);
            Bob++;

        } while (prev != 0 || curr != 1);

         return ((Alice<Bob) ? 1:0);
    }

    public static void main(String args[]) {

        final int experiments = 1000;
        int count = 0;
        for (int i = 0; i < experiments; i++) {
            count += task3_6();
        }

        System.out.println("The result is: " + (float) count/experiments);
        System.out.println("The difference with the expected result: " + (39.0/121 - (float) count/experiments));

    }
}
