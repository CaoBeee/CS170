/*
    Cao, Brian          
                        
    September 14, 2021    
    
    CS A170             
    Ch2 Coding Assignment
*/
//Task Five: Paycheck

import java.util.Scanner;
public class TaskFive 
{
	
	public static void main(String[] args) 
	{

		Scanner in = new Scanner(System.in); //Hour Scanner
		{
			System.out.printf("Please enter the number of hours: ");
			int weeklyHours = in.nextInt();
		
			System.out.printf("Please enter the number of overtime hours: ");
			int overTimeHours = in.nextInt();
		
			System.out.printf("Please enter your hourly wage: ");
			int payRate = in.nextInt();
			
			double overTimePayRate = 1.5 * payRate;
			double totalPayCheck = (weeklyHours * payRate) + (overTimePayRate * overTimeHours);
			
			System.out.print("This week I worked " + weeklyHours + " hours and my paycheck is ");
			System.out.printf("$%.2f",totalPayCheck);
			
		in.close();
		}
	}
}

