package music;
import java.util.ArrayList;

// MusicPlayer package

// Playable interface
interface Playable {
   public void play();
   public void pause();
   public void stop();
}

// Song class that implements Playable interface
class Song implements Playable {
   private String title;
   private String artist;
   private int price;

   public Song(String title, String artist, int price) {
      this.title = title;
      this.artist = artist;
      this.price = price;
   }

   // Implement Playable interface methods
   @Override
   public void play() {
      System.out.println("Price of the Disk: " + title + " by " + artist + " price " + price);
   }

   @Override
   public void pause() {
      System.out.println("Pausing song: " + title);
   }

   @Override
   public void stop() {
      System.out.println("Stopping song: " + title);
   }

   // Getters and setters for Song properties
   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public String getArtist() {
      return artist;
   }

   public void setArtist(String artist) {
      this.artist = artist;
   }

   public int getDuration() {
      
      return price;

   }

   public void setDuration(int price) {
      this.price = price;
   }
}

// Playlist interface
interface Playlist {
   public void addSong(Song song);
   public void removeSong(Song song);
   public void play();
}

// BasicPlaylist class that implements Playlist interface
class BasicPlaylist implements Playlist {
   private String name;
   private ArrayList<Song> songs;

   public BasicPlaylist(String name) {
      this.name = name;
      songs = new ArrayList<>();
   }

   // Implement Playlist interface methods
   @Override
   public void addSong(Song song) {
      songs.add(song);
   }

   @Override
   public void removeSong(Song song) {
      songs.remove(song);
   }

   @Override
   public void play() {
      for (Song song : songs) {
         song.play();
      }
   }

   // Getters and setters for BasicPlaylist properties
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public ArrayList<Song> getSongs() {
      return songs;
   }

   public void setSongs(ArrayList<Song> songs) {
      this.songs = songs;
   }
}

// Main class
public class lab8 {
   public static void main(String[] args) {
      Song song1 = new Song("Honey Singh 3.0", "Honey singh", 48000);
      Song song2 = new Song("Players", "Badshah", 35000);
      
      BasicPlaylist playlist = new BasicPlaylist("Classic Rock");
      playlist.addSong(song1);
      playlist.addSong(song2);
      playlist.play();
      
      playlist.removeSong(song1);
      playlist.play();
   }
}
