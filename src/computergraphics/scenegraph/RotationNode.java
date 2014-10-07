/**
 * Praktikum WPCG, WS 14/15, Gruppe 2
 * Gruppe: Andreas Mauritz (andreas.mauritz@haw-hamburg.de)
 * 		   Christian Schirin (christian.schirin@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1, Aufgabe 2b
 * Verwendete Quellen:
 * Zeyang Li , Transformations in OpenGL, Carnegie Mellon University,
 * URL: 
 * http://www.cs.cmu.edu/afs/cs/academic/class/15462-s09/www/lec/03/lec03a.pdf
 * (Zugegriffen am 1.10.2014)
 *  
 */
package computergraphics.scenegraph;

import javax.media.opengl.GL2;

import computergraphics.math.Vector3;

/**
 * Diese Klasse ermöglicht es, Rotationen darzustellen.
 *
 */
public class RotationNode extends Node {
	
	private final Vector3 rotAxis;
	private final float angle;
	
	/**
	 * Constructor.
	 * @param rotAxis Die Rotationsachse, um die gedreht werden soll
	 * @param angle Der Winkel im Gradmaß um wie viel gegen den Uhrzeigersinn
	 * 				rotiert werden soll.
	 */
	public RotationNode(Vector3 rotAxis, float angle) {
		this.rotAxis = rotAxis;
		this.angle = angle;
	}
	

	/**
	 * Sorgt dafür, dass alle Kindknoten dieses Knotens relativ zu einer 
	 * Rotationsachse um einen Winkel rotiert dargestellt werden.
	 */
	@Override
	public void drawGl(GL2 gl) {
		
		// Remember current state of the render system
				gl.glPushMatrix();

		// cast von double auf float, um openGL-Funktion verwenden zu k�nnen. 
		gl.glRotatef(angle, (float) rotAxis.get(0), (float) rotAxis.get(1), (float) rotAxis.get(2));		
		
		// Draw all children
		for (int childIndex = 0; childIndex < getNumberOfChildren(); 
				childIndex++) {
			getChildNode(childIndex).drawGl(gl);
		}
		
		// Restore original state
		gl.glPopMatrix();
		
	}
	
	

}
