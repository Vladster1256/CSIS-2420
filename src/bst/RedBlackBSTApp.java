package bst;

import edu.princeton.cs.algs4.StdOut;

public class RedBlackBSTApp
{

	public static void main(String[] args)
	{
		Time t = new Time(6, 5, 10);
		Time t1 = new Time(5, 7, 23);
		Time[] times = { t, t1, new Time(2, 5, 23) };
		
		RedBlackBST<Time, Integer> st = new RedBlackBST<Time, Integer>();
		for (int i = 0; i < times.length; i++)
		{
			Time key = times[i];
			st.put(key, i);
		}
		for (Time s : st.keys())
			StdOut.println(s + " " + st.get(s));
		StdOut.println();

	}

}
