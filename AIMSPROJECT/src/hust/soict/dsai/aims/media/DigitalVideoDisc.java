package hust.soict.dsai.aims.media;

public class DigitalVideoDisc extends Disc implements playAble {
    
        public static int nbDigitalVideoDiscs=0;
      
        public DigitalVideoDisc(String title, String category, float cost) {
             
        super(++nbDigitalVideoDiscs, title, category, cost, "", 0);
       
        }
        public DigitalVideoDisc(String title) {
       super(++nbDigitalVideoDiscs, title, "", 0,"",0);
        
        }
        public DigitalVideoDisc(String title, String category, String director, float cost) {
            super(++nbDigitalVideoDiscs, title, category, cost, director, 0);
        }
        public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
            super(++nbDigitalVideoDiscs, title, category, cost,director,length) ;

        }
        public DigitalVideoDisc(String title, String category, int length, float cost) {
            super(++nbDigitalVideoDiscs, title, category, cost,"",length);
       
        }
        @Override
        public String toString() {
            return "DVD - " + getTitle() + " - "+ getCategory() + " - " + getDirector() + " - " + getLength() + " - " + getCost()+ "$" ;
        }
        public boolean isMatch(String title) {
            return getTitle() != null && getTitle().toLowerCase().contains(title.toLowerCase());
        }
        @Override 
        public void play(){
            System.out.println("Playing DVD: " +this.getTitle());
            System.out.println("DVD lenght " + this.getLength());


        }
        
    }
    