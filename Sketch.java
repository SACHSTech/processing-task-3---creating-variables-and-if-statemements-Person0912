import processing.core.PApplet;

/**
 * A program Sketch.java that draws a flower in the middle of a field
 * with clouds in the sky.
 * @author: Kayla Jin
 */

public class Sketch extends PApplet {
	
  public void settings() {

    // Size of window
    size(400, 400);
  }

  public void setup() {
    
    // Flower variables
    float fltFlowerX = random(width / 4, width * 3/4);
    float fltFlowerY = random(height / 4, height / 2);
    float fltFlowerSize = random(height * 50/400, height * 150/400);
    float fltFlowerDist = fltFlowerSize * 5/12;
    float fltStemX = fltFlowerSize * 2/15;

    // If statements to change the colours of the background and grass
    if (fltFlowerX < width / 2 && fltFlowerY < height * 3/8){
      // Background colour
      background(117, 234, 255);

      // Flower Stem
      fill(117, 255, 168);
      stroke(117, 255, 168);
      rect(fltFlowerX - fltStemX, fltFlowerY, 2 * fltStemX, height - fltFlowerY);

      // Grass
      fill(117, 255, 168);
      stroke(117, 255, 168);
      rect(0, height * 325/400, width, height * 75/400);
    }
    else if (fltFlowerX >= width / 2 && fltFlowerY < height * 3/8){
      // Background colour
      background(55, 198, 250);

      // Flower Stem
      fill(55, 250, 123);
      stroke(55, 250, 123);
      rect(fltFlowerX - fltStemX, fltFlowerY, 2 * fltStemX, height - fltFlowerY);

      // Grass
      fill(55, 250, 123);
      stroke(55, 250, 123);
      rect(0, height * 325/400, width, height * 75/400);
    }
    else if (fltFlowerX < width / 2 && fltFlowerY >= height * 3/8){
      // Background colour
      background(171, 202, 255);

      // Flower Stem
      fill(171, 255, 223);
      stroke(171, 255, 223);
      rect(fltFlowerX - fltStemX, fltFlowerY, 2 * fltStemX, height - fltFlowerY);

      // Grass
      fill(171, 255, 223);
      stroke(171, 255, 223);
      rect(0, height * 325/400, width, height * 75/400);
    }
    else {
      // Background colour
      background(148, 255, 228);

      // Flower Stem
      fill(187, 255, 148);
      stroke(187, 255, 148);
      rect(fltFlowerX - fltStemX, fltFlowerY, 2 * fltStemX, height - fltFlowerY);

      // Grass
      fill(187, 255, 148);
      stroke(187, 255, 148);
      rect(0, height * 325/400, width, height * 75/400);
    }

    // Flower petals
    fill(250, 180, 180);
    stroke(250, 180, 180);
    ellipse(fltFlowerX - fltFlowerDist, fltFlowerY - fltFlowerDist, fltFlowerSize, fltFlowerSize);
    ellipse(fltFlowerX + fltFlowerDist, fltFlowerY - fltFlowerDist, fltFlowerSize, fltFlowerSize);
    ellipse(fltFlowerX - fltFlowerDist, fltFlowerY + fltFlowerDist, fltFlowerSize, fltFlowerSize);
    ellipse(fltFlowerX + fltFlowerDist, fltFlowerY + fltFlowerDist, fltFlowerSize, fltFlowerSize);
    
    // Flower centre
    fill(240, 231, 163);
    stroke(240, 231, 163);
    ellipse(fltFlowerX, fltFlowerY, fltFlowerSize, fltFlowerSize);

    // Grass textures
    stroke(71, 181, 76);
    line(width * 50/400, height * 350/400, width * 150/400, height * 350/400);
    line(width * 10/400, height * 375/400, width * 60/400, height * 375/400);
    line(width * 250/400, height * 367/400, width * 300/400, height * 367/400);
    line(width * 187/400, height * 389/400, width * 234/400, height * 389/400);

    // Shows the current time
    fill(255, 255, 255);
    textSize(50);
    text(hour() + ":" + minute(), 20, 50);
  }

  public void draw() {

  }
}