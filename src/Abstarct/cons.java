package Abstarct;
class A
{
	A(){
		System.out.println("parent cons");
	}
}

public class cons extends A {
	cons()
	{
		System.out.println("child cons");
	}
	public static void main(String[] args) {
		//A a1=new A();
		cons c1=new cons();
	}
	

}
