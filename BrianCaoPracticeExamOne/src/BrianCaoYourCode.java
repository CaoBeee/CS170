/*
 * Brian Cao
 * 
 * September 30, 2021
 * 
 * CS A170
 * 
 * Practice Exam One
 */

import java.util.Scanner;

public class BrianCaoYourCode
{
    public static Scanner console = new Scanner(System.in);

    public BrianCaoYourCode(){}
    
    public static void sectionA()
    {
       // Declare int variables x and y.
    	int x, y;
       
       
       // Initialize the int variable x to 10 and the int variable y to 2.
    	x = 10;
    	y = 2;
       
       
       // Declare and initialize a char variable ch to the letter B.
    	char ch = 'B';
       
       
       // Print out on the screen all three variables (x, y, and ch, in this order)
       // separated by a dash (-)
    	System.out.print(x + "-" + y + "-" + ch);
       
       
       // Update the value of the int variable x by adding 5 to it (use short form).
    	x = x + 5;
      
       
       // Swap the contents of the int variables x and y. 
       // (Declare additional variables if necessary.)
    	x = y;
    	y = x;
       
       
       // Print out on the screen variables x and y separated by a space.
    	System.out.print(x + " " + y);
       
               
    }
    
    public static void sectionB()
    {
      /*
        * Declare two double variables, sale and bonus, initialized to 0.
        * Ask the user to enter the sale amount and store it in the variable.
        * Write an IF/ELSE statement that assigns a value to bonus as follows: 
        * If sale is greater than $20,000, the value assigned to bonus 100; 
        * if instead sale is greater than $10,000 and less than or equal to $20,000, 
        * the value assigned to bonus is 50; otherwise, the value assigned to bonus is 0.
        * Print out the bonus.
        */
       double sale = 0;
       double bonus = 0;
       System.out.println("Enter the sale amount");
       sale = console.nextDouble();
       
       if (sale > 20000)
       {
    	   bonus = 100;
       }
       else if (sale > 10000 && sale <= 20000)
       {
       			bonus = 50;
       }
       else
       {
       			bonus = 0;
       }
       		System.out.println("The bonus is " + bonus);
       		
       
    }
    
    public static void sectionC()
    {
       /*
        * Ask the user to enter a score (5,4,3,2,1) and store it in an int variable
        * named score. Write a SWITCH statement that outputs "Successful!" when the scores
        * are 3, 4, and 5, "Unsuccessful." when the scores are 1 or 2, and "Invalid score."
        * when the given score is not in the range 1-5.
        */
       
     System.out.println("Enter a score (5,4,3,2,1)");
     int score = console.nextInt();
       switch (score)
       {
       case 3,4,5:
    	   System.out.println("Successful!");
       break;
       case 1,2:
    	   System.out.println("Unsuccessful.");
       break;
       default:
    	   System.out.println("Invalid score.");
       }
       
    }
    
           
    }// end of class  
       
       
    