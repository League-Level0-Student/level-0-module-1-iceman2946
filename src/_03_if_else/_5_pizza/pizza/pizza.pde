PImage pepperoni;
PImage mushroom;
PImage pineapple;
void setup() {
size(500,500);
fill(212,155,23);
ellipse(250,250,500,500);
fill(255,0,0);
ellipse(250,250,450,450);
fill(255,166,112);
ellipse(250,250,400,400);
pepperoni=loadImage("pepperoni.png");
mushroom=loadImage("mushroom.png");
pineapple=loadImage("pineapple.png");
pineapple.resize(125,125);

}
void draw() {
    image(pepperoni,200,200);
    image(pepperoni,100,200);
    image(pepperoni,250,250);
    image(pepperoni,230,100);
    image(pepperoni,150,230);
    image(pepperoni,300,300);
    image(mushroom,120,200);
    image(mushroom,100,300);
    image(mushroom,240,250);
    image(mushroom,190,100);
    image(mushroom,150,230);
    image(mushroom,100,300);
     image(pineapple,200,200);
    image(pineapple,100,200);
    image(pineapple,250,250);
    image(pineapple,230,100);
    image(pineapple,150,230);
    image(pineapple,300,300);

}
