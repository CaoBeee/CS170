/*
    Cao, Brian          
                        
    September 14, 2021    
    
    CS A170             
    Ch2 Coding Assignment
*/
//Task Six: Temperature Conversion

import java.util.Scanner;
public class FahrenheitToCelsius 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		{
			System.out.println("Enter the degree of the temperature in fahrenheit: ");
			int farTemp = in.nextInt();
			
			float celTemp = ((farTemp -32) * 5/9f);
			System.out.print("The temperature in Celsius is ");
			System.out.printf("%.3f", celTemp);
			
			in.close();
		}
		
	}

}
