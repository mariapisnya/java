package hw_5;
import java.util.Scanner;

/**
 * task 1.11
 * @author Pisnia Mariia
 */


public class Task1_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість об'єктів: ");
        int numObjects = scanner.nextInt();

        double[][] coordinates = new double[numObjects][2];
        double[] masses = new double[numObjects];

        for (int i = 0; i < numObjects; i++) {
            System.out.print("Введіть координати (x y) для об'єкта " + (i + 1) + ": ");
            coordinates[i][0] = scanner.nextDouble();
            coordinates[i][1] = scanner.nextDouble();

            System.out.print("Введіть масу об'єкта " + (i + 1) + ": ");
            masses[i] = scanner.nextDouble();
        }

        double totalMass = 0.0;
        double centroidX = 0.0;
        double centroidY = 0.0;

        for (int i = 0; i < numObjects; i++) {
            double mass = masses[i];
            totalMass += mass;

            centroidX += coordinates[i][0] * mass;
            centroidY += coordinates[i][1] * mass;
        }

        centroidX /= totalMass;
        centroidY /= totalMass;

        System.out.println("Центроїд: (" + centroidX + ", " + centroidY + ")");
    }
}