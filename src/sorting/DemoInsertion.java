package sorting;

import java.util.Arrays;

import edu.princeton.cs.algs4.Selection;
import edu.princeton.cs.algs4.StdOut;

public class DemoInsertion
{

	public static void main(String[] args)
	{
		String[] words = {"day" , "ape" , "the" , "yes", "gpa" , "all", "Ute", "CIS", "MLA", "IPG", "May"};
		StdOut.println("words: " + Arrays.toString(words));
		Selection.sort(words);
		StdOut.println("sorted words: "+ Arrays.toString(words));
		Selection.sort(words, String.CASE_INSENSITIVE_ORDER);
		StdOut.println("sorted words: "+ Arrays.toString(words));
	}

}
