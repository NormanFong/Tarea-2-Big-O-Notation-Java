package BigONotationPartial;

public enum QuadraticExampleType
{
	CreateAllPairs;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static QuadraticExampleType forValue(int value)
	{
		return values()[value];
	}
}

