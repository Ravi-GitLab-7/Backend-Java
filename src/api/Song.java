package api;

/**
 * API-facing Song type used by sorting utilities.
 */
public class Song extends sortingGenerics.Song {

    public Song(String title, String artist, int year) {
        super(title, artist, year);
    }
}
