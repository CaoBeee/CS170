/*
	Cao, Brian 
                        
    October 12, 2021
                        
    CS A170    
    Ch4 Task 5: Sentinel Values for terminating loops
*/

import java.util.Scanner;
public class SentinelValues 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		double salary = 0;
		int count = 0;
		double sum = 0;
		double average = 0;
		
		System.out.println("Enter your salaries, or enter -1 to terminate: ");
		while (salary != -1)
		{
			count++;
			salary = input.nextDouble();
			
			
			if (salary != -1)
			{
				sum = sum + salary;
				average = sum/count;
				if (count > 3 && sum > 0)
				{
					System.out.printf("Your average salary is $%.2f",average);
				}
				
			}
			if (salary == -1 && sum == 0)
			{
				System.out.println("No Data");
			}
		}
					
	}	
}	

