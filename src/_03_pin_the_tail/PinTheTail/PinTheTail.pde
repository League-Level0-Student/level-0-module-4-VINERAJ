boolean gameOver =false;
PImage donkey;
PImage tail;
PImage win;
PImage lose;
import ddf.minim.*;          //at the very top of your sketch
AudioSample woohooSound;          //at the top of your sketch
boolean playSound = true;          //at the top of your sketch
void setup(){
  Minim minim = new Minim(this);     //In the setup method
woohooSound = minim.loadSample("homer-woohoo.wav");     //In setup. Change the file name if you need to
  donkey = loadImage("donkey.png");      //change the file name if you need to
tail = loadImage("tail.png");      //change the file name if you need to
win = loadImage("youWon.png");
lose = loadImage("youLose.png");
size(400,400);     //replace width, height with your picture's dimensions
donkey.resize(400,400);
tail.resize(100,100);     //replace width, height with your tail's dimensions
win.resize(400,400);
lose.resize(400,400);
}

void draw(){
  background (#030001);
image(tail, mouseX, mouseY);
rect(0, 0, 30, 30);
if (dist(0, 0, mouseX,mouseY) < 30){
  background(donkey);
}
if(gameOver){
  background(win);
}
if(mousePressed){
 if(dist(303, 215, mouseX, mouseY) <40){
       background(donkey);
   image(tail, 303, 215);
    woohooSound.trigger();
     playSound = false;
   gameOver = true;
 }
 else{
  image(tail, mouseX, mouseY);
  background(donkey);
 }
}
}




// put these lines where you want the sound to play
