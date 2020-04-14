package Collections;

import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> alist=new ArrayList<>();
		alist.add("siri");
		alist.add("sai");
		alist.add("chintu");
		alist.add("srihan");
		System.out.println(alist);
		alist.add(2, "santhu");
		System.out.println(alist);

	//alist.clear();
	System.out.println(alist);

	}

}
