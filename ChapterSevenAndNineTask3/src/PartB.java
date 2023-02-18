/*
Cao, Brian

December 7, 2021

CS A170
Ch 7&9 Task 3: Command Line Arguments
*/

public class PartB
{

	public static void main(String[] args) 
	{

		for (int i = 0; i < args.length ; i++)
		{
			args[0] = "kim";
			args[1] = "andy";
			args[2] = "mary";
			args[3] = "jose";
			args[4] = "khoi";
			args[5] = "omar";
			args[6] = "maryam";
			args[7] = "henry";
			args[8] = "emma";
			if (args[i].contains("ma") & args[i].length() < 5)
			{
			System.out.println("args["+ i + "]" +args[i]);
			}
		}
	}

}
