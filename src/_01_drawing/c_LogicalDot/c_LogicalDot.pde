
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
  size(600,600);
  

}

void draw() {
  
// 2. Draw an ellipse
ellipse(200,200,200,200);
// Run the program to make sure it works before moving on.


// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
 
   //  put one color here 
   fill(0,0,0);
  
} else {
  
   // put a different color here
  fill(6,123,0);
}  
  
  
  
}
