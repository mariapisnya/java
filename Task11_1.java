package cw_hw_11;

/**
 * task 1.1
 * @author Pisnia Mariia
 */


public class Task11_1 {
    
    public static void main(String[] args) {
        String text;

        if (args.length > 0) {
            text = String.join(" ", args);
        } else {
            text = "Ква́нтова меха́ніка — основоположна фізична теорія, що в описі мікроскопічних обєктів розширює, уточнює і поєднує результати класичної механіки і класичної електродинаміки.";
        }

        int wordCount = countWords(text);
        System.out.println("Кількість слів в тексті: " + wordCount);
    }

    private static int countWords(String text) {
        String[] words = text.split(" ");

        return words.length;
    }
}
