/*
   Cao, Brian
   
   November 4, 2021
   
   CS A170
   Practice Exam Two
*/

public class TwoDArray 
{

	public static void main(String[] args) 
	{
		int[][] arr3 = 	{
							{ 25, 21, 2 },
							{ 11, 32, 5 },
							{ 10, 51, 4 }	
						};
		printArray(arr3);
	}
	
	public static void printArray (int[][] arr3)
	{
		int rows = 3;
		int columns = 3;
		int oddCounter = 0;
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < columns; j++)
			{
				if (arr3[i][j] % 2 == 1)
				{
					oddCounter++;
				}
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		
		}
		System.out.println("There are " + oddCounter + " odd numbers in the array.");
	}
	
}
