package computergraphics.scenegraph;

import javax.media.opengl.GL;
import javax.media.opengl.GL2;

public class SingleTriangleNode extends Node {

	@Override
	public void drawGl(GL2 gl) {
		gl.glColor3f(0, 0.75f, 0);//der mittlere parameter sorgt für den grünton
		gl.glBegin(GL.GL_TRIANGLES);
		gl.glVertex3f(-0.5f, -0.5f, 0);
		gl.glVertex3f(0.5f, -0.5f, 0);
		gl.glVertex3f(0, 0.5f, 0);
		gl.glEnd();
	}
}

