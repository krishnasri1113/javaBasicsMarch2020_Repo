package Collections;
import java.util.*;  
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class mapcollections {

	public static void main(String[] args) {
		String s1="santhu";
		String s2="chintu";
		System.out.println(s1.compareTo(s2));
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<>();
		//LinkedHashMap<Integer,String> hm=new LinkedHashMap<>();
		//TreeMap<Integer,String> hm=new TreeMap<>();
		

		hm.put(40,"santhu");
		hm.put(30, "chintu");
		hm.put(50, "srihan");
		for(String s:hm.values())
		{
			System.out.println(s);
		}
		

	}

}
