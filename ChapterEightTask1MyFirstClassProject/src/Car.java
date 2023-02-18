/*                        
   Cao, Brian
                      
   November 23, 2021
                        
    CS A170
    Ch 8 Programming Assignment - Car Project
*/

public class Car 
{
	// Fields : Instance Variable
	private String make; 
	private String model;
	private String color;
	private int year;
	private int speed;
	private double price;
	
	// Task #3
	private static String dealer = "Car Max";
	
	static void displayDealer()
	{
		System.out.println(dealer);
	}
	
	//Constructors go here:
	public Car()
	{
		
	}
	
	public Car(String make, String model, String color, int year, int speed, double price)
	{
		this.make = make;
		this.model = model;
		this.color = color;
		this.year = year;
		this.speed = speed;
		this.price = price;
	}
	
	//Instance Methods
	public void accel()
	{
		speed += 10;
	}
	
	public void brake()
	{
		speed -= 10;
	}
	
	public void displayFeatures()
	
	{
		System.out.println("The make of this car is: " + make);
		System.out.println("The model of this car is: " + model);
		System.out.println("The year of this car is: " + year);
		System.out.println("The speed of this car is: " + speed);
		System.out.println("The price of this car is: " + price);
		System.out.println("The color of this car is: " + color);
	}
	//Mutator Methods (Setters)
	public void setModel(String model)
	{
	//Field Parameter	
		this.model = model;
	}
	
	public void setMake(String make)
	{
	//Field Parameter
		this.make = make;
	}
	
	public void setColor(String color)
	{
	//Field Parameter
		this.color = color;
	}
	
	public void setYear(int year)
	{
	//Field Parameter
		this.year = year;
	}

	public void setSpeed(int speed)
	{
	//Field Parameter
		this.speed = speed;
	}

	public void setPrice(double price)
	{
	//Field Parameter
		this.price = price;
	}
	
	//Accessor Methods (Getters)
	public String getMake()
	{
		return make;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public String getColor()
	{
		return color;
	}
	
	public String getModel()
	{
		return model;
	}

	public int getSpeed()
	{
		return speed;
	}

	public double getPrice()
	{
		return price;
	}
}