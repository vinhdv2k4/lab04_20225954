package hust.soict.dsai.aims.cart;
import java.util.ArrayList;

import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;;

public class Cart {
      public static final int MAX_NUMBERS_ORDERED = 20;
      private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
     
      public void addMedia(Media media) {
        if(itemsOrdered.size()< MAX_NUMBERS_ORDERED){
        itemsOrdered.add(media);
        System.out.println("The media has been added ");
      }
      else{
        System.out.println("The cart is full");
      }
    }
      public void removeMedia(Media media){
        if(itemsOrdered.remove(media)){
          System.out.println("The media has been removed");
        }
        else{
          System.out.println("Media not found");
        }
      }
    public float totalCost() {
      float totalCost = 0;
      for(Media media : itemsOrdered) {
              totalCost += media.getCost();
      }
      return totalCost;
    }

    public void printCart() {
      System.out.println("***********************CART***********************");
      System.out.println("Ordered Items:");
      for (Media media : itemsOrdered) {
        int i =0;
        if(media != null) {
        System.out.println((i + 1) + ". " + media.toString());
        }
      }
      System.out.println("Total cost: " + totalCost());
      System.out.println("***************************************************");

    }
    public void searchById(int id) {
    
      for (Media media : itemsOrdered) {
          if (media.getId() == id) {
              System.out.println("Found DVD: " + media.toString());
              return;
          }
      }
      System.out.println("No match found for ID: " + id);
      }
  
  public void searchByTitle(String title) {
      boolean found = false;
      for (Media media : itemsOrdered) {
          if (media instanceof DigitalVideoDisc) {
            DigitalVideoDisc dvd = (DigitalVideoDisc) media;
            if(dvd.isMatch(title))
              System.out.println("Found DVD: " + dvd.toString());
              found = true;
              break;
          }
      }
      if (!found) {
          System.out.println("No match found for title: " + title);
      }
  }
  
  }
  