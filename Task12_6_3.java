package cw_hw_12;

/**
 * task 6.3
 * @author Pisnia Mariia
 */


import java.io.*;

public class Task12_6_3 {
    public static void main(String[] args) {
        String input = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/input.txt";
        String output = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/output6_3.txt";

        try {
            long product = 1;

            try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    int number = Integer.parseInt(line);
                    
                    // додаткова перевірка не рівності нулю через використання усіма файлами класної роботи одного файлу вхідних даних
                    // постановка задачі цього не вимагає 
                    
                    if (number % 2 == 0 && number != 0) { 
                        product *= number;
                    }
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
                writer.write("The product of even elements: " + product);
            }

            System.out.println("The product of even elements was successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}