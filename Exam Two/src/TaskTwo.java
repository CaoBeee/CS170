import java.util.Scanner;
public class TaskTwo 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[][] array = new int[2][3];
		
		for (int i = 0; i < array.length; i++)
		{	
			
			for (int j = 0; j < array[i].length; j++)
			{
				array[i][j] = input.nextInt();
			}
		}
		
		sums(array);
		

	}
	
	public static void sums(int[][] array)
	{
		int sum = 0;
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
			sum+= array[i][j];	
			}
			
		}
		
	}

}
