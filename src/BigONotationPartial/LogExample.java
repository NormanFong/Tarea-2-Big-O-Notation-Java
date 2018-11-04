package BigONotationPartial;

import java.util.*;

import com.google.common.base.Stopwatch;

public class LogExample
{
	static void main(String[] args)
	{
		Stopwatch stopWatch = new Stopwatch();
		stopWatch.Start();
		System.out.println("Starting...");
		LogExample logExample = new LogExample();
		System.out.println("Step 1: Reading Log Items...");
		int lineCount = logExample.ReadAllLogs();
//C# TO JAVA CONVERTER TODO TASK: The '0:n0' format specifier is not converted to Java:
		System.out.printf("{0:n0} Log Items Read" + "\r\n", lineCount);
		System.out.println("Step 2: Counting Unique IPs...");
		int ipCount = logExample.CountUniqueIPs();
		System.out.println("Number of unique IPs: " + ipCount);
//C# TO JAVA CONVERTER TODO TASK: The '0:0.0' format specifier is not converted to Java:
		System.out.printf("Time elapsed: {0:0.0} seconds" + "\r\n", Math.round((stopWatch.ElapsedMilliseconds / 1000.0) * Math.pow(10, 2)) / Math.pow(10, 2));
		new Scanner(System.in).nextLine();
	}

	private int ReadAllLogs()
	{
		LogReader logReader = new LogReader();
		int linesSeen = 0;
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
		for (var line : logReader)
		{
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
			var ip = line.GetIP();
			linesSeen++;
		}
		return linesSeen;
	}

	private int CountUniqueIPs()
	{
		LogReader logReader = new LogReader();
		DataStructureType dataStructureType = DataStructureType.List;
		Collection<String> ipsSeen = null;
		switch (dataStructureType)
		{
			case DataStructureType.List:
				ipsSeen = new ArrayList<String>();
				break;
			case DataStructureType.HashSet:
				ipsSeen = new HashSet<String>();
				break;
			default:
				ipsSeen = new ArrayList<String>();
				break;
		}
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
		for (var logLine : logReader)
		{
//C# TO JAVA CONVERTER TODO TASK: There is no equivalent to implicit typing in Java:
			var ip = logLine.GetIP();
			if (!ipsSeen.contains(ip))
			{
				ipsSeen.add(ip);
			}
		}
		return ipsSeen.size();
	}
}

