/*
	Cao, Brian 
                        
    October 14, 2021
                        
    CS A170    
    Ch4 Task 7: Nested Loops
*/

public class NestedLoopsTwo 
{
	public static void main(String[] args) 
	{
		final int NMAX = 5;
		final double XMAX = 20;
		
		System.out.println("        1          2         3         4         5");
		System.out.println("       x          x         x         x         x");
		System.out.println();
		for (double x = 10; x <= XMAX; x= x + 2)
		{
			
			for  (int n = 1; n <= NMAX; n++)
			{
				System.out.printf("%10.0f", Math.pow(x, n));
			}
			System.out.println();
		}

		
	}
}
