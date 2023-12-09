package hw_5;

/**
 * task 1.16
 * @author Pisnia Mariia
 */

 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.Scanner;
 

public class Task1_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитування послідовності чисел
        System.out.print("Введіть послідовність чисел через пробіл: ");
        String input = scanner.nextLine();
        String[] numbersStr = input.split(" ");

        List<Integer> sequence = new ArrayList<>();

        for (String numStr : numbersStr) {
            int num = Integer.parseInt(numStr);
            sequence.add(num);
        }

        // Обробка послідовності та виведення результату
        List<Integer> result = simplifySequence(sequence);
        System.out.println("Результат: " + result);
    }

    private static List<Integer> simplifySequence(List<Integer> sequence) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int num : sequence) {
            if (countMap.containsKey(num)) {
                int count = countMap.get(num);
                countMap.put(num, count + 1);
            } else {
                result.add(num+1);
                countMap.put(num, 1);
            }
        }

        return result;
    }
}

