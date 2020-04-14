
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int ivalue1=20,ivalue2=10;
		int Conditiontype=4;
		switch(Conditiontype)
		{
		case 1:
			System.out.println(ivalue1+ivalue2);
			break;
		case 2:
			System.out.println(ivalue1-ivalue2);
			break;
		case 3:
			System.out.println(ivalue1*ivalue2);
			break;
		case 4:
			System.out.println(ivalue1/ivalue2);
			break;
			default:
				System.out.println("Please enter valid operation");
				break;
		}

	}

}
