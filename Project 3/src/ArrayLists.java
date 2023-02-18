/*
	Cao, Brian 
	Nguyen, Tran
                        
    November 11, 2021
                        
    CS A170    
    Project 3: Task 6 - Best Customer
*/

import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLists 
{

	public static void main(String[] args) 
	{
		Scanner cashier = new Scanner(System.in);
		ArrayList<Double> sales = new ArrayList<Double>();
		ArrayList<String> customer = new ArrayList<String>();
		
			{
				double price = 1;
				int i = 0;
				while (price != 0)
				{
					System.out.println("Enter 0 if finished.");
					System.out.print("Purchase of customer " + (i+1) + ": \n");
					price = (cashier.nextDouble());
					sales.add(price);
					
					if (price > 0)
					{
					System.out.print("Name of customer " + (i+1) + ": \n");
					customer.add(cashier.next());
					}
					i++;
				}
			}
		System.out.print("The best customer is: " + nameOfBestCustomer(sales,customer));
	}

	public static String nameOfBestCustomer (ArrayList<Double> sales, ArrayList<String> customers)
	{
		String bestCustomer = "";
		double maxSale = 0;
		
		for (int i = 0; i < sales.size(); i++)
			{
				if (sales.get(i) > maxSale) 
				{
				maxSale = sales.get(i);
				bestCustomer = customers.get(i);
				}
			}
		return bestCustomer;
	}


}