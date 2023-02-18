/*                        
   Cao, Brian
                      
   November 23, 2021
                        
    CS A170
    Ch 8 Programming Assignment - Car Project
*/

public class CarDemo 
{

	public static void main(String[] args) 
	{
		// Part A 
		Car AdamCar = new Car();
		Car SarahCar = new Car("Toyota", "Camry", "Silver",2021, 50, 100000);
		
		
		// Part B
		AdamCar.setMake("Honda");
		AdamCar.setModel("Civic");
		AdamCar.setColor("Black");
		AdamCar.setYear(2021);
		AdamCar.setSpeed(60);
		AdamCar.setPrice(50000);
		
		// Part C
		System.out.println(AdamCar.getColor());
		System.out.println(SarahCar.getColor());
		
		// Part D
		System.out.println("Adam's Car");
		AdamCar.displayFeatures();
		System.out.println("Sarah's Car");
		SarahCar.displayFeatures();
		
		// Part E
		AdamCar.accel();
		AdamCar.accel();
		SarahCar.brake();
		System.out.println(AdamCar.getSpeed());
		System.out.println(SarahCar.getSpeed());
		
		// Task #3
		Car AdamCar2 = AdamCar;
		System.out.println(AdamCar.getColor());
		System.out.println(AdamCar2.getColor());
		AdamCar.displayDealer();
	}
}