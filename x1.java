//////// I'm trying to add a house, fix the tree, give some shape to my creature a
//////// My name is Alex Reid  (CST 112; 9/9/15)

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
  fill( 255, 255, 0);
  ellipse( dx+420, dy+40, 40, 40 );    // sun
  // Grass
  fill( 100, 200, 100 );
  rect( 0, horizon, width, height*3/4 );      // grass.

  /* INSERT YOUR CODE HERE! */
  fill(144, 87, 173); 
  rect(300, 60, 60, 60 ); //house
  fill(165, 115, 53); 
  rect(323, horizon-30, 15, 30); //house door
  fill(165, 115, 53);
  triangle(300, 60, 330, 30, 360, 60 ); //house roof 
  fill(255);
  rect( 305, 69, 15, 15);
  rect( 339, 69, 15, 15);
  fill( 100, 200, 100 );
  triangle( 130,80, 160, horizon-100, 190, 80  ); //tree
  fill( 100, 200, 100 ); 
  triangle( 130,60, 160, horizon-100, 190, 60  ); //tree2
  fill( 150, 50, 0); 
  rect( 153, horizon-40, 13, 40);

  fill(0);
  text( "My name is Alex!", 10, height-20 );                                          

  //// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;

  //// SHOW:  display the creature at (x,y)

  /* INSERT YOUR CODE HERE! */
  ellipseMode(CENTER);
  fill(219, 143, 49);
  ellipse( x+12.5, y-12, 25, 25); //Aoi's head
  fill(116, 78, 96); 
  rect( x, y, 25, 45 );   //Aoi's body   
  rect(x-7, y+1, 7, 20); //Aoi's arm left
  rect(x+25, y+1, 7, 20); //Aoi's arm right
  fill(0);
  ellipse(x+6, y-13, 7, 7); //Aoi's glasses L
  ellipse(x+19, y-13, 7, 7); //Aoi's glasses R
  line(x+6, y-13, x+19, y-13); //Aoi's glasses frame
  fill(255);
  arc(x+12.5, y-6, 10, 10, 0, PI); //His mouth
  text( "Aoi", x+3, y+25 ); //His name!
  
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
