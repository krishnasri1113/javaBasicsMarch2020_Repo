package ClassesandObjects;

public class CarMain {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		c1.color="Gray";
		c2.color="white";
		c1.Maxspeed=120;
		c2.Maxspeed=90;
		c1.ModelName="BMW";
		c2.ModelName="Audi Q7";
		c1.fueltype="diesel";
    System.out.println(c1.ModelName+" has "+c1.color+" color and Maxspeed is "+c1.Maxspeed+" "+c1.fueltype);
    System.out.println(c2.ModelName+" has "+c2.color+" color and Maxspeed is "+c2.Maxspeed+" "+c2.fueltype);
    c2.Maxspeed=150;
    Car.fueltype="petrol";
    //c1.fueltype="petrol";
    
    System.out.println("color1: "+c1.color+"\tMaxSpeed1:"+c1.Maxspeed+"\tModelName1:"+c1.ModelName+" "+Car.fueltype);
    System.out.println("color2:"+c2.color+"\tMaxSpeed2:"+c2.Maxspeed+"\tModelName2:"+c2.ModelName+" "+Car.fueltype);
		
     Car.SpecialFeature();
     c1.SpecialFeature();
     c1.turnleft();
     c2.turnleft();
     c1.Startengine();
     c2.Startengine();
     
	}

}
