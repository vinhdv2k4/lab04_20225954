package hust.soict.dsai.aims.Aims;
import java.util.ArrayList;
import java.util.Scanner;
import hust.soict.dsai.aims.media.*;
import hust.soict.dsai.aims.cart.*;
import hust.soict.dsai.aims.store.*;


public class Aims {
    private static Scanner scanner = new Scanner(System.in);
    private static int option;
    protected  static Cart anOrder = new Cart();
    private static Store store = new Store();
    public static void main(String[] args) {
        addData();
        handleShowMenu();
      
    }
    public static void addData() {
        Track track1 = new Track("track1", 1);
        Track track2 = new Track("track2", 2);
        Track track3 = new Track("track 3", 3);
        ArrayList<String> authors = new ArrayList<>();
        DigitalVideoDisc dvd1 =
                new DigitalVideoDisc("The Lion King", "animation",
                        "Roger Allers", 87, 19.95f);
        CompactDisc cd =
                new CompactDisc(2,"Star wars", "Science Fiction",  24.95f, "George Lucas" , 1000);
        Book book =
                new Book(3,"Dragon Ball", "Action",18.99f, authors );
        DigitalVideoDisc dvd2 =
                new DigitalVideoDisc("Jungle", "Adventure", "John Doe", 120, 15.99f);
        DigitalVideoDisc dvd3 =
                new DigitalVideoDisc("Cinderella");
        cd.addTrack(track1);
        cd.addTrack(track2);
        cd.addTrack(track3);
        book.addAuthor("Akira toriyama");
        store.addMedia(dvd1);
        store.addMedia(dvd2);
        store.addMedia(dvd3);
        store.addMedia(cd);
        store.addMedia(book);
    }
    public static int optionReturn(int a, int b){
        do{
            option =scanner.nextInt();
            scanner.nextLine();
        }
        while(option<a | option>b);
        return option;
    }
    public static void showMenu(){
        System.out.println("AIMS: ");
        System.out.println("-----------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void handleShowMenu() {
        while (true) {
            switch(optionReturn(0, 3)) {
                case 1: handleStoreMenu(); break;
                case 2: handleUpdateStore(); break;
                case 3: handleCartMenu(); break;
                default: return;
            
            }
        }
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void handleStoreMenu(){
        while(true){
            store.print();
            storeMenu();
            switch (optionReturn(0,4)){
                case 1: handleMediaDetailsMenu(); break;
                case 2: handleAddMediaToCart(); break;
                case 3: handlePlayMedia(); break;
                case 4: handleViewCart(); break;
                default: return;
            }
        }
    }
    public static void handleUpdateStore(){
        while(true){
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Add to store");
            System.out.println("2. Remove from store");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            switch (optionReturn(0,2)){
                case 1:
                    System.out.println("Options: ");
                    System.out.println("--------------------------------");
                    System.out.println("1. Add CD");
                    System.out.println("2. Add DVD");
                    System.out.println("3. Add Book");
                    System.out.println("0. Back");
                    System.out.println("--------------------------------");
                    System.out.println("Please choose a number: 0-1-2-3");
                    switch (optionReturn(0,3)){
                        case 1:
                            System.out.print("Enter CD's title: ");
                            String itemName = scanner.nextLine();
                            System.out.print("Enter CD's category: ");
                            String itemCategory = scanner.nextLine();
                            System.out.print("Enter CD's director: ");
                            String itemDirector = scanner.nextLine();
                            System.out.print("Enter CD's cost: ");
                            float itemCost = scanner.nextFloat();
                            System.out.print("Enter CD's length: ");
                            int  length = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter CD's artist: ");
                            String artist = scanner.nextLine();

                            CompactDisc cd = new CompactDisc(length, itemDirector, itemCategory, itemCost, artist, length);
                            System.out.print("Enter CD's number of tracks: ");
                            int itemTrackNumber = scanner.nextInt();
                            scanner.nextLine();
                            for(int i=0;i<itemTrackNumber;i++){
                                System.out.format("Enter track %d name: ",i+1);
                                String itemTrackName = scanner.nextLine();
                                System.out.format("Enter track %d length: ",i+1);
                                int itemTrackLength = scanner.nextInt();
                                scanner.nextLine();
                                Track track = new Track(itemTrackName,itemTrackLength);
                                cd.addTrack(track);
                            }
                            store.addMedia(cd);
                            break;
                        case 2:
                            System.out.print("Enter DVD's title: ");
                            itemName = scanner.nextLine();
                            System.out.print("Enter DVD's category: ");
                            itemCategory = scanner.nextLine();
                            System.out.print("Enter DVD's director: ");
                            itemDirector = scanner.nextLine();
                            System.out.print("Enter DVD's length: ");
                            int itemLength = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Enter DVD's cost: ");
                            itemCost = scanner.nextFloat();
                            DigitalVideoDisc dvd = new DigitalVideoDisc(itemName, itemCategory, itemDirector, itemLength, itemCost);
                            store.addMedia(dvd);
                            break;
                        case 3:
                            System.out.print("Enter Book's title: ");
                            itemName = scanner.nextLine();
                            System.out.print("Enter Book's category: ");
                            itemCategory = scanner.nextLine();
                            System.out.print("Enter Book's cost: ");
                            itemCost = scanner.nextFloat();
                            Book book = new Book( itemName, itemCategory, itemCost);
                            System.out.print("Enter media's number of authors: ");
                            int itemAuthorNumber = scanner.nextInt();
                            scanner.nextLine();
                            for(int i=0;i<itemAuthorNumber;i++){
                                System.out.format("Enter author %d name: ",i+1);
                                String itemAuthorName = scanner.nextLine();
                                book.addAuthor(itemAuthorName);
                            }
                            store.addMedia(book);
                            break;
                        default: break;
                    }
                    break;
                case 2:
                    System.out.println("Enter media's name: ");
                    String itemName = scanner.nextLine();
                    if(store.search(itemName)!=null){
                        Media item  = store.search(itemName);
                        store.removeMedia(item);
                    }
                    else{
                        System.out.println("Item doesn't exist. Cannot remove.");
                        return;
                    }
                    break;
                default: break;
            }
        }
    }
    public static void handleCartMenu(){
        anOrder.printCart();
        cartMenu();
        switch (optionReturn(0,5)){
            case 1:
                System.out.println("Options: ");
                System.out.println("--------------------------------");
                System.out.println("1. Filter by id");
                System.out.println("2. Filter by title");
                System.out.println("0. Back");
                System.out.println("--------------------------------");
                System.out.println("Please choose a number: 0-1-2");
                switch (optionReturn(0,2)){
                    case 1:
                        System.out.println("Enter media's id: ");
                        int itemId = scanner.nextInt();
                        scanner.nextLine();
                        if(anOrder.checkInCart(itemId)){
                            anOrder.searchById(itemId);
                        } else System.out.println("Item isn't in cart.");
                        break;
                    case 2:
                        System.out.println("Enter media's name: ");
                        String itemName = scanner.nextLine();
                        if(anOrder.checkInCart(itemName)){
                            anOrder.searchByTitle(itemName);
                        } else System.out.println("Item isn't in cart.");
                        break;
                    default: break;
                }
            case 2:
                System.out.println("Options: ");
                System.out.println("--------------------------------");
                System.out.println("1. Sort by title");
                System.out.println("2. Sort by cost");
                System.out.println("0. Back");
                System.out.println("--------------------------------");
                System.out.println("Please choose a number: 0-1-2");
                switch (optionReturn(0,2)){
                    case 1: anOrder.sortByTitleCost(); anOrder.printCart(); break;
                    case 2: anOrder.sortByCostTitle();anOrder.printCart();break;
                    default: break;
                }
                break;
            case 3:
                System.out.println("Enter media's name: ");
                String itemName = scanner.nextLine();
                if(anOrder.checkInCart(itemName)){
                    System.out.println("Item found.");
                    Media md = anOrder.searchByTitle(itemName);
                    anOrder.removeMedia(md);
                } else System.out.println("Item isn't in cart. Cannot remove.");
                break;
            case 4:
                System.out.println("Enter media's name: ");
                itemName = scanner.nextLine();
                if(anOrder.checkInCart(itemName)){
                    System.out.println("Item found.");
                    Media md = anOrder.searchByTitle(itemName);
                    if(md instanceof CompactDisc){
                        CompactDisc cdTemp = (CompactDisc) md;
                        cdTemp.play();
                        break;
                    }
                    if(md instanceof DigitalVideoDisc ){
                        DigitalVideoDisc dvdTemp = (DigitalVideoDisc) md;
                        dvdTemp.play();
                        break;
                    }
                    System.out.println("Cannot be played.");
                    break;
                } else System.out.println("Item isn't in cart. Cannot play.");
                break;
            case 5:
                System.out.println("An order is created.");
                anOrder.cartEmpty();
                System.out.println("Current cart is: empty");
                anOrder.printCart();
                break;
            default: break;
        }
    }

    public static void cartMenu() {
        System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");

    }

    //storeMenu - 1
    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }

    public static void handleMediaDetailsMenu(){
        System.out.print("Enter media's title: ");
        String itemName = scanner.nextLine();
        if(store.search(itemName)!=null){
            System.out.println(store.search(itemName).toString());
        }
        else{
            System.out.println("Item doesn't exist.");
            return;
        }
        Media item = store.search(itemName);
        System.out.println(item.toString());
        mediaDetailsMenu();
        switch (optionReturn(0,2)){
            case 1: anOrder.addMedia(item); break;
            case 2:

                if (item instanceof CompactDisc) {
                    CompactDisc itemTemp = (CompactDisc) item;
                    itemTemp.play();
                    break;
                } else if (item instanceof DigitalVideoDisc) {
                    DigitalVideoDisc itemTemp = (DigitalVideoDisc) item;
                    itemTemp.play();
                    break;
                } else {
                    System.out.println("Cannot be played.");
                    break;
                }
            default: return;
        }
    }

    //Select storeMenu - 2
    public static void handleAddMediaToCart(){
        System.out.print("Enter media's title: ");
        String itemName = scanner.nextLine();
        if(store.search(itemName)!=null) System.out.println("Item found.");
        else{
            System.out.println("Item doesn't exist. Cannot add.");
            return;
        }
        Media item = store.search(itemName);
        anOrder.addMedia(item);
    }

    //Select storeMenu - 3
    public static void handlePlayMedia(){
        System.out.print("Enter media's title: ");
        String itemName = scanner.nextLine();
        if(store.search(itemName)!=null) System.out.println("Item found.");
        else{
            System.out.println("Item doesn't exist. Cannot play.");
            return;
        }
        Media item = store.search(itemName);
        if(item instanceof CompactDisc){
            CompactDisc itemTemp = (CompactDisc) item;
            itemTemp.play();
            return;
        }
        if(item instanceof DigitalVideoDisc){
            DigitalVideoDisc itemTemp = (DigitalVideoDisc) item;
            itemTemp.play();
            return;
        }
        System.out.println("Cannot be played.");
    }

    //Select storeMenu - 4
    public static void handleViewCart(){
        anOrder.printCart();
    }
}