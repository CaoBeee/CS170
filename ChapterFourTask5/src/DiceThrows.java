/*
	Cao, Brian 
                        
    October 14, 2021
                        
    CS A170    
    Ch4 Task 8: Math.random Method
*/

public class DiceThrows 
{
	public static void main(String[] args) 
	{
		for (int i = 1; i <= 10; i++)
		{
			int d1 = (int) (Math.random() * 6) + 1;
			int d2 = (int) (Math.random() * 6);
			System.out.println(d1 + " " + d2);
		}
			System.out.println();
	}
}
