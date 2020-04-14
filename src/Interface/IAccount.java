package Interface;

public interface IAccount {
	
	void withdrawamount(double amount);
	void makepayment(double amount);
	

}
class currentaccount implements IAccount {
	double balance=1000;
	double extrachrges;
	/*currentaccount(double balance)
	{
		System.out.println("current balance is "+balance);
	}*/
	public void withdrawamount(double amount) {
		
		System.out.println("Balance in current account is "+this.balance);
		System.out.println("with draw amount is "+amount);
		this.extrachrges=0.1*amount;
		this.balance=this.balance-this.extrachrges;
	    System.out.println("Extracharges are "+this.extrachrges);
		System.out.println("Remaining balance in current account is "+this.balance);
	
	}
	public void makepayment(double amount) {
		System.out.println("Make payment is "+amount);
		 this.balance=this.balance-amount;
		System.out.println("Remaining balance in current account after making the payment is "+this.balance);
		
	}

}
class savingsaccount implements IAccount{
      double balance=2000;

	public void withdrawamount(double amount) {
		System.out.println("Current balance in Savings Account is "+balance);
		System.out.println("Withdraw Amount is "+amount);
		this.balance=this.balance-amount;
		System.out.println("Remaining balance in Saving Account is "+this.balance);
		
	}

	
	public void makepayment(double amount) {
		System.out.println("Make Payment is "+amount);
		this.balance=this.balance-amount;
		System.out.println("Remaing balnce in Sanving acc after making tha payment "+this.balance);
		
	}
	
}

