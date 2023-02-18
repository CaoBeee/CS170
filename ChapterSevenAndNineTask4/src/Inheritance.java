/*
Cao, Brian

December 7, 2021

CS A170
Ch 7&9 Task 4: Inheritance
*/


class Human
{
	public void run() 
	{
		System.out.println("I can run.");
	}
}

class Warrior extends Human
{
	public void attack()
	{
		System.out.println("I can attack.");
	}
}
class Rogue extends Warrior
{
	public void hide() 
	{
		System.out.println("I can hide.");
	}
}

public class Inheritance 
{

	public static void main(String[] args) 
	{
		Rogue rogue = new Rogue();
		rogue.hide();
		rogue.attack();
		rogue.run();
	}
}
