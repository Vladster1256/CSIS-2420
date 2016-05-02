package bst;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdOut;

public class TimeApp
{

	public static void main(String[] args)
	{
		Time t = new Time(6,5,10);
		Time t1 = new Time(5,7,23);
		
		Time[] times = {t, t1, new Time(2,5,23)};
		Arrays.sort(times);
		
	}

}
