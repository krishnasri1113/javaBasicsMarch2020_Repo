package Recursivefunction;

public class Sumof10naturalnumsusingrecursion {
              
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int number=10;
		int sum=Addnumbers(10);
		System.out.println(sum);

	}
	static int Addnumbers(int num)
	{
		if(num!=0)
			return num+Addnumbers(num-1);
		else
		return num;
		
	}

}
