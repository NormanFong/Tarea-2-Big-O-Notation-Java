package BigONotationPartial;

public enum ExponentialExampleType
{
	Fibonacci;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static ExponentialExampleType forValue(int value)
	{
		return values()[value];
	}
}

