import java.util.ArrayList; 

/* REFACTORING NOTE: Normally this class should be abstract according to factory design pattern, however leaving it concrete to allow menu code to run */

public class CustomerAccount {
   
	protected String number;
	protected double balance;
	protected ArrayList<AccountTransaction> transactionList = new ArrayList<AccountTransaction>();

	//Blank Constructor
	public CustomerAccount()
	{
		this.number = "";
		this.balance = 0;
		this.transactionList = new ArrayList<>();
	}
	
	//Constructor with Details
	public CustomerAccount(String number, double balance, ArrayList<AccountTransaction> transactionList)
	{
		this.number = number;
		this.balance = balance;
		this.transactionList = transactionList;
	}
	
	//Accessor methods
	
	public String getNumber()
	{
		return this.number;
	}
	
	

	
	public double getBalance()
	{
		return this.balance;
	}
	
	public ArrayList getTransactionList()
	{
		return this.transactionList;
	}

	//Mutator methods
	public void setNumber(String number)
	{
		this.number = number;
	}
	
	public void setBalance(double balance)
	{
		this.balance = balance;
	}
	
	public void setTransactionList(ArrayList transactionList)
	{
		this.transactionList = transactionList;
	}
	
	public int getTotalTransactions() {
	    int total = 0;

	    for (AccountTransaction t : transactionList) {
	        total += t.getAmount();
	    }

	    return total;
	}
	
}
