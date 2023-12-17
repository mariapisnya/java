package classes;

/*
 * class Vinyl
 * project №16 - Library catalog
 * @author Pisnia Mariia
 */

public class Vinyl extends Resource {
    private String title;
    private String artist;
    private String genre;
    private int trackCount;

    public Vinyl(String title, String artist, String genre, int trackCount) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.trackCount = trackCount;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getTrackCount() {
        return trackCount;
    }

    @Override
    public String toString() {
        return "Платівка: " + title + ", Виконавець: " + artist + ", Жанр: " + genre + ", Треків: " + trackCount;
    }
}