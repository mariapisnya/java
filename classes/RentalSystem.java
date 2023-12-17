package classes;
import java.util.HashMap;
import java.util.Map;

/*
 * class RentalSystem class - using Book, Vinyl and MusicalInstrument classes
 * project №16 - Library catalog
 * @author Pisnia Mariia
 */

public class RentalSystem {
    private Map<String, Boolean> rentedBooks;
    private Map<String, Boolean> rentedVinyls;
    private Map<String, Boolean> rentedInstruments;

    public RentalSystem() {
        this.rentedBooks = new HashMap<>();
        this.rentedVinyls = new HashMap<>();
        this.rentedInstruments = new HashMap<>();
    }

    public void rentBook(String title) {
        rentedBooks.put(title, true);
    }

    public void returnBook(String title) {
        rentedBooks.put(title, false);
    }

    public boolean isBookRented(String title) {
        return rentedBooks.getOrDefault(title, false);
    }

    public void rentVinyl(String title) {
        rentedVinyls.put(title, true);
    }

    public void returnVinyl(String title) {
        rentedVinyls.put(title, false);
    }

    public boolean isVinylRented(String title) {
        return rentedVinyls.getOrDefault(title, false);
    }

    public void rentInstrument(String name) {
        rentedInstruments.put(name, true);
    }

    public void returnInstrument(String name) {
        rentedInstruments.put(name, false);
    }

    public boolean isInstrumentRented(String name) {
        return rentedInstruments.getOrDefault(name, false);
    }
}