package ClassesandObjects;

public class Car {

	int noOfdoors;
	int Maxspeed;
	String ModelName;
	 String color;
	static String fueltype="diesel";
	
	public void Startengine()
	{
		turnleft();
		SpecialFeature();
		fueltype="";//this is static variable
		color="";//this is non static variable
		 
	}
	public void turnleft()
	{
	 turnleft();
	  Startengine();//other non static method
	  SpecialFeature();//static method
	
	}
	public static void SpecialFeature()
	{
	
		System.out.println("special feature");
		fueltype="";
		
		
			}
}
