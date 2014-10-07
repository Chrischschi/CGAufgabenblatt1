/**
 * Praktikum WPCG, WS 14/15, Gruppe 2
 * Gruppe: Andreas Mauritz (andreas.mauritz@haw-hamburg.de)
 * 		   Christian Schirin (christian.schirin@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Bonusaufgabe (Neu)
 */
package computergraphics.scenegraph;

import javax.media.opengl.GL2;

/** Stellt eine Pyramidenform im Szenengraph dar .
 * 
 * @author Christian, Andreas
 *
 */
public class PyramidNode extends Node {
	
	//Punkte A-D = punkte der grundfläche
	//Punkt S = die spitze der pyramide
	
	// A
	float ax = -1.0f;
	float ay = 1.0f;
	float az = 1.0f;
	
	// B
	float bx = 1.0f;
	float by = 1.0f;
	float bz = 1.0f;
	
	// C
	float cx = -1.0f;
	float cy = -1.0f;
	float cz = 1.0f;
	
	// D
	float dx = 1.0f;
	float dy = -1.0f;
	float dz = 1.0f;
	
	// S
	float sx = 0f;
	float sy = 0f;
	float sz = 2.5f;
	
	public void drawGl(GL2 gl) {
		
		gl.glColor3f(0.75f, 0.25f, 0.25f);
		
		// Es müssen fünf facetten gezeichnet werden, 
		// Die grundfläche und die vier seiten der pyramide 
		

		gl.glBegin(GL2.GL_QUADS); //Die grundfläche als Quadrat zeichnen
	    	    
	    // BOTTOM SQUARE
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 1.0);
	    gl.glVertex3f(bx, by, bz);		// B
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 1.0);
	    gl.glVertex3f(ax, ay, az);		// A
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 1.0);
	    gl.glVertex3f(cx, cy, cz);		// C
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 1.0);
	    gl.glVertex3f(dx, dy, dz);		// D
	    
	    gl.glEnd();
	    
	    
	    gl.glBegin(GL2.GL_TRIANGLES); // Die seiten als Dreieck zeichnen
	    
	    // 1. TRIANGLE
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
	    gl.glVertex3f(sx, sy, sz);		// oben S
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
	    gl.glVertex3f(ax, ay, az);		// links A
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 1.0);
	    gl.glVertex3f(bx, by, bz);		// rechts B
	    
	    
	    // 2. TRIANGLE
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f(sx, sy, sz);		// oben S
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f(bx, by, bz);		// B
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f(dx, dy, dz);		// D
	    
	    
	    // 3. TRIANGLE
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f(sx,sy, sz);		// S
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f(cx,cy,cz);		// C
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f(dx,dy,dz);		// D
	    
	    
	    // 4. TRIANGLE
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 1.0, 0.0);
	    gl.glVertex3f(sx,sy,sz);		// S
	    
		gl.glNormal3f(0, 0, 1);	
		gl.glColor3d(1.0, 1.0, 0.0);
	    gl.glVertex3f(cx,cy,cz);		// C
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 1.0, 0.0);
	    gl.glVertex3f(ax,ay,az);		// A
	    
	    gl.glEnd();

	}	
}
