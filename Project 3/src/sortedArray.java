import java.util.Scanner;
public class sortedArray 
{

	public static void main(String[] args) 
	{
		int[] mathArray = new int[10];
		
		enterGrades(mathArray);
		for (int beforeSort : mathArray)
		{
			System.out.print(beforeSort + ", ");
		}
		System.out.println();
		selectionSort(mathArray);
		for (int afterSort : mathArray)
		{
			System.out.print(afterSort + ", ");
		}
		System.out.println();
		calculateMean(mathArray);
		
		
	}

	public static void enterGrades (int[] array)
	{
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++)
		{
			System.out.print("Enter score number " + (i+1) + ": ");
			array[i] = input.nextInt();
		}
	}

	public static void selectionSort(int[] array)
	{
		int startScan, index, minIndex, minValue;
		for (startScan = 0; startScan < (array.length-1); startScan++)
		{
			minIndex = startScan;
			minValue = array[startScan];
			for(index = startScan + 1; index < array.length; index++)
			{
				if (array[index] < minValue)
			{
			minValue = array[index];
			minIndex = index;
			}
			}
			array[minIndex] = array[startScan];
			array[startScan] = minValue;
		}
	}
	
	public static void calculateMean (int[] array)
	{
		
		int total = 0;
		for (int i = 0; i < array.length; i++)
		{
			total += array[i];
		}
		total = total / array.length;
		System.out.println("The mean of the grades is " + total);
	}
}
