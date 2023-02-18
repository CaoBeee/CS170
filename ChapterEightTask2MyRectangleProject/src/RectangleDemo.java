/*                        
   Cao, Brian
                      
   November 23, 2021
                        
    CS A170
    Ch 8 Programming Assignment - Rectangle Project
*/

public class RectangleDemo 
{

	public static void main(String[] args) 
	{
	System.out.println("Box 1");
	System.out.println("***********************");
	Rectangle box1 = new Rectangle();
	box1.setLength(10);
	box1.setWidth(20);
	int Area1 = box1.getWidth() * box1.getLength();
	int Area2 = box1.getArea();
	int perimeter = box1.getPerimeter();
	box1.printDimensions();
	System.out.println("Area1 is: " + Area1 + " sq. ft.");
	System.out.println("Area2 is: " + Area2 + " sq. ft.");
	System.out.println("Perimeter is: " + box1.getPerimeter() + " ft.");
	
	System.out.println("***********************");
	
	System.out.println("Box 2");
	System.out.println("***********************");
	Rectangle box2 = new Rectangle(4,5);
	Area1 = box2.getWidth() * box1.getLength();
	Area2 = box2.getArea();
	perimeter = box2.getPerimeter();
	box2.printDimensions();
	System.out.println("Area1 is: " + Area1 + " sq. ft.");
	System.out.println("Area2 is: " + Area2 + " sq. ft.");
	System.out.println("Perimeter is: " + box2.getPerimeter() + " ft.");
	
	System.out.println("***********************");
	
	System.out.println("Box 3");
	System.out.println("***********************");
	Rectangle box3 = new Rectangle();
	box3.setLength(50);
	box3.setWidth(40);
	Area1 = box3.getWidth() * box3.getLength();
	Area2 = box3.getArea();
	perimeter = box3.getPerimeter();
	box3.printDimensions();
	System.out.println("Area1 is: " + Area1 + " sq. ft.");
	System.out.println("Area2 is: " + Area2 + " sq. ft.");
	System.out.println("Perimeter is: " + box3.getPerimeter() + " ft.");
	}
	
	

}
