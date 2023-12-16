package cw_hw_12;

/**
 * task 6.1
 * @author Pisnia Mariia
 */


import java.io.*;

public class Task12_6_1 {
    public static void main(String[] args) {
        String input = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/input.txt";
        String output = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/output6_1.txt";

        try {
            double sum = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    double number = Double.parseDouble(line);
                    sum += number;
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
                writer.write("The sum of real numbers: " + sum);
            }

            System.out.println("The sum of real numbers was successfully written to the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
