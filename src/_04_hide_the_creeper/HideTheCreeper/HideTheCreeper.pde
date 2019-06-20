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
  image(creeper, 210, 177);     //in draw method
  if(mousePressed){
    fill(#FC0808);
  ellipse(mouseX, mouseY, 10, 10);
  }
  if(dist(210, 177, mouseX, mouseY) <10){
    fill(#25CB1D);
  ellipse(mouseX, mouseY, 10, 10);
  }
}
