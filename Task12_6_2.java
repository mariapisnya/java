package cw_hw_12;

/**
 * task 6.2
 * @author Pisnia Mariia
 */


import java.io.*;

public class Task12_6_2 {
    public static void main(String[] args) {
        String input = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/input.txt";
        String output = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/output6_2.txt";

        try {
            double product = 1.0;

            try (BufferedReader reader = new BufferedReader(new FileReader(input))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    double number = Double.parseDouble(line);
                    if (number != 0) {
                        product *= Math.abs(number);
                    }
                }
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(output))) {
                writer.write("Product of modules of real numbers: " + product);
            }

            System.out.println("The product of the moduli of real numbers has been successfully written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}