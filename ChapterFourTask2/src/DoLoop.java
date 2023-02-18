/*
	Cao, Brian 
                        
    October 12, 2021
                        
    CS A170    
    Ch4 Task 2: Do-Loop
*/

import java.util.Scanner;
public class DoLoop 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String input;
		do 
		{
			System.out.print("Hello");
			System.out.println();
			System.out.println("Do you want another greeting?");
			System.out.println("Press y for yes, n for no, ");
			System.out.print("and then press return:");
			input = in.next();
		}
		while (input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes"));
		System.out.println("Good-Bye");
	}
}
