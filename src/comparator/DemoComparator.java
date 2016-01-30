package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class DemoComparator
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> wordArray = new ArrayList<String>();
		String userinput;
		Boolean quit = false;

		while (quit == false)
		{

			userinput = scanner.nextLine();
			if (userinput.equalsIgnoreCase("done"))
			{
				Collections.sort(wordArray, String.CASE_INSENSITIVE_ORDER);
				for (int i = 0; i < wordArray.size(); i++)
				{
					System.out.println(wordArray.get(i));

				}
				System.out.println("");
				Collections.sort(wordArray, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));
				for (int i = wordArray.size() - 1; i >= 0; i--)
				{
					System.out.println(wordArray.get(i));

				}
				quit = true;
				System.exit(0);
			} else
			{
				wordArray.add(userinput);
			}
		}
	}
}
