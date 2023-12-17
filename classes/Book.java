package classes;

/*
 * class Book
 * project №16 - Library catalog
 * @author Pisnia Mariia
 */

public class Book extends Resource {
    private String title;
    private String author;
    private String isbn;
    private int pageCount;

    public Book(String title, String author, String isbn, int pageCount) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    @Override
    public String toString() {
        return "Книга: " + title + ", Автор: " + author + ", ISBN: " + isbn + ", Сторінок: " + pageCount;
    }
}
