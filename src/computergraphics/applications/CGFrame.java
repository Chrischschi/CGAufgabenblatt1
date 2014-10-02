package computergraphics.applications;

import javax.media.opengl.awt.GLJPanel;

import computergraphics.framework.AbstractCGFrame;
import computergraphics.math.Vector3;
import computergraphics.scenegraph.BetterTriangleNode;
import computergraphics.scenegraph.ColorNode;
import computergraphics.scenegraph.RotationNode;
import computergraphics.scenegraph.ScaleNode;
import computergraphics.scenegraph.SingleTriangleNode;
import computergraphics.scenegraph.TranslationNode;

/**
 * Application for the first exercise.
 * 
 * @author Philipp Jenke
 * 
 */
public class CGFrame extends AbstractCGFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4257130065274995543L;

	/**
	 * Constructor.
	 */
	/**
	 * @param timerInverval
	 */
	public CGFrame(int timerInverval) {
		super(timerInverval);
		ColorNode colorNode = new ColorNode(new Vector3(0.25, 0.25, 0.75));
		SingleTriangleNode triangleNode = new SingleTriangleNode();
		
		//ScaleNode hinzufügen, um das objekt doppelt so groß zu zeichnen
		// Die Achsen x y z werden gleichmässig skaliert
		ScaleNode scaleNode = new ScaleNode(new Vector3(2,2,2)); 
		
		getRoot().addChild(colorNode);
		colorNode.addChild(scaleNode);
		//triangleNode muss im baum ein kind von scaleNode sein
		//damit die scaleNode methode sich auf die darstellung von
		//triangleNode auswirkt. 
		scaleNode.addChild(triangleNode); 
		
	}

	/*
	 * (nicht-Javadoc)
	 * 
	 * @see computergrafik.framework.ComputergrafikFrame#timerTick()
	 */
	@Override
	protected void timerTick() {
		// System.out.println("Tick");
	}

	/**
	 * Program entry point.
	 */
	public static void main(String[] args) {
		new CGFrame(1000);
	}
}
