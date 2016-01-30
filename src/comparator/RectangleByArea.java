package comparator;

import java.util.Comparator;

public class RectangleByArea implements Comparator<Rectangle>
{

	@Override
	public int compare(Rectangle r1, Rectangle r2)
	{
		int area1 = r1.getLength()*r1.getWidth();
		int area2 = r2.getLength()*r2.getWidth();
		return area1 - area2;
	}
	
}

