/*
    Cao, Brian          
                        
    September 14, 2021    
    
    CS A170             
    Ch2 Coding Assignment
*/
//Task Seven: Day Converter

import java.util.Scanner;
public class DayConverter 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		{
			System.out.println("Enter number of days: ");
			int numDays = in.nextInt(); 													//user input # of days
			
			double secondsInMin = 60;														// 60 seconds in a minute
			double minutesPerHour = 60;														// 60 minutes in an hour
			int hoursDay = 24;																// 24 hours in a day
			int daysToHours = numDays * hoursDay;											// days * 24 hours
			double daysToMins = (numDays * hoursDay) * minutesPerHour;						// (days * 24 hours) * 60 minutes
			double daysToSeconds = ((numDays * hoursDay) * minutesPerHour * secondsInMin);	// (days * 24 hours) * 60 minutes * 60 seconds
			
			System.out.print(numDays);
			System.out.print(" days is ");
			System.out.print(daysToHours);
			System.out.print(" hours or ");
			System.out.printf("%.0f", daysToMins);
			System.out.print(" minutes ");
			System.out.printf("%.0f", daysToSeconds);
			System.out.print(" seconds ");
			
			in.close();
		}
	}

}
