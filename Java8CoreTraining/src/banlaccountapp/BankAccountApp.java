package banlaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Read a csv file then create a new accounts based on that data
		
		Checking chkacc1 = new Checking("Tom Wilson","321456789",1500,"checking"); 
		Savings savacc1=new Savings("D K","789465132",2000,"SAVINGS");
		
//		chkacc1.showInfo();
//		savacc1.showInfo();
//		savacc1.deposit(5000);
//		savacc1.withdraw(2000);
//		savacc1.transfer("brokrege", 2000);
		savacc1.compound();

	}

}
