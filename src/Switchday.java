import java.util.Scanner;

public class Switchday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to print day: ");
		int day=sc.nextInt();
		sc.close();
		switch (day) {
		case 1: System.out.println("Today is Mon");
			break;
		case 2: System.out.println("Today is Tue");
		break;
		case 3: System.out.println("Today is Wed");
		break;
		case 4: System.out.println("Today is Thu");
		break;
		case 5: System.out.println("Today is Fri");
		break;
		case 6: System.out.println("Today is Sat");
		break;
		case 7: System.out.println("Today is Sun");
		break;
		default: System.out.println("Invalid entry!!");
		}

	}

}
