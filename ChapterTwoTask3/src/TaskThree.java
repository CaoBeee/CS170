/*
    Cao, Brian          
                        
    September 9, 2021    
    
    CS A170             
    Ch2 Coding Assignment
*/
//Task Three: Volume of a Sphere

public class TaskThree 
{

	public static void main(String[] args) 
	{
		//variables
		double formulaFracNum = 4;
		double formulaFracDenom = 3;
		int formulaRad = 5;
		double formulaPI = Math.PI;
		double sphereVolume = (formulaFracNum/formulaFracDenom * formulaPI * Math.pow(formulaRad, 3));

		System.out.print("The volume of a sphere when the radius is " + formulaRad + " is ");
		System.out.printf("%.3f", sphereVolume);
		
	}

}
