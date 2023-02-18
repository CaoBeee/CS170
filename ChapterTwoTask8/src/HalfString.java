/*
    Cao, Brian          
                        
    September 16, 2021    
    
    CS A170             
    Ch2 Coding Assignment
*/
//Task Eight: Half Strings

import java.util.Scanner;
public class HalfString 
{
	public static void main(String[] args) 
	{		
		Scanner in = new Scanner(System.in);
		{
			System.out.println("Please enter an even length string: ");
			String yourString = in.next();
			System.out.println("half the string is: " + yourString.substring(0, yourString.length() /2));
			
		}
	}
}
