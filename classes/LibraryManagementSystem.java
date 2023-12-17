package classes;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * class LibraryManagementSystem - main class, using RentalSystem and CatalogSystem classes
 * project №16 - Library catalog
 * @author Pisnia Mariia
 */

public class LibraryManagementSystem {
    private CatalogSystem catalogSystem;
    private RentalSystem rentalSystem;

    public LibraryManagementSystem() {
        this.catalogSystem = new CatalogSystem();
        this.rentalSystem = new RentalSystem();
    }

    public void populateCatalogFromCSV(String filePath, String resourceType) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                switch (resourceType) {
                    case "Book":
                        catalogSystem.addBook(new Book(data[0], data[1], data[2], Integer.parseInt(data[3])));
                        break;
                    case "Vinyl":
                        catalogSystem.addVinyl(new Vinyl(data[0], data[1], data[2], Integer.parseInt(data[3])));
                        break;
                    case "MusicalInstrument":
                        catalogSystem.addInstrument(new MusicalInstrument(data[0], Double.parseDouble(data[1]), data[2], data[3]));
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isResourceAvailable(String resourceType, String title) {
        switch (resourceType) {
            case "книги":
                return catalogSystem.getBooks().containsKey(title) && !rentalSystem.isBookRented(title);
            case "платівки":
                return catalogSystem.getVinyls().containsKey(title) && !rentalSystem.isVinylRented(title);
            case "інструменту":
                return catalogSystem.getInstruments().containsKey(title) && !rentalSystem.isInstrumentRented(title);
            default:
                return false;
        }
    }

    public String getResourceInfo(String resourceType, String title) {
        switch (resourceType) {
            case "книги":
                Book book = catalogSystem.getBooks().get(title);
                return book != null ? book.toString() : "Книга не знайдена";
            case "платівки":
                Vinyl vinyl = catalogSystem.getVinyls().get(title);
                return vinyl != null ? vinyl.toString() : "Платівка не знайдена";
            case "інструменту":
                MusicalInstrument instrument = catalogSystem.getInstruments().get(title);
                return instrument != null ? instrument.toString() : "Інструмент не знайдений";
            default:
                return "Невірний тип ресурсу";
        }
    }

    public void reserveResource(String resourceType, String title) {
        switch (resourceType) {
            case "книги":
                rentalSystem.rentBook(title);
                break;
            case "платівки":
                rentalSystem.rentVinyl(title);
                break;
            case "інструменту":
                rentalSystem.rentInstrument(title);
                break;
        }
    }
}