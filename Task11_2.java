package cw_hw_11;

/**
 * task 1.2
 * @author Pisnia Mariia
 */


public class Task11_2 {

    public static void main(String[] args) {
        String text;

        if (args.length > 0) {
            text = String.join(" ", args);
        } else {
            text = "Ква́нтова меха́ніка — основоположна фізична теорія, що в описі мікроскопічних обєктів розширює, уточнює і поєднує результати класичної механіки і класичної електродинаміки.";
        }

        String reversedText = reverseText(text);
        System.out.println("Обернений текст: " + reversedText);
    }

    // функція, що перевертає текст посимвольно 

    private static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // //  функція, що перевертає текст послівно

    // private static String reverseText(String sentence) {
    //     String[] words = sentence.split(" ");

    //     StringBuilder reversedSentence = new StringBuilder();
    //     for (int i = words.length - 1; i >= 0; i--) {
    //         reversedSentence.append(words[i]).append(" ");
    //     }

    //     return reversedSentence.toString().trim();
    // }
}
