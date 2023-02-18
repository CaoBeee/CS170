/*
 * Cao, Brian
 * 
 * October 5, 2021
 * 
 * CS A170
 * 
 * Exam One
 */

import java.util.Scanner;

public class BrianCaoYourCode
{
    public static Scanner console = new Scanner(System.in);

    public BrianCaoYourCode(){}
    
    public static void sectionA()
    {
        
        
        // 1) Declare a variable of type double named radius and initialize it to 10.
        double radius = 10;

        // 2) Declare a variable of type double named area1 and initialize it to
        // 3.1415 multiplied by the above radius squared. Use the variable defined above,
        // not a literal. (In other words, you are applying the formula for computing
        // area of a circle: AREA = PI x R x R.) 
        //Print area1
        double area1 = 3.1415 * (radius*radius); //radius * radius = radius^2
        System.out.println(area1);
        
        
        // 3) Declare variable of type double named area2. Calculate the area of a circle only using
        // components from the Math class. (you cannot use the literal 3.1415 in this equation.)
        double area2 = Math.PI * Math.pow(radius, 2);
        System.out.println(area2);
        
        // 4) Print your first name and last name to the screen on separate lines.
        // You can only use one statement to accomplish this task.
       //return carriage escape sequence
        System.out.println("Brian\rCao");
        
        // 5) Ask the user to enter a positive integer larger than zero and 
        // store it in an integer named myInt.
        System.out.println("Enter an integer larger than zero: ");
        int myInt = console.nextInt();
        

        
        // 6) Decrement myInt by 1.
        myInt--;
        
        // 7) Using an if/else statement, output a message that shows
        // whether the integer myInt is now an even number or an odd number.
        // (Note that this result will reflect the new value of myInt, not the
        //  original value typed by the user.)
       
        //if the integer divide by 2 = 0 then its even
        if (myInt % 2 == 0)
        {
        	System.out.println(myInt + " is an even number.");
        }
        else
        {
        	System.out.println(myInt + " is an odd number.");
        }
        
    }
   
    public static void sectionB()
    {
    	/*
    	 * Ask the user to enter their birth month in all caps and their birth day ( a number between 1-31
    	Based upon the birth month and day print a message telling the user the season they were born.

    	JANUARY, FEBRUARY,MARCH: You are born in the winter 
    	APRIL , MAY, JUNE: You are born in the spring
    	JULY, AUGUST, SEPTEMBER: You are born in the summer
    	OCTOBER, NOVEMBER, DECEMBER: You are born in the fall

    	Example 1.

    	    Enter birth day :     4

    	    Enter birth month (all CAPS) : MAY

    	    You were born in the Spring!

    	Your program should include the following:

    	Assume that all months have 1-31 days, anything outside this range should print the message "Day invalid!"
    	if an invalid month is input, print the message "Month invalid!"
    	if the input day in March, June, September, and December is on or after the 20th  go to the next season.
    	                       

    	Example 2:                                                                                                                                                                                                                                                                                  Enter birth day:  25

    	Enter month:  JUNE 

    	You were born in the Summer!   */
    	
    	System.out.println("Enter your birth day (a number between 1-31): ");
    	int birthDay = console.nextInt();
    	
    	System.out.println("Enter your birth month in all CAPS");
    	String birthMonth = console.next();
    	
    	
    	//setting booleans to go to else statement if birthday is less than 1 or greater than 0
    	if (birthDay > 0 && birthDay < 32)
    	{
    		if (birthMonth.equals("JANUARY") || birthMonth.equals("FEBRUARY") || birthMonth.equals("DECEMBER") && birthDay > 20 || birthMonth.equals("MARCH") && birthDay < 20)
    		{
    			System.out.println("You were born in the winter");
    		}
    		if (birthMonth.equals("APRIL") || birthMonth.equals("MAY") || birthMonth.equals("MARCH") && birthDay > 20 || birthMonth.equals("JUNE") && birthDay < 20)
    		{
    			System.out.println("You were born in the spring");
    		}
    		if (birthMonth.equals("JULY") || birthMonth.equals("AUGUST") || birthMonth.equals("JUNE") && birthDay > 20 || birthMonth.equals("SEPTEMBER") && birthDay < 20)
        	{
        		System.out.println("You were born in the summer");
        	}
    		if (birthMonth.equals("OCTOBER") || birthMonth.equals("NOVEMBER") || birthMonth.equals("SEPTEMBER") && birthDay > 20 || birthMonth.equals("DECEMBER") && birthDay < 20)
        	{
        		System.out.println("You were born in the fall");
        	}
    	}
    	//if birthday is 0 or greater than 31 return statement
    	else if (birthDay == 0 || birthDay > 31)
    		{
    		System.out.println("Invalid Day input!");
    		}	
    	
    		else
    		{
    			System.out.println("Invalid Month input!");
    		}
    	
    }

    
    
    public static void sectionC()
    {
        /*
         * Ask the user to enter a number between 1 and 5. If the user enters 1,
         * output the message "All alone." If the user enters 2 or 3, output the message
         * "Good company." If the user enters 4 or 5, output the message "Small crowd." For any
         * other number, output the message "Not in range."
         * Use a SWITCH statement.
         */
        
    	System.out.println("Enter a number between 1 and 5");
    	int number = console.nextInt();
    	
    	switch(number)
    	{
    	case 1:
    		System.out.println("All alone.");
    		break;
    	case 2:
    	case 3:
    		System.out.println("Good company.");
    		break;
    	case 4:
    	case 5:
    		System.out.println("Small crowd");
    		break;
    	default:
    		System.out.println("Not in range.");
    	}
    	   
    }
    
    
   
}// end of class
