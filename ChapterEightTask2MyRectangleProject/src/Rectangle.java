/*                        
   Cao, Brian
                      
   November 23, 2021
                        
    CS A170
    Ch 8 Programming Assignment - Rectangle Project
*/

public class Rectangle 
{
	//instance variables
	private int length;
	private int width;
	
	//mutators
	public void setLength(int length)
	{
		this.length = length;
	}
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	//accessors
	public int getLength()
	{
		return length;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getArea()
	{
		int area = length*width;
		return area;
	}
	
	public int getPerimeter()
	{
		int perimeter = 2 * (length+width);
		return perimeter;
	}
	
	//part 2
	public Rectangle()
	{
		length = 0;
		width = 0;
	}
	
	public Rectangle(int length, int width)
	{
		this.length = length;
		this.width = width;
	}
	
	public void printDimensions()
	{
		System.out.println("The length is: " + length + " ft.");
		System.out.println("The width is: " + width + " ft.");
	}
}
