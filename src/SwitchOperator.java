
public class SwitchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char Operator='/';
		int ivalue1=80,ivalue2=10;
		switch(Operator)
		{
		case '+':
			System.out.println(ivalue1+ivalue2);
			break;
		case '-':
			System.out.println(ivalue1-ivalue2);
			break;
		case '*':
			System.out.println(ivalue1*ivalue2);
			break;
		case '/':
			System.out.println(ivalue1/ivalue2);
			break;
			
	      default:
	    	  System.out.println("Plase enter valid Operation");
			
		}

	}

}
