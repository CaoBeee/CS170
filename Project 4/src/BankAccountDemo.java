/*                        
   Cao, Brian
   Lai, Allen
                      
   November 23, 2021
                        
    CS A170
    Project Four - Bank Account Project
*/

public class BankAccountDemo {

	public static void main(String[] args) 
	{	BankAccount AdamsAcc = new BankAccount();
			AdamsAcc.setBalance(500);
			AdamsAcc.setName("Adam");
			AdamsAcc.setAccountType('C');
			AdamsAcc.setInterestRate(0);
			AdamsAcc.displayAccountInfo();
			
			
		BankAccount SamsAcc = new BankAccount(1000, "Sam", 'C', 0);
		BankAccount LeilasAcc = new BankAccount(2000, "Leila", 'S', 3);
		
		System.out.println("The balance on Adam's account is: " + AdamsAcc.getBalance());
		System.out.println("The name on Sam's account is: " + SamsAcc.getName());
		System.out.println("The account type of Leila's account is: " + LeilasAcc.getAccountType());
		
		System.out.println("The interest rate of Sam's account is: " + SamsAcc.getInterestRate() + "%");
		System.out.println("The interest rate of Leila's account is: " + LeilasAcc.getInterestRate() + "%");
		
		AdamsAcc.withdraw(200);
		System.out.println("The new balance on Adam's account is: " + AdamsAcc.getBalance());
		AdamsAcc.deposit(2200);
		System.out.println("The new balance on Adam's account is: " + AdamsAcc.getBalance());
		
		SamsAcc.displayAccountInfo();
		AdamsAcc.transfer(SamsAcc, 500);
		
		System.out.println("The new balance on Adam's account is: " + AdamsAcc.getBalance());
		System.out.println("The new balance on Sam's account is: " + SamsAcc.getBalance());

		LeilasAcc.addInterest();
		SamsAcc.addInterest();
		SamsAcc.displayAccountInfo();
		LeilasAcc.displayAccountInfo();
		
		AdamsAcc.withdraw(99999999);
	}

}
