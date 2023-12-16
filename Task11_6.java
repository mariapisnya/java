package cw_hw_11;

/**
 * task 1.6
 * @author Pisnia Mariia
 */

 import java.util.Scanner;

public class Task11_6 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        StringBuffer str = new StringBuffer(s.nextLine());
        String add = " :: that we use to ilustrate the methods of class StringBuffer";
        str.append(add);
        System.out.println(str);
    }
}
