package sortingGenerics;

import java.util.ArrayList;
import java.util.Collections;

public class mp4 {
    public static void main(String[] args) {
        // this list strore mmy song list

        Song song1 = new Song("Take to my heart","arigit sing",2014);
        Song song2 = new Song("close to my eye ","new kakkr",2015);
        Song song3 = new Song("close to my ear","swati ",2016);
        Song song4 = new Song("near with me ","pawan sing",2017);
        Song song5 = new Song("close to my retina","ravi raj",2018);

        ArrayList<Song> musicList = new ArrayList<>();
        musicList.add(song1);
        musicList.add(song2);
        musicList.add(song3);
        musicList.add(song4);
        musicList.add(song5);

        MyUtils.IterateList(musicList);
        Collections.sort(musicList);
    }
}
