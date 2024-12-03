package hust.soict.dsai.test.media;
import hust.soict.dsai.aims.media.*;
import java.util.ArrayList;
import java.util.Arrays;
public class MediaTest {
    public static void main(String[] args) {
        ArrayList<Media> mediaList = new ArrayList<>();
        mediaList.add(new DigitalVideoDisc("Inception", "Science Fiction", "Christopher Nolan", 148, 19.99f));
        mediaList.add(new CompactDisc(1, "Greatest Hits", "Music", 14.99f, "Various Artists", 60));
        mediaList.add(new Book(1, "Effective Java", "Programming", 45.00f, Arrays.asList("Joshua Bloch"))); 
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
}