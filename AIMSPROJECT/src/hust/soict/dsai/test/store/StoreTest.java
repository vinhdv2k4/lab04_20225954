package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.store.*;;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Action", 20.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Comedy", "John", 15.7f);

        store.addMedia(dvd1); 
        store.addMedia(dvd2); 
        store.removeMedia(dvd1); 
        store.removeMedia(dvd2); 
    }
} 