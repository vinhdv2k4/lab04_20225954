package hust.soict.dsai.test.store;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.*;;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Movie 1", "Action", 20.0f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Movie 2", "Comedy", "John", 15.7f);

        store.addDVD(dvd1); 
        store.addDVD(dvd2); 
        store.removeDVD(dvd1); 
        store.removeDVD(dvd2); 
    }
} 