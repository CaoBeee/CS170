/*
    Cao, Brian 
                        
    October 12, 2021
                        
    CS A170    
    Ch4 Task 1: WhileLoop
*/

public class WhileLoop 
{
	public static void main(String[] args) 
	{
		double interestRate = .07;
		double balance = 10000;
		int year = 0;
		
		while (balance < 20000)
			{
			balance = balance + (balance * interestRate);
			year++;
			}
		System.out.print("The investment doubled after " + year + " years.");
	}

}
