import com.teamtreehouse.KaraokeMachine;
import com.teamtreehouse.model.Song;
import com.teamtreehouse.model.SongBook;

public class Karaoke {
  
  public static void main(String[] args) {
    SongBook songBook = new SongBook();
    songBook.importFrom("C:\\Workspace\\Karaoke\\src\\songs.txt");
    KaraokeMachine machine = new KaraokeMachine(songBook);
    machine.run();
    System.out.println("Saving book....");
    songBook.exportTo("C:\\Workspace\\Karaoke\\src\\songs.txt");
  }
}