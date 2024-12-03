package hust.soict.dsai.aims.cart;

import java.util.ArrayList;
import java.util.Collections;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();

    // Add a media item to the cart
    public void addMedia(Media media) {
        if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
            itemsOrdered.add(media);
            System.out.println("The media has been added.");
        } else {
            System.out.println("The cart is full.");
        }
    }

    // Remove a media item from the cart
    public void removeMedia(Media media) {
        if (itemsOrdered.remove(media)) {
            System.out.println("The media has been removed.");
        } else {
            System.out.println("Media not found.");
        }
    }

    // Calculate total cost
    public float totalCost() {
        float totalCost = 0;
        for (Media media : itemsOrdered) {
            totalCost += media.getCost();
        }
        return totalCost;
    }

    // Print the cart contents
    public void printCart() {
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i = 1;
        for (Media media : itemsOrdered) {
            if (media != null) {
                System.out.println(i + ". " + media.toString());
                i++;
            }
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }

    // Search for a media by ID
    public void searchById(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                System.out.println("Found Media: " + media.toString());
                return;
            }
        }
        System.out.println("No match found for ID: " + id);
    }

    // Updated searchByTitle method to return Media
    public Media searchByTitle(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
              System.out.println("Found Media: " + media.toString());
                return media; // Return the matching media
            }
        }
        System.out.println("No match found for title: " + title);
        return null; // Return null if no match is found
    }

    // Sort cart by title and cost
    public void sortByTitleCost() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }

    // Sort cart by cost and title
    public void sortByCostTitle() {
        Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }

    // Empty the cart
    public void cartEmpty() {
        itemsOrdered.clear();
        System.out.println("The cart has been emptied.");
    }

    // Check if a media with the given ID exists in the cart
    public boolean checkInCart(int id) {
        for (Media media : itemsOrdered) {
            if (media.getId() == id) {
                return true;
            }
        }
        return false;
    }

    // Check if a media with the given title exists in the cart
    public boolean checkInCart(String title) {
        for (Media media : itemsOrdered) {
            if (media.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }
}
