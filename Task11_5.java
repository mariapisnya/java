package cw_hw_11;

/**
 * task 1.5
 * @author Pisnia Mariia
 */

import java.util.Scanner;

public class Task11_5 {
    static public void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replace("small", "very small").replace("large", "very large");
        System.out.println(str);
    }
}
