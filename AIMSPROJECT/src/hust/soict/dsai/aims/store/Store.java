package hust.soict.dsai.aims.store;
import java.util.ArrayList;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;


public class Store {
    private static final int MAX_STORED_MEDIA = 20;     
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public void addDVD(DigitalVideoDisc disc) {
            if (itemsInStore.size() < MAX_STORED_MEDIA) {
                itemsInStore.add(disc);
                System.out.println("DVD has been added to the store.");
        
            }
        else{
        System.out.println("The store is full, cannot add more DVDs.");
    }
}
    public void removeDVD(DigitalVideoDisc disc) {
            if (itemsInStore.contains(disc)) {
                itemsInStore.remove(disc);
                System.out.println("DVD has been removed from the store."); 
            }
            else{
                System.out.println("DVD not found in the store ");
            }
        
} 
}