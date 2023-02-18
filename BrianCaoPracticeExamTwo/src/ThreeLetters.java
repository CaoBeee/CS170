/*
   Cao, Brian
   
   November 4, 2021
   
   CS A170
   Practice Exam Two
*/

import java.util.ArrayList;
public class ThreeLetters 
{

	public static void main(String[] args) 
	{
		String[] arr4 = {"Ann", "Adam", "Sarah", "Bo", "Jose", "Sue", "Koi"};
		System.out.print(arrayList(arr4));
	}

	public static ArrayList<String> arrayList (String[] arr4)
	{
		ArrayList<String> arr5 = new ArrayList<String>();
		
		for (int i = 0; i < arr4.length; i++)
		{
			if (arr4[i].length() <= 3)
			{
				arr5.add(arr4[i]);
			}
		}
		return arr5;
	}
}
