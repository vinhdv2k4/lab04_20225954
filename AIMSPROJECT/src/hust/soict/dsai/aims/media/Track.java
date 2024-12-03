package hust.soict.dsai.aims.media;

public class Track implements playAble{
    protected  String title; 
    protected  int length; 

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
    @Override
    public void play() {
        if (length <= 0) {
            System.out.println("Track can not play");
        }
        System.out.println("Play Track "+ getTitle());
        System.out.println("Track Lenght " +getLength());
    }

}