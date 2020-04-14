package MethodOverloading;

public class calc1 {
	
	public int Add(int a ,int b)
	{
		return a+b;
		
	}
	public double Add(int a, double b)
	{
		return a+b;
	}
	public  double Add(double a,int b)
	{
		return a+b;
	}
	public boolean Add(boolean a,boolean b)
	{
		return true;
	}
	public char Add(char c1,String s2)
	{
		return c1;
	}
	public String Add(String s1,char c1)
	{
		return s1;
	}

}
