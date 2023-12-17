package classes;
import java.util.HashMap;
import java.util.Map;

/*
 * class CatalogSystem class - using Book, Vinyl and MusicalInstrument classes
 * project №16 - Library catalog
 * @author Pisnia Mariia
 */

public class CatalogSystem {
    private Map<String, Book> books;
    private Map<String, Vinyl> vinyls;
    private Map<String, MusicalInstrument> instruments;

    public CatalogSystem() {
        this.books = new HashMap<>();
        this.vinyls = new HashMap<>();
        this.instruments = new HashMap<>();
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    public void addVinyl(Vinyl vinyl) {
        vinyls.put(vinyl.getTitle(), vinyl);
    }

    public void addInstrument(MusicalInstrument instrument) {
        instruments.put(instrument.getName(), instrument);
    }

    public Map<String, Book> getBooks() {
        return books;
    }

    public Map<String, Vinyl> getVinyls() {
        return vinyls;
    }

    public Map<String, MusicalInstrument> getInstruments() {
        return instruments;
    }
}