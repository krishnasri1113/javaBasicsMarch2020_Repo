
public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   int num=150;
	   if(num>50)
	   {
		   System.out.println("number is grater then 50");
		   if(num>70)
		   {
			   System.out.println("num is grater than 70");
			   if(num>80)
			   {
				   System.out.println("number is grater than 80");
				   if(num>90)
				   {
					   System.out.println("number is grater than 90");
				   }
			   }
		   }
	   }
	   else
	   {
		   System.out.println("number is less than 90");
	   }
	}

}
