/*
Cao, Brian

December 7, 2021

CS A170
Ch 7&9 Task 3: Command Line Arguments
*/

public class CommandLine 
{
	public static void main(String[] args = {"My", "favorite", "color", "is", "purple"})
	{
		for (int i = 0; i < args.length; i++)
		{
			args[0] = "My";
			args[1] = "favorite";
			args[2] = "color";
			args[3] = "is";
			args[4] = "purple";
			System.out.println("args["+ i + "]" +args[i]);
		}
	}
}
