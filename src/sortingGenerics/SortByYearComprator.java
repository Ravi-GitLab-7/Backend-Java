package sortingGenerics;

import java.util.Comparator;
import api.Song;

public class SortByYearComprator implements Comparator<Song> {

    @Override
    public int compare(Song Song, Song anotherSong) {
        if (Song.getYear() < anotherSong.getYear()) {
            return -1;
        } else if (Song.getYear() > anotherSong.getYear()) {
            return +1;
        }
        return 0;
    }
}
