package PassbyvalueandPassbyreference;

public class passbyvalueandpassbyref {
	String bikename;
	void test(int a) {
		int i=50;
	}
  void test(passbyvalueandpassbyref b)
  {
	  b.bikename="honda";
  }
  
  public static void main(String[] args) {
	  int i=20;
	  passbyvalueandpassbyref b=new passbyvalueandpassbyref();
	  b.test(i);
	  System.out.println(i);
	  
	  b.bikename="pulsar";
	  b.test(b);
	  //b.bikename="pulsar";
	  System.out.println(b.bikename);
	
}
}
