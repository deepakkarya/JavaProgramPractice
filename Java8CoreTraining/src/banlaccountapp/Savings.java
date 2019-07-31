package banlaccountapp;

public class Savings extends Account {
	
		//list properties specific to the savings account
	int safetyDepositBoxId;
	int safetyDepositBoxKey;
		//constructor to initialize settings for the savings properties
	
		//list properties specific to savings account
	public Savings(String name,String sSn, double initDeposit,String accountType) {
		super(name,sSn,initDeposit,accountType);
		setSafetyDepositBox();
		setRate();
		
	}
	public void showInfo() {
		super.showInfo();
		
		
		
	}
	private void setSafetyDepositBox() {
		safetyDepositBoxId=(int) (Math.random()*Math.pow(10, 3));
		safetyDepositBoxKey=(int) (Math.random()*Math.pow(10, 4));
		System.out.println("ID of safety deposit box is: "+this.safetyDepositBoxId);
		System.out.println("ID of safety deposit box is: "+this.safetyDepositBoxKey);
	}
	@Override
	public void setRate() {
		rate=getBaseRate()-.25;
		System.out.println("Implement rate for saving: "+rate);
	}

}
