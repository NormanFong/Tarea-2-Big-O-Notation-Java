package BigONotationPartial;

import java.util.*;

//C# TO JAVA CONVERTER TODO TASK: The interface type was changed to the closest equivalent Java type, but the methods implemented will need adjustment:
public class LogReader implements List<LogLine>
{
	private int counter = 0;

	public final Iterator<LogLine> iterator()
	{
		int N = 100000;
		int uniqueIPs = 90001;

		while (counter < N)
		{
//C# TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to the C# 'yield' keyword:
			yield return new LogLine(counter % uniqueIPs);
			counter++;
		}
	}

	public final Iterator GetEnumerator()
	{
		return this.iterator();
	}
}

