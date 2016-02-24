package sorting;

import java.util.Arrays;

import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdOut;

public class DemoStable
{
	public static void main(String[] args)
	{
		Rectangle[] rectangles = {new Rectangle(3,2),new Rectangle(4,5), new Rectangle(6,8), new Rectangle(5,6), new Rectangle(23423,7890), new Rectangle(789,98)};
		StdOut.println("rectangles: " + Arrays.toString(rectangles));
		Selection.sort(rectangles, Rectangle.BY_AREA);
		StdOut.println("rectangles: " + Arrays.toString(rectangles));
		
	}
	
}
