package cw_hw5;

import java.util.*;

/**
 * task 1.4
 * @author Mariia Pisnia
 */

public class Task1_4 {
    public static int numbers(Map<Integer, Integer> dict, int num) {
        if (dict.get(num) != null)
            return 1;
        else
            return 0;
    }
    public static void main(String args[]) {
        Map <Integer, Integer> dict = new Hashtable<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість чисел: ");
        int n = scanner.nextInt();
        int prev = 0;

        System.out.print("Введіть елементи: ");

        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();

            if (numbers(dict, num) == 1) {
                if (num == prev)
                    dict.put(num, dict.get(num) + 1);
            }
            else
                dict.put(num, 1);

            prev = num;
        }

        int max_len = 0;
        int max_value = 0;

        for (int e: dict.keySet()) {
            if (dict.get(e) > max_len) {
                max_len = dict.get(e);
                max_value = e;
            }
        }

        System.out.println("Найбільший результат: " + max_len + " підряд числа " + max_value);
    }
}
