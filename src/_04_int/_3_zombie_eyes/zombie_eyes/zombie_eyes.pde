PImage zombie;
void setup() {
size(500,500);
zombie = loadImage("zombie_eyes.jpg");
zombie.resize(500, 500);
}
void draw() {
image(zombie, 0, 0);
fill(mouseX, mouseY, mouseY);
ellipse(185, 220, 60, 60);
ellipse(340, 190, 60, 60);
fill(0);
ellipse(185, 220, 10, 10);
ellipse(340, 190, 10, 10);
}
