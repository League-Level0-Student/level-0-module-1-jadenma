PImage pepperoni;
PImage mushroom;
PImage pineapple;
void setup() {
    size(500, 500);
    fill(#F2DA5F);
    noStroke();
    ellipse(250, 250, 200, 200);
    fill(255, 0, 0);
    ellipse(250, 250, 160, 160);
    fill(255, 255, 0);
    ellipse(250, 250, 150, 150);
    pineapple = loadImage("pineapple.png");
    pepperoni = loadImage("pepperoni.png");
    mushroom = loadImage("mushroom.png");
    pineapple.resize(50, 50);
    mushroom.resize(50, 50);
    pepperoni.resize(50, 50);
    image(pepperoni, 240, 250);
    image(mushroom, 210, 260);
    image(pineapple, 190, 190);
    image(pepperoni, 215, 200);
    image(pepperoni, 185, 250);
    image(pepperoni, 280, 220);
    image(mushroom, 250, 250);
    image(pineapple, 270, 230);
    image(mushroom, 265, 190);
    image(pineapple, 250, 187);
}
void draw() {
    
}
