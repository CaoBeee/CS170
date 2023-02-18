/*
Cao, Brian

December 7, 2021

CS A170
Ch 7&9 Task 3: Command Line Arguments
*/

public class PartC
{

	public static void main(String[] args) 
	{
		double total = 0;
		double count = 0;
		for (int i = 0; i < args.length ; i++)
		{
			args[0] = "2";
			args[1] = "11";
			args[2] = "10";
			args[3] = "4";
			args[4] = "5";
			args[5] = "7";
			args[6] = "14";
			args[7] = "4";
			if (Double.parseDouble(args[i]) < 7)
			{
				total += Double.parseDouble(args[i]);
				count++;
			}
		}
		System.out.println("The average of all numbers less than 7 is: " + total/count);
	}

}
