package banlaccountapp;

public class Checking extends Account{

	//properties specific to the checking account
	int debitCardNumber;
	int debitCardPIN;
	//list methods specific to checking account
	
	public Checking(String name, String sSn, double initDeposit,String accountType) {
		super(name, sSn, initDeposit,accountType);
		setDebitCardNumber();
		setRate();
		
	}
	@Override
	public void setRate() {
				rate=getBaseRate()*.15;
				System.out.println("Implement rate for checking: "+rate);
	}
	public void showInfo() {
		super.showInfo();
	
	}
	private void setDebitCardNumber() {
		this.debitCardNumber=(int) (Math.random()*Math.pow(10, 12));
		this.debitCardPIN=(int) (Math.random()*Math.pow(10, 4));
		System.out.println("debitCardNumber: "+debitCardNumber);
		System.out.println("debitCardPIN: "+debitCardPIN);
		
	
	}
	
	
}
