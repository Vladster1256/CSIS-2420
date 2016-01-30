package linearBinarySearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class SearchTest
{
	private int[]a = {3,7,2,9,4,1,6};
	private int[] aEmpty = new int[0];
	private int[] aOne = {4};

	@Test
	public void testLinearFound()
	{
		int expected = 3;
		int actual = Search.linear(a, 9);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLinearNotExistingVal()
	{
		int expected = -1;
		int actual = Search.linear(a, 111);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLinearEmptyArray()
	{
		int expected = -1;
		int actual = Search.linear(aEmpty, 1);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testLinearOneElementArrayFound()
	{
		int expected = 0;
		int actual = Search.linear(aOne, 4);
		assertEquals(expected, actual);
	}
	@Test
	public void testLinearEmptyOneElementArrayFound()
	{
		int expected = -1;
		int actual = Search.linear(aEmpty, 111);
		assertEquals(expected, actual);
	}
}
