package demoList;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) 
	{
		List<String> words = new ArrayList<>();
		words.add("Java");
		words.add("hi");
		
		System.out.println ("words: "+ words);
		for(String w: words)
		{
			System.out.print(w + " ");
		}
	}

}
