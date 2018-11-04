package BigONotationPartial;

import java.util.*;


public class Lineal
{
	private long[] fibonacciCache = null;

	static void main(String[] args)
	{
		Stopwatch stopWatch = new Stopwatch();
		stopWatch.Start();
		Lineal lineal = new Lineal();
		LinealExampleType linealExampleType = LinealExampleType.Fibonacci;
		int nFibonacciCache = 80; //8 40 80
		lineal.fibonacciCache = new long[nFibonacciCache + 1];
		switch (linealExampleType)
		{
			case LinealExampleType.Loop:
				int n = 50;
				lineal.Loop(n);
				break;
			case LinealExampleType.ContainsNeedle:
				ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(new Integer[] {10, 18, 29, 1, 0, 75, 79}));
				int needle = 76;
				boolean found = lineal.ContainsNeedle(needle, numberList);
				System.out.printf("Number %1$s found? %2$s" + "\r\n", needle, found);
				break;
			case LinealExampleType.Factorial:
				int nFactorial = 10;
				long factorial = lineal.Factorial(nFactorial);
				System.out.printf("Factorial of %1$s equal to %2$s" + "\r\n", nFactorial, factorial);
				break;
			case LinealExampleType.Fibonacci:
				int nFibonacci = 80; //8 40 80
				for (int i = 1; i <= nFibonacci; i++)
				{
					long fibonacci = lineal.Fibonacci(i);
					System.out.printf("fibonacci %1$s = %2$s" + "\r\n", i, fibonacci);
				}
				break;
			case LinealExampleType.FibonacciCache:
				for (int i = 1; i <= nFibonacciCache; i++)
				{
					long fibonacci = lineal.FibonacciCache(i);
					System.out.printf("fibonacci %1$s = %2$s" + "\r\n", i, fibonacci);
				}
				break;
		}
//C# TO JAVA CONVERTER TODO TASK: The '0:0.00' format specifier is not converted to Java:
		System.out.printf("Time elapsed: {0:0.00} seconds" + "\r\n", Math.round((stopWatch.ElapsedMilliseconds / 1000.0) * Math.pow(10, 2)) / Math.pow(10, 2));
		new Scanner(System.in).nextLine();
	}

	/** Complexity: O(N)
	*/
	public final void Loop(long n)
	{
		int counter = 1;
		while (counter <= n)
		{
			System.out.println(counter);
			counter++;
		}
	}

	/** Complexity: O(N)
	*/
	public final boolean ContainsNeedle(int needle, ArrayList<Integer> numberList)
	{
		for (int item : numberList)
		{
			if (item == needle)
			{
				return true;
			}
		}
		return false;
	}

	/** Complexity: O(N)
	*/
	public final long Factorial(int n)
	{
		if (n == 1)
		{
			return 1;
		}
		return n * Factorial(n - 1);
	}

	/** Complexity: O(N)
	*/
	public final long Fibonacci(long n)
	{
		if (n < 0)
		{
			throw new RuntimeException("n can not be less than zero");
		}
		if (n <= 2)
		{
			return 1;
		}
		long fibonacci = 0;
		long previous = 1;
		long penultimate = 0;
		for (int i = 1; i <= n; i++)
		{
			penultimate = fibonacci;
			fibonacci = previous + fibonacci;
			previous = penultimate;
		}
		return fibonacci;
	}

	/** Complexity: O(N)
	*/
	public final long FibonacciCache(long n)
	{
		if (n < 0)
		{
			throw new RuntimeException("n can not be less than zero");
		}
		if (n <= 2)
		{
			fibonacciCache[n] = 1;
		}
		if (fibonacciCache[n] == 0)
		{
			fibonacciCache[n] = FibonacciCache(n - 1) + FibonacciCache(n - 2);
		}
		return fibonacciCache[n];
	}

}
