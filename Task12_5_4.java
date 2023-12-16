package cw_hw_12;

/**
 * homework
 * task 5.4
 * @author Pisnia Mariia
 */


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task12_5_4 {
    public static void main(String[] args) {
        String input = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/input5_4.txt";
        String output = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/output5_4.txt";

        processFile(input, output);
    }

    private static void processFile(String input, String output) {
        try (BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedWriter bw = new BufferedWriter(new FileWriter(output))) {

            bw.write("Text with 0 replaced with 1: \n");

            String line;
            while ((line = br.readLine()) != null) {
                String modifiedLine = line.replace("0", "1");
                bw.write(modifiedLine);
                bw.newLine();
            }

            bw.write("\nInverted text: \n");

            try (BufferedReader newBr = new BufferedReader(new FileReader(input))) {
                while ((line = newBr.readLine()) != null) {
                    String invertedLine = new StringBuilder(line).reverse().toString();
                    bw.write(invertedLine);
                    bw.newLine();
                }
            }
            
            
            System.out.println("Operations completed. Result saved in the file.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
