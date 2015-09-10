//////// I'm trying to add a house, fix the tree, give some shape to my creature a
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640, 480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  //// SCENE:  sky, sun, tree, house, etc.
  background( 60, 140, 140 );                // sky
  fill( 255, 255, 0 );
  ellipse( width*3/4, height/8, 40, 40 );    // sun
  // Grass
  fill( 100, 200, 100 );
  rect( 0, horizon, width, height*3/4 );      // grass.

  /* INSERT YOUR CODE HERE! */
  fill(120, 100, 100);
  rect(300, 60, 60, 60 ); //house
  triangle(300, 60, 330, 30, 360, 60 ); //roof
  fill( 100, 200, 100 );
  triangle( 130,80, 160, horizon-100, 190, 80  );  // tree
  fill( 150, 50, 0);
  rect( 136, horizon-50, 28, 50);

  fill(0);
  text( "My name is Alex", 10, height-20 );                                          

  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;

  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  fill(255, 0, 0); 
  ellipse( x, y, 60, 60 );        /* REPLACE THIS WITH YOUR OWN CODE! */
  ellipse( x+25, y-40, 20, 20);
  fill(0);
  text( "MOOP", x, y );
}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}
