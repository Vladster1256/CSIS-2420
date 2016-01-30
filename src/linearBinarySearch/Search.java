package linearBinarySearch;

public class Search 
{
	public static int linear(int[] a, int key)
	{
		int size = a.length - 1;
		
		for(int i=0; i <= size; i++)
		{
			if(key == a[i])
			{
				return i;
			}
		}
		return -1; // TODO
	}
}
