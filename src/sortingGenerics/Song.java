package sortingGenerics;

public class Song implements Comparable<Song> {
    private String title;
    private String artist;
    private Integer year;

    public Song(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist="
                + artist + ", year=" + year + '}';
    }
            // use comparaTo method
    @Override
    public int compareTo(Song anotherSong) {
//        // in this have this is denote like current string and it compare with another string
//        return this.getYear().compareTo(anotherSong.getYear());

        // now don't use integer class compareTo(). implement our logic
//        if (this.getYear() > anotherSong.getYear()){
//            return +1;
//        }
//        else if (this.getYear() < anotherSong.getYear()){
//            return -1;
//        }

        // sort with title intead of integer
//        if (this.getYear() > anotherSong.getYear()){
//            return +1;
//        }
//        else if (this.getYear() < anotherSong.getYear()){
//            return -1;
//        }

        return -this.getTitle().compareTo(anotherSong.getTitle()); // - means means decreasing


        // now we have to use comperator method -> this is used own logic sorting
    }
}
