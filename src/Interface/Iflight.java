package Interface;

public interface Iflight {
	void takeoff();
	void takedown();

}
class boeing implements Iflight{


	public void takeoff() {
		
		System.out.println("boeing flight is takingoff");
	}

	public void takedown() {
		
		System.out.println("boeing flight is landing");
	}
	
}
class airbus implements Iflight{


	public void takeoff() {
	
		System.out.println("airbus flight is takingoff");
	}


	public void takedown() {
	System.out.println("airbus flight is landing");
		
	}
	
}
