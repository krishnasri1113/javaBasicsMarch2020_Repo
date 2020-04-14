package ClassesandObjects;

public class Samplestaticandnonstatic {
       int a=10;
      
       static int b=20;
	public static void main(String[] args) {
       System.out.println(b);
       Samplestaticandnonstatic s1=new Samplestaticandnonstatic();
       System.out.println(s1.a);
       Samplestaticandnonstatic s2=new Samplestaticandnonstatic();
       s2.a=30;
       System.out.println(s2.a);
        s1.a=50;
       System.out.println(s1.a);
     int b=60;
       System.out.println(b);
       System.out.println(b);
       test(75,45);
        int c = 0 ;
       System.out.println(c);

	}
	private static void test(int a,int b)
	{
		int d=34;
		System.out.println(d);
		System.out.println(a);
		Samplestaticandnonstatic s1=new Samplestaticandnonstatic();
		System.out.println(s1.a);
		s1.a=80;
	   System.out.println(s1.a);
		System.out.println(b);
		
	}

}
