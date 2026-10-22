package sortingGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class sortingString {
    public static void main(String[] args) {
        ArrayList<Song> songList = new ArrayList<>();
        songList.add(new Song("Take to my heart", "arigit sing", 2014));
        songList.add(new Song("close to my eye", "new kakkr", 2015));
        songList.add(new Song("close to my ear", "swati", 2017));
        songList.add(new Song("near with me", "pawan sing", 2014));
        songList.add(new Song("close to my retina", "ravi raj", 2018));

        Collections.sort(songList);
        System.out.println("After sorting: ");
        iterateList(songList);
    }

    private static void iterateList(ArrayList<Song> songList) {
        for (Song song : songList) {
            System.out.println(song);
        }
    }
}
