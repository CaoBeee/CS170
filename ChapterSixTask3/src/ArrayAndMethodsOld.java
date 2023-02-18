/*
	Cao, Brian 
                        
    October 21, 2021
                        
    CS A170    
    Ch6 Task 1: Char Array
*/

import java.util.Scanner;

public class ArrayAndMethodsOld 
{

	public static void main(String[] args) 
	{
		int[] numbers = new int[10];
		input(numbers);
		
		//for (int i = 0; i < empty.length; i++)
		for (int element : numbers)
		{
			System.out.println(element);
		}
		System.out.println("The sum of the numbers is: " + summing(numbers));
		
		doubling(numbers);
		System.out.print("The array with the all numbers doubled is: ");
		for (int element : numbers)
		{
			System.out.print(element + " ");
		}
		
		int[] onlyEvens = evens(numbers);
		System.out.print("\nThe even indices in the array are: ");
		for (int element : onlyEvens)
		{
			System.out.print(element + " ");
		}
	}

	public static void input(int[] emptyTwo)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter values for the array: ");
		for (int i = 0; i < emptyTwo.length; i++) 
		{
			emptyTwo[i] = in.nextInt();	
		}
	}

	
	public static int summing(int[] num2)
	{
		int sum = 0;
		for (int element : num2) 
		{
		sum+=element; 
		}
		return sum;
	}
	
	public static void doubling(int[] num3)
	{
		for (int i = 0; i < num3.length; i++)
		{
			num3[i] = num3[i] * 2;
		}
	}
	
	public static int[] evens(int[] num4)
	{
	
		int[] evenElements = new int[num4.length / 2];
	
			for (int i = 0; i < num4.length / 2; i++)
			{
				evenElements[i] = num4[i * 2];
			}
		return evenElements;
	}
	
}
