package sortingGenerics;

import api.Song;
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


        // use comprator => own logic
        SortByYearComprator sortByYearComprator = new SortByYearComprator();
        Collections.sort(songList,  sortByYearComprator);

//        // when written in one sytance of above method
//        Collections.sort(songList, new SortByYearComprator());

        System.out.println("Songs sorted by year:");
        iterateList(songList);

    }

    private static void iterateList(ArrayList<Song> songList) {
        for (Song song : songList) {
            System.out.println(song);
        }
    }
}
