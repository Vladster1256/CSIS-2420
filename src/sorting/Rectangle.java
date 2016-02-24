package sorting;

import java.util.Comparator;

public class Rectangle
{
	private int length;
	private int width;
	public static final Comparator<Rectangle> BY_AREA = new CompareByArea();
	public static final Comparator<Rectangle> BY_LENGTH = new CompareByLength();
	
	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public int perimeter()
	{
		return 2 * (length + width);
	}
	
	public int area()
	{
		return length* width;
	}
	
	public String toString()
	{
		return"[" + length + "x" + width + "]";
	}
	
	private static class CompareByArea implements Comparator<Rectangle>
	{
		@Override
		public int compare(Rectangle arg0, Rectangle arg1)
		{
			return arg0.area() - arg1.area();
		}
	}
	private static class CompareByLength implements Comparator<Rectangle>
	{
		@Override
		public int compare(Rectangle o1, Rectangle o2)
		{
			return o1.length - o2.length;
		}	
	}
}
