/*
    Cao, Brian 
    Garcia, Benjamin
                        
    October 18, 2021
    
    Professor Mayada Alani      
                
    CS A170    
    
    Project Two: Pizza Order
*/


import java.util.Scanner;

public class PizzaOrder
{
	//Main method for the whole menu
	public static void main(String[] args) 
	{
		boolean discountEligible = discount();
	
		int pizzaSize = pizzaMenu();
		double pizzaSizeCost = pizzaSizeCost(pizzaSize);
				
		String pizzaCrust = pizzaCrustChoice(pizzaCrust());
					
		int numberOfToppings = pizzaNumberToppings(pizzaSize, pizzaCrust);
	
		receipt(numberOfToppings, pizzaSizeCost, discountEligible);
	}				

	//Returns the condition for a $2 discount based on the name of the user
	public static boolean discount()
	{
    Scanner input = new Scanner(System.in);
    boolean nameDiscount = false;
		System.out.println("Welcome to Brian and Benjamin's Pizzeria");
		System.out.println("Enter your first name: ");
    String name = input.next();
    if(name.toLowerCase().equals("benjamin") || name.toLowerCase().equals("brian"))
		{
			nameDiscount = true;
			System.out.println("You are eligible for a $2.00 discount.");
		}
    return nameDiscount;
	}
				
	
	//Task #1 Prompt for ordering the type of pizza
	public static int pizzaMenu()
	{
    Scanner input = new Scanner(System.in);
		System.out.println("Pizza Size (inches)    Cost\n" +
                    "       10                $10.99\n" +
                    "       12                $12.99\n" +
                    "       14                $14.99\n" +
                    "       16                $16.99\n");
		System.out.println("What size pizza would you like?");
		System.out.println("10, 12, 14, or 16 (enter the number only): ");		
    int pizzaSize = input.nextInt();
    if (pizzaSize != 10 && pizzaSize != 12 && pizzaSize != 14 && pizzaSize != 16)
    {
    	pizzaSize = 12;
    }
    return pizzaSize;
	}
	
	//User inputs on what type of crust is chosen
	public static String pizzaCrust()
	{		
    Scanner input = new Scanner(System.in);
		System.out.println("What type of crust do you want?");
		System.out.println("(H) Hand-tossed, (T) Thin-crust, or (D) Deep-dish	(enter H, T, or D)");
    String pizzaCrustType = input.next();
    return pizzaCrustType;
	}
	
	//Returns the type of crust chosen based on user input
	public static String pizzaCrustChoice(String pizzaCrustChoice)
	{
		String pizzaCrustType;
		switch (pizzaCrustChoice)
		{
		case "H":
				pizzaCrustType = "Hand-tossed";
				break;
		case "h":
				pizzaCrustType = "Hand-tossed";
				break;
		case "T":
				pizzaCrustType = "Thin-crust";
				break;
		case "t":
				pizzaCrustType = "Thin-crust";
				break;
		case "D":
				pizzaCrustType = "Deep-dish";
				break;
		case "d":
				pizzaCrustType = "Deep-dish";
				break;
		default:
				pizzaCrustType = "Hand-tossed";
				System.out.println("Input was not one of the choices, so a hand-tossed will be made");
				break;
		}
		return pizzaCrustType;
	}
	
	//Asks the user which toppings they want and returns the amount of different toppings chosen
	public static int pizzaNumberToppings(int pizzaSize, String pizzaCrust)
	{
    Scanner input = new Scanner(System.in);
		System.out.println("All pizzas come with cheese.");
		System.out.println("Additional toppings are $1.25 each, choose from:");
		System.out.println("Pepperoni, Sausage, Onion, Mushroom");		
		int numberOfToppings = 0; 
		
		System.out.println("Do you want Pepperoni? (Y/N): ");
		String pepperoni = input.next();
		
		System.out.println("Do you want Sausage? (Y/N): ");
		String sausage = input.next();
		
		System.out.println("Do you want Onion? (Y/N): ");
		String onion = input.next();
			
		System.out.println("Do you want Mushroom? (Y/N): ");
		String mushroom = input.next();
	
		if (pepperoni.equalsIgnoreCase("Y"))
		{
			numberOfToppings++;
		}
		if (sausage.equalsIgnoreCase("Y"))
		{
			numberOfToppings++;
		}
		if (onion.equalsIgnoreCase("Y"))
		{
	  	numberOfToppings++;
		}
		if (mushroom.equalsIgnoreCase("Y"))
		{
			numberOfToppings++;
		}
    System.out.println("Your order is as follows: ");
		System.out.println(pizzaSize + "-inch pizza");
		System.out.println(pizzaCrust + " crust");
		System.out.print("Cheese");
    if (pepperoni.equalsIgnoreCase("Y"))
		{
			System.out.print(", Pepperoni ");
		}
		if (sausage.equalsIgnoreCase("Y"))
	  {
			System.out.print(", Sausage");
		}
		if (onion.equalsIgnoreCase("Y"))
		{
			System.out.print(", Onion");
		}
		if (mushroom.equalsIgnoreCase("Y"))
		{
			System.out.print(", Mushroom");
		}
    return numberOfToppings;
	}	
	
	//Task #1 final order and price
	public static void receipt(int numberOfToppings, double pizzaSizeCost, boolean discountEligible)
  {
    double toppingCost = numberOfToppings * 1.25;
		double pizzaTotalCost = pizzaSizeCost + toppingCost;
		if (discountEligible == true)
		{
			pizzaTotalCost = pizzaTotalCost - 2;
		}
		double pizzaTax = .0795 * pizzaTotalCost;
		double pizzaTotalDue = pizzaTotalCost + pizzaTax;
		System.out.println();
		System.out.printf("The cost of your order is: $%.2f",pizzaTotalCost);
		System.out.println();
		System.out.printf("The tax is: $%.2f",pizzaTax);
		System.out.println();
		System.out.printf("The total due is: $%.2f",pizzaTotalDue);
		System.out.println();
		System.out.println("Your order will be ready for pickup in 30 minutes.");
	}
	
	
	//Calculates and returns the price of each size pizza
	public static double pizzaSizeCost(int sizeChoice)
	{
		double sizeCost = 0;
		if (sizeChoice == 10)
		{
			sizeCost = 10.99;
		}
		else if (sizeChoice == 12)
		{
			sizeCost = 12.99;
		}
		else if (sizeChoice == 14)
		{
			sizeCost = 14.99;
		}
		else if (sizeChoice == 16)
		{
			sizeCost = 16.99;
		}
		else 
		{
			System.out.println("Not a size, so a 12 inch pizza will be made.");
      sizeCost = 12.99;
		}
		return sizeCost;
	}
}