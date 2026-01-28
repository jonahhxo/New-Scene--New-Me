import org.code.theater.*;
import org.code.media.*;

/*
This file represents ThisYear. 
Has captions associated with each image in data2.txt and plays them in order. The photos in ThisYear are photos sourced from online.
As well as sets up the look and style of the text that is displayed on screen (where the captions go)
The cover image for ThisYear is also set as a png file. 
 */

public class ThisYear extends Scene {
  private String[] captions; // Array that holds the captions (position sensitive)
  private String[] images; // Array that holds the images, images are located in data2.txt
  private String startImage; // String variable that holds the startImage/Cover (very first picture)
  
  public ThisYear() {
captions = new String[] { // Captions Array Initialized
  "Peace",
  "Love",
  "Fun",
  "Travel",
  "Service"
};

  images = FileReader.toStringArray("data2.txt");
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