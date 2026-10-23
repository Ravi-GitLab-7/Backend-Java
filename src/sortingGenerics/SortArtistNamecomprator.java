package sortingGenerics;

import java.util.Comparator;
import api.Song;
public class SortArtistNamecomprator implements Comparator<Song> {


    @Override
    public int compare(Song song1, Song song2) {
        return -song1.getArtist().compareTo(song2.getArtist());
    }
}
