/**
 * Praktikum WPCG, WS 14/15, Gruppe 2
 * Gruppe: Andreas Mauritz (andreas.mauritz@haw-hamburg.de)
 * 		   Christian Schirin (christian.schirin@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 1c
 */
package computergraphics.scenegraph;

import javax.media.opengl.GL2;

public class SingleTriangleNode extends Node {

	@Override
//	public void drawGl(GL2 gl) {
//		gl.glColor3f(0.75f, 0.25f, 0.25f);
//		gl.glBegin(GL.GL_TRIANGLES);
//		gl.glNormal3f(0, 0, 1);
//		gl.glColor3d(1.0, 0.0, 0.0);
//		gl.glVertex3f(-0.5f, -0.5f, 0);
//		gl.glNormal3f(0, 0, 1);
//		gl.glColor3d(0.0, 1.0, 0.0);
//		gl.glVertex3f(0.5f, -0.5f, 0);
//		gl.glNormal3f(0, 0, 1);
//		gl.glColor3d(0.0, 0.0, 1.0);
//		gl.glVertex3f(0, 0.5f, 0);
//		gl.glEnd();
//	}
	
	public void drawGl(GL2 gl) {

		gl.glColor3f(0.75f, 0.25f, 0.25f);
		
		gl.glBegin(GL2.GL_QUADS);
		
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
		gl.glVertex3f(-0.5f, -0.5f, 0);
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
		gl.glVertex3f(-0.5f, 0.5f, 0);
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
		gl.glVertex3f(0.5f, 0.5f, 0);
		
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1, 1, 0);
		gl.glVertex3f(0.5f, -0.5f, 0);
		
		gl.glEnd();
	}
	
}
