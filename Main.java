import java.util.Scanner;
import classes.LibraryManagementSystem;

/*
 * project №16 - Library catalog
 * @author Pisnia Mariia
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LibraryManagementSystem librarySystem = new LibraryManagementSystem();

        librarySystem.populateCatalogFromCSV("resourses/books.csv", "Book");
        librarySystem.populateCatalogFromCSV("resourses/vinyls.csv", "Vinyl");
        librarySystem.populateCatalogFromCSV("resourses/instruments.csv", "MusicalInstrument");

        while (true) {
            System.out.println("Виберіть категорію (1 - Книга, 2 - Платівка, 3 - Інструмент, 0 - Вийти): ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Дякую за користування! До побачення!");
                break;
            }

            switch (choice) {
                case 1:
                    handleResource(librarySystem, "книги", scanner);
                    break;
                case 2:
                    handleResource(librarySystem, "платівки", scanner);
                    break;
                case 3:
                    handleResource(librarySystem, "інструменту", scanner);
                    break;
                default:
                    System.out.println("Некоректний вибір. Спробуйте ще раз.");
            }
        }
    }

    private static void handleResource(LibraryManagementSystem librarySystem, String resourceType, Scanner scanner) {
        System.out.println("Введіть назву " + resourceType + ": ");
        String title = scanner.next();

        if (librarySystem.isResourceAvailable(resourceType, title)) {
            System.out.println("Ресурс доступний.");
            System.out.println("Детальна інформація: ");
            String ResourceInfo = librarySystem.getResourceInfo(resourceType, title);
            System.out.println(ResourceInfo);


            System.out.println("Бажаєте забронювати? (1 - Так, 0 - Ні): ");
            int reserveChoice = scanner.nextInt();

            if (reserveChoice == 1) {
                librarySystem.reserveResource(resourceType, title);
                System.out.println("Ресурс заброньований!");
            } else {
                System.out.println("Дякую за візит!");
            }
        } else {
            System.out.println("Ресурс недоступний, вже заброньований або не існує в базі.");
        }
    }
}