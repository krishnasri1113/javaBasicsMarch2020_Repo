package PassbyvalueandPassbyreference;

public class Entry1 {

	public static void main(String[] args) {
		Tree1 t =new Tree1();
		int i=20;
		t.method1(i);
		System.out.println(i);
		
		Fruit1 f=new Fruit1();
		//f.color="red";
		t.method2(f);
		f.color="green";
		System.out.println(f.color);
			
		}
	}


