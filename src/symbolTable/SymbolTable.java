package symbolTable;

import java.awt.RenderingHints.Key;

import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class SymbolTable
{
	public static void main(String[] args)
	{
		ST<String, String> colors = new ST<String, String>();
		colors.put("red", "990000");
		colors.put("blue", "000099");
		colors.put("lime", "66CC00");
		colors.put("yellow", "FFFF00");
		colors.put("orange", "FF6600");

		colors.put("white", "000000");

		StdOut.println("Output1:");
		for (String key : colors.keys())
		{ 
			StdOut.printf("%-10s %-10s %n" , key, colors.get(key));
		}

		StdOut.println();
		colors.put("white", "FFFFFF");
		colors.delete("yellow");
		StdOut.println("White has been updated");
		StdOut.println("Yellow has been removed");
		StdOut.println();
		StdOut.println("Output2:");
		
		for (String key : colors.keys())
		{ 
			StdOut.printf("%-10s %-10s %n" , key, colors.get(key));
		}
		
		StdOut.println();
		StdOut.printf("%-10s %-10s %n","Min: ", colors.min());
		StdOut.printf("%-10s %-10s %n","Max: " , colors.max());
		StdOut.println("Floor(\"magenta\"): " + colors.floor("magenta"));
		StdOut.println("Ceiling(\"magenta\") :" + colors.ceiling("magenta"));
	} 
}
