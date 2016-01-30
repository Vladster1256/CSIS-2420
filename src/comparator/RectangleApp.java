package comparator;

import java.util.Arrays;

public class RectangleApp
{

	public static void main(String[] args)
	{
		Rectangle[] rectangles = {new Rectangle(2,1), new Rectangle (4,3), new Rectangle (6,5)};
		System.out.println(Arrays.toString(rectangles));
		Arrays.sort(rectangles);
		System.out.println(Arrays.toString(rectangles));
	}

}
