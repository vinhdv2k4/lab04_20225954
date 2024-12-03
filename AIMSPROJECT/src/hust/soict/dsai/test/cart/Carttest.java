package hust.soict.dsai.test.cart;
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.*;

public class Carttest { 
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin", "Animation", 18.99f);
        cart.addMedia(dvd3);
        cart.printCart();

        cart.searchById(1);
        cart.searchById(5);
        
        cart.searchByTitle("Star Wars");
        cart.searchByTitle("King");
        cart.searchByTitle("Wonder");
                
        cart.addMedia(new CompactDisc(1, "Book", "Fiction", 15.0f, "Artist1", 50));
        cart.addMedia(new CompactDisc(2, "CD", "Music", 10.0f, "Artist2", 30));
        cart.addMedia(new CompactDisc(3, "DVD", "Movies", 20.0f, "Artist3", 120));
        cart.addMedia(new CompactDisc(4, "Book", "Fiction", 20.0f, "Artist4", 70));
        
                // Sắp xếp theo tiêu đề rồi giá
                System.out.println("Sắp xếp theo tiêu đề rồi giá:");
                cart.sortByTitleCost();
                cart.printCart();
        
                // Sắp xếp theo giá rồi tiêu đề
                System.out.println("\nSắp xếp theo giá rồi tiêu đề:");
                cart.sortByCostTitle();
                cart.printCart();
           
        
            }
        }
        
    
