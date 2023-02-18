/*
	Cao, Brian 
                        
    October 21, 2021
                        
    CS A170    
    Ch5 Task 2: Value-returning methods
*/

import java.util.Scanner;
public class Dimensions 
{


	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the length, width and height dimensions:");
		int sideLength = in.nextInt();
		int sideWidth = in.nextInt();
		int sideHeight = in.nextInt();
		
		System.out.println("Which formula do you want to invoke? Enter CV for volume of a cube or RPV for volume of a rectangular prism");
		String formula = in.next();
		if (formula.equalsIgnoreCase("CV"))
		{
			System.out.println("The volume of the cube using length is: ");
			System.out.println(cubeVolume(sideLength));
			System.out.println("The volume of the cube using width is: ");
			System.out.print(cubeVolume(sideWidth));
		}
		if (formula.equalsIgnoreCase("RPV"))
		{
		System.out.println("The volume of the rectangular prism is: ");
		System.out.println(rectangularPrismVolume(sideWidth,sideHeight,sideLength));
		}
	}

	public static double cubeVolume(double sideLength)
	{
		double cubeVolume = sideLength * sideLength * sideLength;
		return cubeVolume;
	}
	
	public static double rectangularPrismVolume(double sideWidth, double sideHeight, double sideLength)
	{
		double rectangularPrismvolume = sideWidth * sideHeight * sideLength;
		return rectangularPrismvolume;
	}
	
}
