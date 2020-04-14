package Practice;
 class  compiletimepoly
 {
	public void test() 
	{
		System.out.println("test method is calling");
	}
	public void test(int a,int b)
	{
		System.out.println(a+b);
	}
 }
  class runtimepoly
  {
	   class baseclass
	  {
		 public void method()
		  {
			  System.out.println("baseclass method");
		  }
	  }
	   class derivedclass extends baseclass
	  {
		public  void method()
	  {
		  System.out.println("childclass method");
	  }
		  
	  }
	
  }




public class polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compiletimepoly cp=new compiletimepoly();
		cp.test();
		cp.test(10, 10);
		runtimepoly rp=new runtimepoly();
		//rp.method();
		//some code has to be done.
		
		

	}

}
