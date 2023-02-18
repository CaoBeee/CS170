import java.util.Scanner;
public class lastNameFirst 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		lastNameFirst("Brian Cao");
		System.out.println(lastNameFirst("brian cao"));
	}
	

	public static String lastNameFirst(String name)
	   {
	    String result = "";
	    if(!name.contains(" "))
	    {
	    String firstOnly = name.substring(0);
	    return firstOnly;
	    }
	    else
	    {
	    String first = name.substring(name.lastIndexOf(" ")+1);
	    String last = name.substring(0, name.lastIndexOf(" "));
	    result =  first + ", " + last;
	    return result;
	   }
	}
}	