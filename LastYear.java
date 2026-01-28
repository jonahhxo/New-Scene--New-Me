import org.code.theater.*;
import org.code.media.*;

/*
This file represents LastYear. 
Has captions associated with each image in data1.txt and plays them in order. The photos are sourced from my personal photo gallery.
As well as sets up the look and style of the text that is displayed on screen (where the captions go)
The cover image for LastYear is also set as a png file
 */

public class LastYear extends Scene {
  private String[] captions; // Array that holds the captions
  private String[] images; // Array that holds the images that appear
  private String startImage; // String variable that represents the start / cover image
  
  public LastYear() {
captions = new String[] { // Captions for the Images that appear (captions appear in the order of the images in data1.txt)
  "At District Convention",
  "In Florida for Key Club",
  "Flying home from Florida",
  "Meeting the Mayor",
  "On Vacation",
  "Sleepover w/ Nicole",
  "Decorating Rose Float"
};


  images = FileReader.toStringArray("data1.txt");
  }

   public void drawTitleScreen() { // Cover Image
    setStartImage("Image8.png");

    if (getStartImage().endsWith(".png")) { // Checks to see if the start image is a png format
    drawImage(getStartImage(), 0,0,400,400,0.0);
    } else {
      System.out.println("StartImage is not correc format");
    }
  }

  public void drawImagesWithCaptions() { // Images w/ Captions - Credit to Mr. Aiello but tweaked a bit
    setCaptionStyle();
    for (int index = 0; index < images.length; index++) {
      drawImage(images[index], 0, 0, 400, 400, 0.0);
      drawText(captions[index], 50, 350);
      pause(1.0);
    }
  }

  public String getStartImage() {
    return startImage;
  } // Gets whatever the current start image is set to

  public void setStartImage(String startImage) { // Sets start image
    this.startImage = startImage;
  }

  public void drawScene() { // Draws scene, generates everything essentially
    drawTitleScreen();
    pause(3.0);
    drawImagesWithCaptions();
  }

   public void setCaptionStyle() { // Sets the style for the captions on the scene (text, color, etc)
    setTextHeight(30);
    setTextColor("white");
    setTextStyle(Font.SANS, FontStyle.BOLD);
  }
  
}
