package cw_hw_12;

/**
 * task 5.2
 * @author Pisnia Mariia
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task12_5_2 {
    public static void main(String[] args) {
        String filePath = "/home/maria_pi/Uni/3_1/java/CHW/cw_hw_12/input.txt";

        try {
            int emptyLinesCount = countEmptyLines(filePath);
            System.out.println("Empty lines: " + emptyLinesCount);

            int maxLineLength = getMaxLineLength(filePath);
            System.out.println("Max line length: " + maxLineLength);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countEmptyLines(String filePath) throws IOException {
        int emptyLinesCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    emptyLinesCount++;
                }
            }
        }

        return emptyLinesCount;
    }

    private static int getMaxLineLength(String filePath) throws IOException {
        int maxLineLength = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int lineLength = line.length();
                if (lineLength > maxLineLength) {
                    maxLineLength = lineLength;
                }
            }
        }

        return maxLineLength;
    }
}