/*
	Cao, Brian 
                        
    October 21, 2021
                        
    CS A170    
    Ch5 Task 4: Recursion
*/
import java.util.Scanner;
public class RecursiveTriangles 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the side length of a triangle: ");
		int sideLength = in.nextInt();
		printTriangles (sideLength);
	}

	public static void printTriangles(int sideLength)
	{
		if (sideLength < 1)
		{
			return;
		}
		
		printTriangles (sideLength - 1);
		for (int i = 0; i < sideLength; i++)
		{
			System.out.print("[]");
		}
		System.out.println();
	}
}
