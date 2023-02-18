/*                        
   Cao, Brian
   Lai, Allen
                      
   November 23, 2021
                        
    CS A170
    Project Four - Bank Account Project
*/

public class BankAccount 
{
	//instance variables
	private double balance;
	private String accName;
	private int accNum;
	private char accountType;
	private int interestRate;
	
	//static variable
	static int lastAccNum = 0;

//Constructors
public BankAccount()
{
	balance = 0;
	accName = "";
	accountType = ' ';
	interestRate = 0;
	lastAccNum++;
	accNum = lastAccNum;
}

public BankAccount(double balance, String accName, char accountType, int interestRate)
{
	this.balance = balance;
	this.accName = accName;
	this.accountType = accountType;
	this.interestRate = interestRate;
	lastAccNum++;
	accNum = lastAccNum;
}

//setters
public void setBalance (double balance)
{
	this.balance = balance;
}

public void setName (String accName)
{
	this.accName = accName;
}

public void setAccountType (char accountType)
{
	this.accountType = accountType;
}

public void setInterestRate (int interestRate)
{
	this.interestRate = interestRate;
}

//getters
public double getBalance()
{
	return balance;
}

public String getName()
{
	return accName;
}

public char getAccountType()
{
	return accountType;
}

public double getInterestRate()
{
	return interestRate;
}

public void withdraw(double amount)
{
	if (balance < amount)
	{
		throw new IllegalArgumentException("Not enough funds");
	}
	else
	{
		this.balance -= amount;
	}
}

public void deposit(double amount)
{
	this.balance += amount;
}

public void transfer(BankAccount obj, double transferAmount)
{
	if (balance < transferAmount)
	{
		throw new IllegalArgumentException("Not enough funds");
	}
	else 
	{
	this.balance -= transferAmount;
	obj.balance += transferAmount;
	}
}

public void displayAccountInfo()
{
	System.out.println("**********************************");
	System.out.println("The balance of this account is: " + balance);
	System.out.println("The name of this account is: " + accName);
	System.out.println("The account number is: " + accNum);
	System.out.println("The account type is: " + accountType);
	System.out.println("The interest rate is: " + interestRate);
	System.out.println("**********************************");
}

void addInterest()
{
	if(accountType == 'S')
	{
		double interest;
		interest = Financial.percentOf(interestRate, balance);
		balance += interest;
	}
}

}