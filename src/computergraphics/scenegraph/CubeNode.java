package computergraphics.scenegraph;

import javax.media.opengl.GL2;

public class CubeNode extends Node {
	
	// Draw 6 Quads in shape of a cube
	public void drawGl(GL2 gl) {
		
		gl.glColor3f(0.75f, 0.25f, 0.25f);

		gl.glBegin(GL2.GL_QUADS);

		// TOP
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
	    gl.glVertex3f( 1.0f, 1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f(-1.0f, 1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f(-1.0f, 1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1, 1, 0);
	    gl.glVertex3f( 1.0f, 1.0f, 1.0f);
	    
	    
	    // BOTTOM
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
	    gl.glVertex3f( 1.0f,-1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f(-1.0f,-1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f(-1.0f,-1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1, 1, 0);
	    gl.glVertex3f( 1.0f,-1.0f,-1.0f);
	    
	    
	    // FRONT
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
	    gl.glVertex3f( 1.0f, 1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f(-1.0f, 1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f(-1.0f,-1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1, 1, 0);
	    gl.glVertex3f( 1.0f,-1.0f, 1.0f);
	    
	    
	    // BACK
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
	    gl.glVertex3f( 1.0f,-1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f(-1.0f,-1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f(-1.0f, 1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1, 1, 0);
	    gl.glVertex3f( 1.0f, 1.0f,-1.0f);
	    
	    
	    // LEFT
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
	    gl.glVertex3f(-1.0f, 1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f(-1.0f, 1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f(-1.0f,-1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1, 1, 0);
	    gl.glVertex3f(-1.0f,-1.0f, 1.0f);
	    
	    
	    // RIGHT
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1.0, 0.0, 0.0);
	    gl.glVertex3f( 1.0f, 1.0f,-1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 1.0, 0.0);
	    gl.glVertex3f( 1.0f, 1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(0.0, 0.0, 1.0);
	    gl.glVertex3f( 1.0f,-1.0f, 1.0f);
	    
		gl.glNormal3f(0, 0, 1);
		gl.glColor3d(1, 1, 0);
	    gl.glVertex3f( 1.0f,-1.0f,-1.0f);

	    
	    gl.glEnd();
		
	}
	
}
