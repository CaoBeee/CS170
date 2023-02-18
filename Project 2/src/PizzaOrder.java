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

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		boolean discount = false;
		System.out.println("Welcome to Brian and Benjamin's Pizzeria");
		System.out.println("Enter your first name: ");
		String name = input.next();

		//Pizza sizes
		System.out.println("Pizza Size (inches)       Cost\n" +
                       "       10                $10.99\n" +
                       "       12                $12.99\n" +
                       "       14                $14.99\n" +
                       "       16                $16.99\n");

		//discount eligible
		if(name.toLowerCase().equals("benjamin") || name.toLowerCase().equals("brian"))
		{
			discount = true;
			System.out.println("You are eligible for a $2.00 discount.");
		}

		//asks the user what size pizza they want
		System.out.println("What size pizza would you like?");
		int size = input.nextInt();
		double pizzaSizeCost;
		
		if(size == 10)
		{
			pizzaSizeCost = 10.99;
		}
		else if(size == 12)
		{
			pizzaSizeCost = 12.99;
		}
		else if(size == 14)
		{
			pizzaSizeCost = 14.99;
	    }
	    else if(size == 16)
	    {
	    	pizzaSizeCost = 16.99;
	    }
	    else
	    {
			System.out.println("Not a size, so a 12 inch pizza will be made.");
			size = 12;
			pizzaSizeCost = 12.99;
	    }
		
		
		
		
		
		
		//asks user for what type of crust they want
		System.out.println("What type of crust do you want?");
		System.out.println("(H) Hand-tossed, (T) Thin-crust, or (D) Deep-dish	(enter H, T, or D)");
		String typePizza = input.next();
		typePizza = typePizza.toUpperCase();
		char pizzaType = typePizza.charAt(0);
		switch (pizzaType)
		{
		case 'H':
					typePizza = "Hand-tossed";
					break;
		case 'T':
					typePizza = "Thin-crust";
					break;
		case 'D':
					typePizza = "Deep-dish";
					break;
		default:
					typePizza = "Hand-tossed";
					System.out.println("Input was not one of the choices, so a hand-tossed will be made");
					break;
		}
		
		
		//Asks the user to input Y or N for topping choices
		int toppingcounter = 0;
			
		System.out.println("All pizzas come with cheese.");
		System.out.println("Additional toppings are $1.25 each, choose from:");
		System.out.println("Pepperoni, Sausage, Onion, Mushroom");
			
		System.out.println("Do you want Pepperoni? (Y/N): ");
		String pepperoni = input.next();
			
		System.out.println("Do you want Sausage? (Y/N): ");
		String sausage = input.next();
			
		System.out.println("Do you want Onion? (Y/N): ");
		String onion = input.next();
			
		System.out.println("Do you want Mushroom? (Y/N): ");
		String mushroom = input.next();
		
		
		
	

	
		System.out.println();
		System.out.println("Your order is as follows: ");
		System.out.println(size + "-inch pizza");
		
		//displays the crust type
		switch (pizzaType)
		{
		case 'H':
					System.out.println("Hand-tossed crust");
					break;
		case 'T':
					System.out.println("Thin-crust crust");
					break;
		case 'D':
					System.out.println("Deep-dish crust");
					break;
		default:
					System.out.println("Hand-tossed crust");
					break;
		}
	
		//displays the topping choices
		System.out.print("Cheese ");
		
		//This increases the order total by 1.25 each time a Y is input		
		if (pepperoni.equalsIgnoreCase("Y"))
		{
			toppingcounter++;
			System.out.print("Pepperoni ");
		}
		if (sausage.equalsIgnoreCase("Y"))
		{
			toppingcounter++;
			System.out.print("Sausage ");
		}
		if (onion.equalsIgnoreCase("Y"))
		{
			toppingcounter++;
			System.out.print("Onion ");
		}
		if (mushroom.equalsIgnoreCase("Y"))
		{
			toppingcounter++;
			System.out.print("Mushroom ");
		}
	
		//calculations for the order total
		double toppingsTotal = toppingcounter * 1.25;
		double orderTotal = 0 + toppingsTotal + pizzaSizeCost;
	
		//discount
		if(discount)
		{
			orderTotal -= 2;
		}
	
		double tax = .0795;
		double orderTax = orderTotal * tax;
		double total = orderTotal + orderTax;
	
		//displays the order details
		System.out.println();
		System.out.printf("The cost of your order is: $%.2f",orderTotal);
		System.out.println();
		System.out.printf("The tax is: $%.2f",orderTax);
		System.out.println();
		System.out.printf("The total due is: $%.2f",total);
		System.out.println();
		System.out.println("Your order will be ready for pickup in 30 minutes.");
		
	  }
}