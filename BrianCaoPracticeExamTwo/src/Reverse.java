/*
   Cao, Brian
   
   November 4, 2021
   
   CS A170
   Practice Exam Two
*/

public class Reverse 
{

	public static void main(String[] args) 
	{
		int[] arr1 = {1,2,3,4,5,6,7,8,9};
		
		System.out.print("The values of arr1 are: ");
		for (int array1 : arr1)
		{
			System.out.print(array1 + "|");
		}
		System.out.println();
		System.out.print("The values of arr2 are: ");
		for (int reversearray : reverse(arr1))
		{
			System.out.print(reversearray + "|");
		}
		
	}

	public static int[] reverse (int arr1[])
	{
		int[] arr2 = arr1;
		int i = 0;
		
		while (i < (arr2.length / 2))
		{
			int temp = arr1[i]; 					//store the original array in a temp array
			arr2[i] = arr1[arr1.length - i - 1]; 	//set the array[i] to be reversed to count from the end of the original array backwards
			arr2[arr1.length - i - 1] = temp; 		//set the array to be reversed starting backwards to arr2[length of orig array - i - 1] to temp
			i++;
		}
		return arr2;
	}
}