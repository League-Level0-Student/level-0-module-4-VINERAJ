PImage donkey;
PImage tail;
void setup(){
  donkey = loadImage("donkey.png");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
size(400,400);     //replace width, height with your picture's dimensions
donkey.resize(400,400);
tail.resize(10,10);     //replace width, height with your tail's dimensions
}

void draw(){
  background (donkey);
image(tail, mouseX, mouseY);
}
