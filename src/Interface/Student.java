package Interface;

public class Student implements Idance,Isports {

	
	public void Activity() {
		System.out.println("I have implemented my own activity");
		System.out.println("i can play both sports and dance");
		System.out.println("i can play sports");
		
	}


	public void play() {
		System.out.println("i can play cricket");
		System.out.println(Isports.branchname);
		System.out.println(Idance.dancetype);
		

		
	}
	

	
	public void classicaldane() {
		System.out.println("i can dance classical songs also");
		
	}
	

}
