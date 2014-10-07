/*
 * Praktikum WPCG, WS 14/15, Gruppe 2
 * Gruppe: Andreas Mauritz (andreas.mauritz@haw-hamburg.de)
 * 		   Christian Schirin (christian.schirin@haw-hamburg.de)
 * Aufgabe: Aufgabenblatt 1
 */
package computergraphics.applications;


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
		ColorNode colorNode2 = new ColorNode(new Vector3(0, 1, 0));
		
		//
		ScaleNode scaleNode = new ScaleNode(new Vector3(1, 1, 1));
		RotationNode rotationNode = new RotationNode(new Vector3(1,0,0), 87);
		
		SingleTriangleNode triangleNode = new SingleTriangleNode();
		SingleTriangleNode triangleNode2 = new SingleTriangleNode();
		
		
		BetterTriangleNode betterTriangle = new BetterTriangleNode();
		
		
		TranslationNode trans = new TranslationNode(new Vector3(1,1,0));
		
//		getRoot().addChild(colorNode);
//		colorNode.addChild(triangleNode);
		
		getRoot().addChild(rotationNode);
		rotationNode.addChild(trans);
		
		
//		getRoot().addChild(colorNode2);
//		colorNode2.addChild(triangleNode2);
		
//		getRoot().addChild(trans);
		trans.addChild(colorNode);
		colorNode.addChild(betterTriangle);
		
		
		//
//		getRoot().addChild(scaleNode);
//		scaleNode.addChild(triangleNode);
//		scaleNode.addChild(colorNode);
		
		
		
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
