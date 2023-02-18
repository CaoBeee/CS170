/*
    Cao, Brian
    Melendez, Oswaldo 
                        
    September 26, 2021
                        
    CS A170    
    Proj 1: Hour Converter
*/


import java.util.Scanner;
public class HourConverter 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		{
			System.out.println("Enter a number of hours: "); 	//user input # of days
			int numHours = in.nextInt();
			int numWeeks = (numHours / 168); 					//24 hours * 7 days in week = 168 Hours a week
			int numDays = numHours / 24 % 7;					//# of input hours divided 24 hours a day = # of days
			int leftHours = numHours % 24;						//remainder hours = total hours / 24 hours
								
			String totalHours = numHours + " is " + numWeeks + (" weeks, ") + numDays + (" days, and " + leftHours + " hours");
			
			System.out.print(totalHours);			
			in.close();
		}
	}
}
