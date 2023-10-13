package cw_hw2;
import java.util.Scanner;

/**
 * task 4.5
 * @author Mariia Pisnia
 */

public class Task4_5 {
    public static float distance(float x1, float y1, float x2, float y2) {
        return (float) Math.sqrt(Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] A = new float[2];
        float[] B = new float[2];
        float[] C = new float[2];

        System.out.print("First point coordinates: ");
        for (int i = 0; i < 2; i++) {
            A[i] = scanner.nextFloat();
        }

        System.out.print("Second point coordinates: ");
        for (int i = 0; i < 2; i++) {
            B[i] = scanner.nextFloat();
        }

        System.out.print("Third point coordinates: ");
        for (int i = 0; i < 2; i++) {
            C[i] = scanner.nextFloat();
        }

        float AB = distance(A[0], A[1], B[0], B[1]);
        float BC = distance(B[0], B[1], C[0], C[1]);
        float CA = distance(C[0], C[1], A[0], A[1]);

        float p = (float) (AB+BC+CA)/2;
        float S = (float) Math.sqrt(p*(p-AB)*(p-BC)*(p-CA));

        System.out.println("The square of given triangle is S = " + S);
    }
}
