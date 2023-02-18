/*
	Cao, Brian 
                        
    October 21, 2021
                        
    CS A170    
    Ch6 Task 3: Arrays and Methods
*/

import java.util.Scanner;
public class ArrayAndMethods 
{

	public static void main(String[] args)
	{
		int[] numbers = new int[8];
		input(numbers);
		
		System.out.println("The array is: ");
		for (int element : numbers)
		{
			System.out.print(element + " ");
		}

		System.out.println();
		System.out.println("The sum of this array is: " + summing(numbers));
		
		System.out.println("This array doubled is: ");
		doubling(numbers);
		for (int element : numbers)
		{
			System.out.print(element + " ");
		}
		
		System.out.println();
		System.out.println("The evens of this array are: ");
		int[] onlyEvens = evens(numbers);
		for (int element : onlyEvens)
		{
			System.out.print(element + " ");
		}
	}
	
	public static void input(int[] array)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter the values for the array: ");
		
		for (int i = 0; i < array.length; i++)
		{
			array[i] = input.nextInt();
		}
	}
	
	public static int summing(int[] array)
	{
		int sum = 0;
		for (int element : array)
		{
			sum+= element;
		}
		
		return sum;
	}
	
	public static void doubling(int[] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			array[i] = array[i] * 2;
		}
	}
	
	public static int[] evens(int[] array)
	{
		int[] evenElements = new int[array.length/2];
		
		for (int i = 0; i < array.length/2;i++)
		{
			if (array[i] % 2 == 0)
			{
				evenElements[i] = array[i*2];
			}
		}
		return evenElements;
	}
}
