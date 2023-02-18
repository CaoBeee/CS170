
import java.util.Scanner;
public class ExamTwo
{
   public static void main (String[]arg)
   {
      Scanner input = new Scanner(System.in);
      
     String[] stringArray = new String[5];
     
     for (int i = 0; i < stringArray.length; i++)
     {
        stringArray[i] = input.next();
     }
     
   converter(stringArray);
     
     
   }
   
   public static void converter (String[] array)
   {
      int[] numArray = new int[5];
      int avgCount = 0;
      int total = 0;
           
      for (int i = 0; i < array.length; i++)
      {
        numArray[i] = Integer.parseInt(array[i]);
      }
      
      for (int i = 0; i < numArray.length; i++)
      {
         if (numArray[i] > 4)
         {
            total += numArray[i];
            avgCount++;
         }
      }
      
      for (int arrayone : numArray) 
      {
    	  System.out.print(arrayone + " ");
      }
      System.out.println();
      if (avgCount == 0)
      {
    	  System.out.println("None of the values of your array are greater than 4");
      }
      else
      {
    	  System.out.println("The average of the numbers greater than 4 is: " + total/avgCount);
      }
      
    
      
      
   }
}