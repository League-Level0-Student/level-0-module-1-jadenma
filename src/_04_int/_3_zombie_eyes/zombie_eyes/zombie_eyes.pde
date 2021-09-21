PImage zombie;
void setup() {
size(500,500);
zombie = loadImage("zombie_eyes.jpg");
zombie.resize(500, 500);
}
void draw() {
image(zombie, 0, 0);
ellipse(185, 220, 60, 60);
}
