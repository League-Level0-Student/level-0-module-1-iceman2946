
void setup() {
PImage face = loadImage("face.png");
size(500,500);
face.resize(500,500);
image(face,0,0);
}
void draw() {
fill(255,0,0);
ellipse(180,250,160,100);
ellipse(340,250,130,100);
}
