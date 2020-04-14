package Abstarct;

 abstract public class bike1 {
	 public bike1()
	 {
		 System.out.println("bike cobstructor");
	 }
	abstract void run();
	void sound() {
		System.out.println("bike can sound");
	}

}
class honda extends bike1{


	void run() {
		System.out.println("honda is running");
		
	}
	
}
class pulsar extends bike1{
void run() {
		System.out.println("pulsar is running");
		
	}
	
}
class testabstraction{
	public static void main(String[] args) {
		bike1 b=new honda();
		b.run();
	}
}