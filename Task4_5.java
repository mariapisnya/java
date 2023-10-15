package cw_hw4;

import java.util.Scanner;

/**
 * task 4.5
 * @author Mariia Pisnia
 */

public class Task4_5 {
    static public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n = ");
        int n = scanner.nextInt();

        int counter = 0;

        for (int j = 1; j < 1000; j++) {
            String out;

            if (j < 10) {out = "   " + j;}
            else if (j >= 10 & j < 100) {out = "  " + j;}
            else {out = " " + j;}

            System.out.print(out);
            counter += 1;

            if (counter == n) {System.out.println(); counter = 0;}
        }
    }
}
