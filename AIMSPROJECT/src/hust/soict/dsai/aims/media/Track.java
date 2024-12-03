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
        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if(!(obj instanceof Track)) return false;
            Track other = (Track) obj;
            return this.title != null && this.title.equals(other.title) && this.length == other.length;
        }
        @Override
        public int hashCode() {
            return java.util.Objects.hash(title, length);
        }
}