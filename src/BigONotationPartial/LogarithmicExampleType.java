package BigONotationPartial;

public enum LogarithmicExampleType
{
	BinarySearch;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static LogarithmicExampleType forValue(int value)
	{
		return values()[value];
	}
}


