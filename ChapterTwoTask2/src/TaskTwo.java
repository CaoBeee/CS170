/*
    Cao, Brian          
                        
    September 9, 2021    
    
    CS A170             
    Ch2 Coding Assignment
*/
//Task Two: Math Equations

public class TaskTwo 
{
	public static void main(String[] args) 
	{
		short x = 2;
		double result1 = x * Math.pow(2,2); //pow method
		System.out.println("the result of equation 1 is " + result1);
		
		float y = -3.5f; //abs method
		float result2 = Math.abs(y);
		System.out.println("the result of equation 2 is " + result2);
		
		byte z = 16; //sqrt method
		double result3 = Math.sqrt(z);
		System.out.println("the result of equation 3 is " + result3);
		
		float a = 11111.12f, b = 22222.78f; //min, max, round method
		float result4 = Math.min(a, b);
		float result5 = Math.max(a, b);
		System.out.println("the result of equation 4 is " + result4 + " is less than " + result5);
		
		float total = (result4 + result5);
		long result6 = Math.round(total);
		System.out.println("The result of equation 5 is " + result6);
	}
}