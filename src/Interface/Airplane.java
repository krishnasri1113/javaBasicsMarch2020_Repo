package Interface;

public class Airplane {

	public static void main(String[] args) {
	  boeing b=new boeing();
	  System.out.println("----boeing flight----");
			b.takeoff();
			b.takedown();
			System.out.println("----airbus flight-----");
			airbus a=new airbus();
			a.takeoff();
            a.takedown();
	}

}
