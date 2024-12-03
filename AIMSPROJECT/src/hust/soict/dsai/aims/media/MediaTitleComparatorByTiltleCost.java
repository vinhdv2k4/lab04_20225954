package hust.soict.dsai.aims.media;

import java.util.Comparator;
public class MediaTitleComparatorByTiltleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int costCompare = Float.compare(m2.getCost(), m1.getCost());  // Sắp xếp giảm dần theo giá
        if (costCompare != 0) {
            return costCompare;
        } else {
             // Sắp xếp tăng dần theo tiêu đề nếu giá giống nhau
            return m1.getTitle().compareTo(m2.getTitle()); 
        }
    }
}

