package PassbyvalueandPassbyreference;

public class Entry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//pass by value
		Tree t=new Tree();
		int i=10;
	    t.method1(i);
		System.out.println(i);
		
		//pass by reference
		Fruit f=new Fruit();
		f.color="red";
		t.method2(f);
		System.out.println(f.color);
				

	}

}
