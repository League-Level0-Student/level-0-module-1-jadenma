void setup() {
    size(500, 500);
}
void draw() {
    noStroke();
    background(250, 250, 250);
    fill(#FF0000);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#25E533);
    rect(176, 103, 12, 32);
    fill(#FFFFFF);
    if (mousePressed) { 
      ellipse(75, 200, 25, 25);
    }
}
