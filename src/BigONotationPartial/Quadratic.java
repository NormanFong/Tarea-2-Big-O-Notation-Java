package BigONotationPartial;

import java.util.*;

public class Quadratic
{
	static void main(String[] args)
	{
		Quadratic quadratic = new Quadratic();
		QuadraticExampleType quadraticExampleType = QuadraticExampleType.CreateAllPairs;
		switch (quadraticExampleType)
		{
			case QuadraticExampleType.CreateAllPairs:
				int n = 5;
				quadratic.CreateAllPairs(n);
				break;
		}
		new Scanner(System.in).nextLine();
	}

	/** Complexity: O(N^2)
	*/
	public final void CreateAllPairs(int n)
	{
		int x = 1;
		while (x <= n)
		{
			int y = 1;
			while (y <= n)
			{
				System.out.printf("%1$s, %2$s" + "\r\n", x, y);
				y++;
			}
			x++;
		}
	}
}
