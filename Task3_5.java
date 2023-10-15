package cw_hw4;

/**
 * task 3.5
 * @author Mariia Pisnia
 */

public class Task3_5 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);

        if (a>e) {
            int add1 = e;
            e = a;
            a = add1;}

        if (b>c) {
            int add2 = c;
            c = b;
            b = add2;}

        if (a>b) {
            int add3 = b;
            b = a;
            a = add3;}

        if (d>e) {
            int add4 = e;
            e = d;
            d = add4;}

        if (b>d) {
            int add5 = d;
            d = b;
            b = add5;}

        if (c>d) {
            int add6 = d;
            d = c;
            c = add6;}

        if (b>c) {
            int add7 = c;
            c = b;
            b = add7;}

        System.out.println("Medaian is: " + c);

    }
}
