/*
	Cao, Brian 
                        
    October 21, 2021
                        
    CS A170    
    Ch6 Task 5: String Arrays
*/

import java.util.ArrayList;
public class friendsArray 
{
	public static void main(String[] args) 
	{
		ArrayList<String> friends = new ArrayList<String>();
		
		friends.add("Carrie");
		friends.add("Bob");
		friends.add("Ali");
		friends.add("Sarah");
		friends.add("Ellen");
		friends.add(4, "Richard");
		friends.set(5, "Ellie");
		
		System.out.println("The last name on the list is: " + friends.get(5));
		friends.remove(0);
		System.out.println("The size of the list is: " + friends.size());
		for (String friendsList : friends)
		{
			System.out.print(friendsList+ " ");
		}
		System.out.println();
		System.out.println(friends);
		
	}

}
