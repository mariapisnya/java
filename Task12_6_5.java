package cw_hw_12;

/**
 * homework
 * task 6.5
 * @author Pisnia Mariia
 */


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task12_6_5 {

    public static void main(String[] args) {
        String input = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/input6_5.txt";
        String output = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/output6_5.txt";
        int n = 5;

        try {
            processFile(input, output, n);
            System.out.println("Operations completed. Result saved in the file.");
        } catch (IOException e) {
            System.err.println("Error during file processing: " + e.getMessage());
        }
    }

    private static void processFile(String input, String output, int n) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(input));
             FileWriter writer = new FileWriter(output)) {

            List<Integer> currentGroup = new ArrayList<>();

            String line;
            while ((line = reader.readLine()) != null) {
                int number = Integer.parseInt(line.trim());
                currentGroup.add(number);

                if (currentGroup.size() == n) {
                    int maxInGroup = Collections.max(currentGroup);
                    writer.write(maxInGroup + "\n");
                    currentGroup.clear();
                }
            }

            if (!currentGroup.isEmpty()) {
                int maxInGroup = Collections.max(currentGroup);
                writer.write(maxInGroup + "\n");
            }
        }
    }
}
