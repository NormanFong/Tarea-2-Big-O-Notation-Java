package BigONotationPartial;

import java.util.*;

public class Exponential
{
	static void main(String[] args)
	{
		Stopwatch stopWatch = new Stopwatch();
		stopWatch.Start();
		Exponential exponential = new Exponential();
		ExponentialExampleType exponentialExampleType = ExponentialExampleType.Fibonacci;
		switch (exponentialExampleType)
		{
			case ExponentialExampleType.Fibonacci:
				int n = 40; //8 40 80
				for (int i = 1; i <= n; i++)
				{
					long fibonacci = exponential.Fibonacci(i);
					System.out.printf("fibonacci %1$s = %2$s" + "\r\n", i, fibonacci);
				}
				break;
		}
//C# TO JAVA CONVERTER TODO TASK: The '0:0.00' format specifier is not converted to Java:
		System.out.printf("Time elapsed: {0:0.00} seconds" + "\r\n", Math.round((stopWatch.ElapsedMilliseconds / 1000.0) * Math.pow(10, 2)) / Math.pow(10, 2));
		new Scanner(System.in).nextLine();
	}

	/** Complexity: O(2^N)
	*/
	public final int Fibonacci(long n)
	{
		if (n < 0)
		{
			throw new RuntimeException("n can not be less than zero");
		}
		if (n <= 2)
		{
			return 1;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}
