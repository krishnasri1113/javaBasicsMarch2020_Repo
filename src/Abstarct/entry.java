package Abstarct;

public class entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          // Vehicle v=new vehicle();//i cant create an object for the  abstract class
		bike b=new bike();
	    b.run();
		b.sound();
		bike.move();//move is static method i can call with class name
		b.moving();
		b.noofwheels=4;
		System.out.println("no of wheels for vehicle is "+b.noofwheels);
		bike.noofdoors=4;
		System.out.println("no of doors" +bike.noofdoors);
		System.out.println("no of mirrors "+bike.noofmirrors);
	}

}
