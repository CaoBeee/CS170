/*
Cao, Brian

December 7, 2021

CS A170
Ch 7&9 Task 2: Arrays of Objects (Strings) and Files
*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.*;
public class CompactDisk
{

	public static void main(String[] args) throws FileNotFoundException 
	{
		File myFile = new File("Classics.txt");
		Scanner input = new Scanner(myFile);
		PrintWriter out = new PrintWriter("output.txt");
		String title;
		String artist;
		
		String[] CD = new String[6];
		
		System.out.println("Contents of Classics:");
		System.out.println("========================");
	
		for (int i = 0; i < CD.length; i++)
		{
			title = input.nextLine();
			artist = input.nextLine();
			CD[i] = title + " by " + artist;
			out.println(CD[i]);
			System.out.println(CD[i]);
		}
		input.close();
		out.close();
	}

}
