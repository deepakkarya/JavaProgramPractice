package banlaccountapp;

public abstract class Account implements IBaseRate {
	//List common properties for checking and savings accounts
	String name;
	String sSn;
	String accountNumber;
	double balance;
	double rate;
	double initDeposit;
	static int index=10000;
	String accountType;
	double amount;
	
	//Constructor to set base properties and initialize the account
	
	//List of common methods
	
	public Account(String name,String sSn, double initDeposit, String accountType) {
		this.name=name;
		this.sSn=sSn;
		balance=initDeposit;
		index++;
		if (accountType.equalsIgnoreCase("savings")){this.accountNumber=1+setAccountNumber();}
		else if(accountType.equalsIgnoreCase("checking")){this.accountNumber=2+setAccountNumber();}
		//Set account number
		showInfo();
		System.out.println(getBaseRate());
		setRate();
			
	}
	public abstract void setRate();
	public void compound() {
		double accruedInterest=balance*(rate/100);
		System.out.println("Accrued Interest: $"+accruedInterest);
		balance=balance+accruedInterest;
		printBalance();
	}
	public void deposit(double amount) {
		
		balance = balance + amount;
		System.out.println("Depositing $ "+amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $ "+amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount ) {
		balance=balance-amount;
		System.out.println("Transferring $ "+amount+" to "+ toWhere);
		printBalance();
		
	}
	public void printBalance() {
		System.out.println("Your balance is now: $"+balance);
		
	}
	
	private String setAccountNumber() {
		String lastTwoSsn= sSn.substring(7,9);
		int uniqueID=index;
		int randomNumber=(int)(Math.random()*Math.pow(10, 3));
		
		return lastTwoSsn+uniqueID+randomNumber;
	}
	//list common methods
	public void showInfo() {
		//System.out.println("Index is: "+index);
	System.out.println("Name: "+name+" SSN: "+sSn+" Balance "+balance+" AccountNumber "+accountNumber);
//	if (accountNumber.startsWith("1")) {System.out.println("Account type is Savings ");}
//	else if (accountNumber.startsWith("2")) {System.out.println("Account type is Checkings ");}
	}
	
}
