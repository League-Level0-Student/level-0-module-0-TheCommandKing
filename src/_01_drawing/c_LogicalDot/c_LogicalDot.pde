
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
  size (500,500);

}

void draw() {
  ellipse (250,250,75,75);
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.


// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
 fill (#00FF1B);
   //  put one color here 
  
} else {
  fill (#FF0004);
   // put a different color here
  
}  
  
  
  
}
