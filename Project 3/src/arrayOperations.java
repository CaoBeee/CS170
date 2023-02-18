/*
	Cao, Brian
	Nguyen, Tran 
                        
    November 11, 2021
                        
    CS A170    
    Project 3: Task 5 - Array Operations
*/

public class arrayOperations 
{
	public static void main(String[] args) 
	{
		int[][] array = 
						{
							{1,2,3},
							{4,5,6},
							{7,8,9}
						};
		System.out.println("The sum of all values in the array is: " + getTotal(array));
		System.out.println("The average of all values in this array is: " + getAverage(array));
		System.out.println("The total for row 2 is: " + getRowTotal(array,1));
		System.out.println("The total for column 3 is: " + getColumnTotal(array,2));
		System.out.println("The highest value in this row 2 is: " + getHighestInRow(array,1));
		System.out.println("The lowest value in this row 2 is: " +  getLowestInRow(array,1));
			
	}
	
	public static int getTotal(int[][]array)
	{
		int total = 0;
			for (int i = 0; i < array.length; i++)
			{
				for (int j = 0; j < array[i].length; j++)
				{
					total += array[i][j];
				}
			}
		return total;
	}
	
	public static int getAverage(int[][]array)
	{
		int total = 0;
		int average = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				total+= array[i][j];
			}
		}
		average = total/(array.length * array[0].length);
		return average;
	}
	
	public static int getRowTotal(int[][]array, int row)
	{
		int rowTotal = 0;
		
		for (int i = 0; i < array[row].length; i++)
		{
			rowTotal += array[row][i];
		}
		return rowTotal;
	}
	
	public static int getColumnTotal(int[][]array, int column)
	{
		int columnTotal = 0;
		
		for (int i = 0; i < array[column].length; i++)
		{
			columnTotal += array[i][column];
		}
		return columnTotal;
	}
	
	public static int getHighestInRow(int [][] array, int row)
	{
		int rowMax = 0;
		
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				if (array[row][j] > rowMax)
				{
					rowMax = array[i][j];
				}
			}
		}
		return rowMax;
	}
	
	public static int getLowestInRow(int[][] array, int row)
	{
		int rowMin = Integer.MAX_VALUE;
		
		for (int i = 0; i < array.length;i++)
		{
			for (int j = 0; j < array[row].length; j++)
			{
				if (array[row][j] < rowMin)
				{
					rowMin=array[row][j];
					j++;
				}
			}
		}
		return rowMin;
	}
}


