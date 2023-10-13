package cw_hw2;
import java.util.Scanner;

/**
 * task 2.2
 * @author Mariia Pisnia
 */

public class Task2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

    
	    String new_a = String.valueOf(a);
		String new_b = String.valueOf(b);

		System.out.print("Кількість розрядів числа " + a + ": ");
		
		System.out.print(new_a.length() + ", ");
		System.out.println(Math.floor(Math.log10(a))+1);
		
		System.out.print("Кількість розрядів числа " + b + ": ");
		
		System.out.print(new_b.length() + ", ");
		System.out.println(Math.floor(Math.log10(b))+1);

		System.out.printf("Середнє гармонійне: %.2f \n", 2/((1.0/a)+(1.0/b)));
    }
}
