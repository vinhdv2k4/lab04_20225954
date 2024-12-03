package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements playAble {
    private String artist; 
    private ArrayList<Track> tracks; 

   
    public CompactDisc(int id, String title, String category, float cost, String artist, int length) {
        super(id, title, category, cost, "", length);
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }
    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (!tracks.contains(track)) {
            tracks.add(track);
            System.out.println("Track added: " + track.getTitle());
        } else {
            System.out.println("Track already exists: " + track.getTitle());
        }
    }

    public void removeTrack(Track track) {
        if (tracks.contains(track)) {
            tracks.remove(track);
            System.out.println("Track removed: " + track.getTitle());
        } else {
            System.out.println("Track not found: " + track.getTitle());
        }
    }
    public int getLength() {
        int totalLength = 0;
        for (Track track : tracks) {
            totalLength += track.getLength();
        }
        return totalLength;
    }
    @Override
    public void play() {
        if(getLength()<=0){
            System.out.println("CD can not play demo");
        }
        System.out.println("Playing DVD : " + getTitle());
        System.out.println("Artist "+artist);
        System.out.println("Tracks ");
        for (Track track : tracks) {
            track.play();
        }
    }
}