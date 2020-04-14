package Abstarct;
abstract  class shape1 {
      abstract void draw();
      public shape1()
      {
    	  System.out.println("shape constructor is calling");
      }
      
      void draw3()
      {
    	  System.out.println("this is non static method");
      }
}
 class rectangle extends shape1{

	 void draw() {
		System.out.println("drawing rectangle");
		
	}
	 
 }
class circle extends shape1{

  void draw() {
		System.out.println("drawing circle");
		
	}
	
}
 public class shape {
	
	public static void main(String[] args) {
		shape1 s=new circle();
		s.draw();
		
	}
}

