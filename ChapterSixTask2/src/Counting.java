/*
	Cao, Brian 
                        
    October 21, 2021
                        
    CS A170    
    Ch6 Task 2: Counting Odds and Zeros
*/

public class Counting 
{

	public static void main(String[] args) 
	{
		int[] numbers = {4, 0, 7, 2, 11, 6, 0, 3, 0, 9};
		
		int numZeros = 0;
		int numOdd = 0;
		
		for (int i = 0; i < numbers.length; i++)
		{
			if (numbers[i] == 0)
				numZeros++;
			if(numbers[i] % 2 == 1)
				numOdd++;
		}
		System.out.print("There are " + numZeros + " zeros and " + numOdd + " odd numbers in this array.");
	}

}
