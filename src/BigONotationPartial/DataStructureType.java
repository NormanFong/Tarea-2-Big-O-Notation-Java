package BigONotationPartial;

public enum DataStructureType
{
	List,
	HashSet;

	public static final int SIZE = java.lang.Integer.SIZE;

	public int getValue()
	{
		return this.ordinal();
	}

	public static DataStructureType forValue(int value)
	{
		return values()[value];
	}
}

