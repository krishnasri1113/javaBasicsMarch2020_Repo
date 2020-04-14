import java.util.Scanner;

public class NestedIf1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the Score");
		int score=in.nextInt();
		if(score>=35)
		{
			System.out.println("Passed");
			if(score>50)
			{
				System.out.println("Second Class");
				if(score>60)
				{
					System.out.println("First calss");
					if(score>70) {
						System.out.println("Distinction");
					}
					
				}
			}
		}
			else
			{
				System.out.println("Fail");
			}
		}

	

}
