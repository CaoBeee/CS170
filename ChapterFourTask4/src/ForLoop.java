/*
	Cao, Brian 
                        
    October 12, 2021
                        
    CS A170    
    Ch4 Task 4: For Loop
*/

public class ForLoop 
{

	public static void main(String[] args) 
	{
		int sum = 0;
		for (int x = 0; x <= 50; x += 2)
		{
			
			sum = sum + x;
		}
		System.out.println("The result of all even numbers between 0 and 50 is " + sum);
	}
	
	

}
