package Abstarct;

abstract  public class Vehicle {//i have unimplemented and implemented methods here
	   int noofwheels;
	 static int noofdoors;
	 public static  final int  noofmirrors=4;//if it is final you can set the value here 
	 //you cant set in entry class
	 
	 abstract   void run() ;
	 abstract  void sound(); //i need to implement  this unimplemented methods in child class 

	 
	public  static void move()
	{
		System.out.println("vehicle is moving");
	}
	public void moving()
	{
		System.out.println("vehicle is moving on the road");
	}

}
