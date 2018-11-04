package BigONotationPartial;

import java.util.*;

public class Logarithmic
{
	static void main(String[] args)
	{
		Logarithmic logarithmic = new Logarithmic();
		LogarithmicExampleType quadraticExampleType = LogarithmicExampleType.BinarySearch;
		switch (quadraticExampleType)
		{
			case LogarithmicExampleType.BinarySearch:
				ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(new Integer[] {1, 3, 3, 7, 10, 11, 16, 17, 20, 21, 25, 26, 30, 32, 34, 35}));
				int needle = 26;
				int min = 0;
				Integer position = logarithmic.BinarySearch(numberList, needle, min, numberList.size() - 1);
				position = (position != null) ? position : -1;
				System.out.printf("Position: %1$s" + "\r\n", position);
				break;
		}
		new Scanner(System.in).nextLine();
	}

	/** Complexity: O(log2 N)
	*/
	public final Integer BinarySearch(ArrayList<Integer> numberList, int needle, int min, int max)
	{
		int midpoint = (max + min) / 2;
		if (!numberList.isEmpty() && numberList.get(midpoint).equals(needle))
		{
			return midpoint;
		}
		if (min >= max)
		{
			return null;
		}
		if (numberList.get(midpoint).compareTo(needle) > 0)
		{
			return BinarySearch(numberList, needle, min, midpoint - 1);
		}
		return BinarySearch(numberList, needle, midpoint + 1, max);
	}
}

