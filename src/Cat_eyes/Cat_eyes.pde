void setup() {
  size(900, 621);
  PImage face =loadImage("cat.jpg");
  image(face, 0, 0);
}
void draw () {
  fill(0, 0, 0);
  ellipse(235, 240, 150, 140 );
  ellipse(650, 240, 150, 140);
  if (mousePressed) {
    fill(mouseX, mouseY, 200);
    ellipse(235, 240, 30, 30);
    if (mousePressed) {
      fill(mouseX, mouseY, 200);
      ellipse(650, 240, 30, 30);
    }
  }
}