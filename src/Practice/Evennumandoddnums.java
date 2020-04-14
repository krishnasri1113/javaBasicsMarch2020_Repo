package Practice;

public class Evennumandoddnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1=1,num2=2,sumofprevtwo;
		System.out.println("odd nums");
		for(int i=0;i<10;i++)
		{
			System.out.print(num1+" ");
		     sumofprevtwo=num1+num2;
		    num1=sumofprevtwo;
		     
		}
		System.out.println();
		System.out.println("even nums");
		
		int num3=0,num4=2;
	    
	     for(int i=0;i<10;i++)
	     {
	     System.out.print(num3+" ");
	     sumofprevtwo=num3+num4;;
	     num3=sumofprevtwo;
	     }
		


	}

}
