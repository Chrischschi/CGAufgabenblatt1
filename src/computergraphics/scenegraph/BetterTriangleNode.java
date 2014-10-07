package computergraphics.scenegraph;

import javax.media.opengl.GL2;

public class BetterTriangleNode extends Node {

	private int displayList;	// Index der Displayliste
	private boolean displayListMissing = true;
	
	
	public void initDisplayList(GL2 gl){
	displayList = gl.glGenLists(1);
		
		gl.glNewList(displayList, GL2.GL_COMPILE);
		
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
		
		gl.glEndList();
		displayListMissing = false;
	}
	
	public void drawGl(GL2 gl) {
		if(displayListMissing){
			initDisplayList(gl);
			System.out.println("DisplayList initialisiert!");
		}
		gl.glCallList(displayList);
		
	}
	
}
