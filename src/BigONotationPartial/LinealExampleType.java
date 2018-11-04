package BigONotationPartial;

public enum LinealExampleType
{
	Loop,
	ContainsNeedle,
	Factorial,
	Fibonacci,
	FibonacciCache;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static LinealExampleType forValue(int value)
	{
		return values()[value];
	}
}

