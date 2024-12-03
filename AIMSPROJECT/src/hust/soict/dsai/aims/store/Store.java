package hust.soict.dsai.aims.store;
import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;


public class Store {
    private ArrayList<Media> mediaList = new ArrayList<>();

    public void addMedia(Media media) {
        mediaList.add(media);
    }

    public void removeMedia(Media media) {
        mediaList.remove(media);
    }

    public Media search(String title) {
        for (Media media : mediaList) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return media; // Trả về media nếu tìm thấy
            }
        }
        return null; // Trả về null nếu không tìm thấy
    }

    public void print() {
        System.out.println("Danh sách media trong cửa hàng:");
        for (Media media : mediaList) {
            System.out.println(media.toString());
        }
    }
} 