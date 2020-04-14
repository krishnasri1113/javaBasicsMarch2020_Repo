package Interface;

public class Accountentry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		currentaccount ca=new currentaccount();
		ca.withdrawamount(100);
		ca.makepayment(200);
		savingsaccount sa=new savingsaccount();
		sa.withdrawamount(200);
		sa.makepayment(100);
		

	}

}
