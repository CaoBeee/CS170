/*
Cao, Brian

December 7, 2021

CS A170
Ch 7&9 Task 1: Files\Exceptions
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class UsingInputOutputFiles {

	public static void main(String[] args) throws FileNotFoundException 
	{
		
		//set up input and output objects
		File myFile = new File("input.txt"); // remember to use next()
		Scanner in = new Scanner(myFile);
		PrintWriter out = new PrintWriter("output.txt");
		
		//Read input and write output
		int total = 0;
		
		while (in.hasNext())
		{
			int value = in.nextInt();
			System.out.println(value);
			out.println(value);
			total = total + value;
		}
		System.out.println(total);
		out.print(total);
		in.close();
		out.close();
	}

}
