/*
	Cao, Brian 
                        
    October 21, 2021
                        
    CS A170    
    Ch5 Task 3: Simple Calculator
*/

import java.util.Scanner;
public class SimpleCalculator 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter two integers: ");
		double x = in.nextDouble();
		double y = in.nextDouble();
		
		System.out.println("The sum of " + x + " and " + y + " is " + addition(x,y));
		System.out.println("The difference of " + x + " and " + y + " is " + subtraction(x,y));
		System.out.println("The product of " + x + " and " + y + " is " + multiplication(x,y));
		System.out.println("The quotient of " + x + " and " + y + " is " + division(x,y));
	}

	public static double addition(double x,double y)
	{
		double addition = x + y;
		return addition;
	}
	
	public static double subtraction(double x,double y)
	{
		double subtraction = x - y;
		return subtraction;
	}
	
	public static double multiplication(double x,double y)
	{
		double multiplication = x * y;
		return multiplication;
	}
	public static double division(double x,double y)
	{
		double division = x / y;
		return division;
	}
	
}
