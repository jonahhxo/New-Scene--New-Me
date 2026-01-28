import org.code.theater.*;

/*
 Main File, the code runs here. Two objects are required "ThisYear" "LastYear" 
 then the scenes are created and played.
 */

public class TheaterRunner {
  public static void main(String[] args) {

    // Create scene objects
    LastYear lastYear = new LastYear();
    ThisYear thisYear = new ThisYear();

    // Call top level methods
    lastYear.drawScene();
    thisYear.drawScene();

    Theater.playScenes(lastYear, thisYear); // Method to play both scenes on the theater
    
  }
}