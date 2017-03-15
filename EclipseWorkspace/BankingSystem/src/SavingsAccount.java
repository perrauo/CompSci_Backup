import java.io.*;
public class SavingsAccount extends BankAccount
{
	  /** Attribute:
     * monthly rate */
	private double rate; //defined on instantiation
	
	public SavingsAccount(double initialAmount, double rate) 
	{
		super(initialAmount); //initialize parent's inst. vars. through parent's constructor
		
	}


	/** calculates one month's interest and adds the amount to the balance
    */
	public void calculateInterest()
	{
		double balance = getBalance();
		//assuming it is a 30-day months
		balance = rate * balance; 
		
		//deposit the ammount
		this.deposit(balance);
		
	}
	
	 /** which returns a string representation of the account's attributes (balance and interest rate)
     * @return string representation of the account's attributes 
     */
	public String toString()
	{
		String s = "Balance: "+String.valueOf(this.getBalance())+", Rate: "+ String.valueOf(rate);
		
		return s;
	}
	
	/** accessor method for the interest rate
     * @return interest rate
     */
	public double getRate()
	{
		return rate;
	}
	
}

