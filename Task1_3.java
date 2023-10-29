package cw_hw5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * task 1.3
 * @author Mariia Pisnia
 */

public class Task1_3 {
    public static void printArr(ArrayList<Integer> num) {
        System.out.print("[");
        for (int i = 0; i < num.size(); i++) {
            if (i == (num.size() - 1))
                System.out.print(num.get(i) + "");
            else
                System.out.print(num.get(i) + ", ");
        }
        System.out.println("]");
    }

    public static void MeanStd(ArrayList<Integer> num) {
        int mean = 0;
        int std = 0;

        for(int i = 0; i < num.size(); i++) {
            mean += num.get(i);
        }
        mean = mean / num.size();
        for(int i = 0; i < num.size(); i++) {
            std += Math.pow(num.get(i) - mean, 2);
        }
        std = std / num.size();
        System.out.println("Середнє: " + mean + "; Відхилення: " + std);
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.print("Введіть кількість елементів: ");
        int n = scanner.nextInt();

        System.out.print("Введіть елементи: ");

        for (int i = 0; i < n; i++) {
            int num_i = scanner.nextInt();
            num.add(num_i);
        }

        printArr(num);
        MeanStd(num);
    }
}
