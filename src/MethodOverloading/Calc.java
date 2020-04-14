package MethodOverloading;

public class Calc {

	public int Add(int a,int b)
	{
		return a+b;
	}
	public double Add(double a,double b)
	{
		return a+b;
	}
	public float Add(int a ,float b)
	{
		return a+b;
	}
	public int Add(int a,int b ,int c)
	{
		return a+b+c;
	}
	public double Add(double a,double b,double c)
	{
		return a+b+c;
	}
	public double Add(int a,double b)
	{
		return a+b;
	}
	public double Add(double b,int  c)
	{
		return b+c;
	}
	public String Add(String s1,String s2)
	{
		return s1+s2;
	}
	public String Add(String s1,int b)
	{
		return s1+b;
	}
}
