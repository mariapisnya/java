package cw_hw4;

import java.util.Scanner;

/**
 * task 3.11
 * @author Mariia Pisnia
 */

public class Task3_11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        scanner.useDelimiter("[\\s,]+");
        System.out.print("Enter the coordinates of the lower left corner of the first square: ");

        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter the coordinates of the upper right corner of the first square: ");

        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        //                              x1y2   x2y2  
        // first square coordinates is  x1y1   x2y1

        System.out.print("Enter the coordinates of the lower left corner of the second square: ");

        int x3 = scanner.nextInt();
        int y3 = scanner.nextInt();

        System.out.print("Enter the coordinates of the upper right corner of the second square: ");

        int x4 = scanner.nextInt();
        int y4 = scanner.nextInt();

        //                              x3y4   x4y4  
        // first square coordinates is  x3y3   x4y3


        if (x3 < x1) {
            int add1 = x1; int add2 = y1; 
            int add3 = x2; int add4 = y2;

            x1 = x3; y1 = y3;
            x2 = x4; y2 = y4;

            x3 = add1; y3 = add2;
            x4 = add3; y4 = add4;
    
        }
        

        if (x2 == x3 | y2 == y3 | y1 == y4 | x3-x2 > 0 | y3 > y2 | y1 > y4) {System.out.println("The squares do not intersect");}
        else {
        
            // rectangle coordinates 

            int xl; int yl;
            int xr; int yr;

            if (y3 > y1 & y3 < y2) {

                xl = x3; 
                yl = y3;

                if (x4 < x2) {xr = x4;}
                else         {xr = x2;}

                if (y4 < y2) {yr = y4;}
                else         {yr = y2;}

                System.out.println(String.format("Сoordinates of the intersection rectangle is: \n > lower left corner (%d, %d); \n > upper right corner (%d, %d);", xl, yl, xr, yr));


            } else if (y3 < y1 & y1 < y4) {

                xl = x1; 
                yl = y3;

                if (x4 < x2) {xr = x4;}
                else         {xr = x2;}

                if (y4 < y2) {yr = y4;}
                else         {yr = y2;}

                System.out.println(String.format("Сoordinates of the intersection rectangle is: \n > lower left corner (%d, %d); \n > upper right corner (%d, %d);", xl, yl, xr, yr));
            }

        }
    }
}
