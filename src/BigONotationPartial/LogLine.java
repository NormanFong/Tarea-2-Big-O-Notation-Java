package BigONotationPartial;

public class LogLine
{
	private int counter;
	public LogLine(int counter)
	{
		this.counter = counter;
	}

	public final String GetIP()
	{
		return "ip-" + counter;
	}
}

