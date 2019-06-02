PImage face;
void setup(){
  face = loadImage("rateyes.jpg");
  size(800,600);
    face.resize(width,height);
}
int Xval = 330;
int Yval = 355;
int Xval2 = 550;
int Yval2 = 365;
void draw(){
  background(face);
  fill(#FAFAFA);
  ellipse(330,355,40,40);
  fill(#030000);
  ellipse(Xval,Yval,10,10);
  Xval=mouseX-20;
  Yval=mouseY-20;
  fill(#FAFAFA);
  ellipse(550,365,30,30);
  fill(#030000);
  ellipse(Xval2,Yval2,10,10);
  Xval2=mouseX+200;
  Yval2=mouseY-10;
  /*if(mouseX>Xval-40&&mouseY>Yval-40){
    Xval=330;
    Yval=355;
  }*/
  
 if(Xval<310){
   Xval=315;
 }
 if(Xval>350){
   Xval=345;
 }
 if(Yval<320){
  Yval=340; 
 }
 if(Yval>360){
   Yval=360;
 }
  
}
