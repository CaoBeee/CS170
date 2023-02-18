/*
	Cao, Brian 
                        
    October 21, 2021
                        
    CS A170    
    Ch6 Task 4: 2-D Arrays
*/

public class TotalMedals 
{
	public static void main(String[] args) 
	{
		int [][] counts = 
			{
					{ 1, 0, 1 },
					{ 1, 1, 0 },
					{ 0, 0, 1 },
					{ 1, 0, 0 },
					{ 0, 1, 1 },
					{ 0, 1, 1 },
					{ 1, 1, 0 }
			};
		System.out.print("	Country	    Gold   Silver   Bronze   Total");
		totalMedals(counts);
	}

	public static void totalMedals(int[][] countsarray)
	{
		final int COUNTRIES = 7;
		final int MEDALS = 3;
		
		String[] countries = 
			{
					"Canada",
					"China",
					"Germany",
					"Korea",
					"Japan",
					"Russia",
					"United States"
			};
		 for (int i = 0; i < COUNTRIES; i++)
			{
				System.out.println();
				System.out.printf("%15s", countries[i]);
							
				int total = 0;
				for (int j = 0; j < MEDALS; j++)
				{
					System.out.printf("%8d", countsarray[i][j]);
					total = total + countsarray[i][j];
				}
					System.out.printf("%8d", total);
			} 
	}
}	