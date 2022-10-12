package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
//		JFileChooser chooser = new JFileChooser("resources");
//		chooser.showOpenDialog(null);
//		File f = new File(chooser.getSelectedFile().getPath());
//		Scanner in = new Scanner(f); //making Scanner with a File
		StdDraw.setXscale(0, 12);
		StdDraw.setYscale(0, 12);
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(6, 1.5, 6,1.5);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(6, 4.5, 6,1.5);
		StdDraw.setPenColor(Color.YELLOW);
		double[] xs1 = {5,6,7};
		double[] ys1 = {4,2,4};
		StdDraw.filledPolygon(xs1,ys1);
		StdDraw.setPenColor(Color.BLUE);
		double[] xs2 = {5.5,6,6.5};
		double[] ys2 = {3,2,3};
		StdDraw.filledPolygon(xs2,ys2);
//			Color shapeColor= new Color(1, 1, 0);
//			StdDraw.setPenColor(shapeColor);t
//			StdDraw.filledRectangle(1, 1, widthRec,lengthRec);
		}


		
}
