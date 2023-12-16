package cw_hw_11;

/**
 * task 1.4
 * @author Pisnia Mariia
 */


import java.util.Scanner;

public class Task11_4 {
    static public void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine().replace("an ", "").replace("a ", "");
        System.out.println(str);
    }
}
