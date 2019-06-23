int xloc = 210;
int yloc = 177;
PImage creeper;     //at the top of your program
void setup(){
  size(400, 400); //in setup method
  PImage minecraft = loadImage("minecraft.png");     //in setup method
minecraft.resize(400, 400);          //in setup method
background(minecraft);          //in setup method
creeper=loadImage("creeper.png");     //in setup method
creeper.resize(1,1);
}

void draw(){
  image(creeper, xloc, yloc);     //in draw method
  if(mousePressed){
  if(dist(xloc, yloc, mouseX, mouseY) <10){
    fill(#25BF1B);
  ellipse(mouseX, mouseY, 10, 10);
  println("YOU FOUND THE CREEPER");
  int randX = (int)random(401);
  int randY = (int)random(401);
  image(creeper, randX, randY);
  xloc = randX;
  yloc = randY;
  }
  else{
  fill(#FC0808);
  ellipse(mouseX, mouseY, 10, 10);
  }
  }
}
