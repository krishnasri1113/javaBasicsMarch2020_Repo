package Abstarct;

 abstract  class bank {
	abstract int getinterestrate();
     public bank() {
    	 System.out.println("bank constructor");
     }
}
 class sbi extends bank{

	int getinterestrate() {

		return 8;
	}
	 
 }
 class sbh extends bank{

	
	int getinterestrate() {
		// TODO Auto-generated method stub
		return 9;
	}
	 
 }
class banking
{
	public static void main(String[] args) {
	bank b=new sbi();
		System.out.println(b.getinterestrate());
	}
	
}