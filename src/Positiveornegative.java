import java.util.Scanner;

public class Positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Scanner in=new Scanner(System.in);
           System.out.println("Enter the number");
           int num=in.nextInt();
           if(num>0)
           {
        	 System.out.println("Number is Positive num");  
           }
           else if(num<0)
           {
        	   System.out.println("Number is negative num");
           }
           else
           {
        	   System.out.println("Number is zero");
           }
           
	}

}
