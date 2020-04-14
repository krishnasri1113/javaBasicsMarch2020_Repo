package PassbyvalueandPassbyreference;

public class Entry2 {

	public static void main(String[] args) {
	   Tree2 t=new Tree2();
	    int i=30;
	    t.method1(i);
	   System.out.println(i);
	   
	   t.color="red";
	    t.method2(t);
	    //t.color="yellow";
	   System.out.println(t.color);
	    
	}

}
