import java.util.Scanner;

public class SwitchOpeartorsUsingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Operator");
		 char Operator=in.next().charAt(0);
		 System.out.println("Enter num1");
		 int n1=in.nextInt();
		 System.out.println("Enter num2");
		 int n2=in.nextInt();
		 switch(Operator)
		 {
		 case '+':
			 System.out.println("Additio od n1 and n2 is:"+(n1+n2));
			 break;
		 case '-':
			 System.out.println("subtractionion of n1 and n2 is:"+(n1-n2));
			 break;
			 
		 case '*':
			 System.out.println("Multiplication of n1 and n2 is: "+(n1*n2));
			 break;
		 case '/':
			 System.out.println("Division of n1 and n2 is:"+(n1/n2));
			 break;
			 
			 default:
				 System.out.println("Please Enter valid Operatior");
				 break;
		 }
		 
		

	}

}
